package bpc.framework.consola.testSprite;

import bpc.framework.consola.Juego;
import bpc.framework.consola.Resolucion;
import bpc.framework.consola.testSprite.EscenaTester;
import bpc.framework.consola.testSprite.SpriteTestetador;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class PruebaSprite {
    public static void main(String[] args) {
        try {
            Juego juego = new Juego();
            Image image = ImageIO.read(new File("nave.png"));
            SpriteTestetador sprite = new SpriteTestetador(image, 100, 100);
            juego.iniciar(new EscenaTester(sprite), Resolucion.VENTANA_VGA);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
