package bpc.framework.consola.testSprite;

import bpc.framework.consola.GameObject;
import bpc.daw.consola.CapaTexto;
import bpc.daw.consola.Sprite;
import bpc.daw.consola.Teclado;

import java.awt.*;

public class SpriteTestetador extends GameObject {
    private Image imagen;
    private int x, y;
    private Sprite sprite;

    public SpriteTestetador(Image imagen, int x, int y){
        this.imagen = imagen;
        this.x = x;
        this.y = y;
    }

    @Override
    public void inicializar() {
        Rectangle rectangle=new Rectangle(imagen.getWidth(null),imagen.getHeight(null));
        this.sprite=this.consola.getCapaSprites().crearSprite(imagen,rectangle,x,y);

    }

    @Override
    public void ejecutarFrame() {
        Teclado teclado=this.consola.getTeclado();
        teclado.setTipoCursor(Teclado.CURSOR_NULO);
        CapaTexto capaTexto=this.consola.getCapaTexto();
        capaTexto.cls();
        char tecla=teclado.leerCaracter();
        if (tecla=='w') {
            this.sprite.moverY(-3);
        }
        if (tecla=='a') {
            this.sprite.moverX(-3);
        }
        if (tecla=='s') {
            this.sprite.moverY(3);
        }
        if (tecla=='d') {
            this.sprite.moverX(3);
        }

    }

    @Override
    public void finalizar() {

    }
}
