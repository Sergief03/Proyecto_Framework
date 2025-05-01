package bpc.framework.consola;

import bpc.daw.consola.CapaSprites;
import bpc.daw.consola.Sprite;

import java.awt.*;

public abstract class SpriteGameObject extends GameObject{
    private Sprite sprite;
    private Image imagen;
    private Point puntoInicial;

    public SpriteGameObject(Image img,int x ,int y){
        this.imagen=img;
        this.puntoInicial=new Point(x,y);
    }

    @Override
    public void inicializar(){
        CapaSprites capaSprites=this.consola.getCapaSprites();
        Rectangle rectangle=new Rectangle(getAnchura(),getAltura());
        this.sprite= capaSprites.crearSprite(this.imagen,rectangle, this.puntoInicial.x,this.puntoInicial.y);
    }

    public int getX(){
        return this.sprite.getX();
    }

    public int getY(){
        return this.sprite.getY();
    }

    public int getAnchura(){
        return this.imagen.getWidth(null);
    }

    public int getAltura(){
        return this.imagen.getHeight(null);
    }

    public void moverX(int cx){
        this.sprite.moverX(cx);
    }

    public void moverY(int cy){
        this.sprite.moverY(cy);
    }

    public void setX(int x){
        moverX(x-this.sprite.getX());
    }

    public void setY(int y){
        moverY(y-this.sprite.getY());
    }
}
