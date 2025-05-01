package bpc.framework.consola;

import bpc.daw.consola.*;

public class Juego {
    private Consola consola;
    private Escena escena;
    private boolean detener;
    private Resolucion resolucion;

    public Juego(){

    }

    public void iniciar(Escena e,Resolucion r){
        this.consola=new Consola("Juego",r.getResolution().width,r.getResolution().height);
        this.resolucion=r;
        setEscena(e);
        this.detener=false;
        Teclado teclado= consola.getTeclado();
        CapaCanvas capaCanvas=consola.getCapaCanvas();
        while (!this.detener) {
            if (teclado.hayTeclaPulsada()) {
                if (teclado.teclaPulsada(27)) {
                    detener();
                }
            }

            capaCanvas.cls();

            this.escena.ejecutarFrame();

            try {
                Thread.sleep(13);
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        }
    }

    public Escena getEscena(){
        return this.escena;
    }

    public void setEscena(Escena e){
        this.escena=e;
        this.escena.juego=this;
        this.escena.consola=this.consola;
        this.escena.inicializar();

    }

    public void detener(){
        this.detener=true;
    }

    public int getAnchuraPantalla(){
        return this.resolucion.getResolution().width;
    }

    public int getAlturaPantalla(){
        return this.resolucion.getResolution().height;
    }

}
