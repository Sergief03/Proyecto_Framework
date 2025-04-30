package bpc.framework.consola;

import bpc.daw.consola.Consola;

import java.util.ArrayList;
import java.util.List;

public abstract class Escena implements ElementoJuego{
    protected Juego juego;
    protected Consola consola;
    private List<GameObject> objetos;

    public Escena(){}
    @Override
    public void inicializar(){
       // if (this.consola==null|this.juego==null){
         //   throw new IllegalStateException("hay que añadir la escena al juego para poder inicializarla");
        //}

        this.objetos=new ArrayList<>();
        añadirObjetosIniciales();
    }
    protected abstract void añadirObjetosIniciales();
    public void añadir(GameObject obj){
        obj.juego=this.juego;
        obj.consola=this.consola;
        obj.escena=this;
        this.objetos.add(obj);
        obj.inicializar();
    }
    public void retirar(GameObject obj){
        obj.finalizar();
        this.objetos.remove(obj);
        this.consola=null;
        this.juego=null;
    }

    @Override
    public void ejecutarFrame(){
        for (int i=0;i<objetos.size();i++){
            this.objetos.get(i).ejecutarFrame();
        }
    }
    @Override
    public void finalizar(){
        this.objetos.removeAll(this.objetos);
    }

}
