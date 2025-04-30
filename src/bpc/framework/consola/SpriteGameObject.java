package bpc.framework.consola;

import bpc.daw.consola.CapaSprites;
import bpc.daw.consola.Sprite;

import java.awt.*;

public abstract class SpriteGameObject extends GameObject{
    private Sprite sprite;
    private Image imagen;
    private Point puntoInicial;

    public SpriteGameObject(Image img,int x ,int y){
        throw new UnsupportedOperationException("Sin programar");
    }

    @Override
    public void inicializar(){
        throw new UnsupportedOperationException("Sin programar");
    }

    public int getX(){
        throw new UnsupportedOperationException("Sin programar");
    }

    public int getY(){
        throw new UnsupportedOperationException("Sin programar");
    }

    public int getAnchura(){
        throw new UnsupportedOperationException("Sin programar");
    }

    public int getAltura(){
        throw new UnsupportedOperationException("Sin programar");
    }

    public void moverX(int cx){
        throw new UnsupportedOperationException("Sin programar");
    }

    public void moverY(int cy){
        throw new UnsupportedOperationException("Sin programar");
    }

    public void setX(int x){
        throw new UnsupportedOperationException("Sin programar");
    }

    public void setY(int y){
        throw new UnsupportedOperationException("Sin programar");
    }
}
