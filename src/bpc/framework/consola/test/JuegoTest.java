package bpc.framework.consola.test;

import bpc.framework.consola.Escena;
import bpc.framework.consola.Juego;
import bpc.framework.consola.Resolucion;
import bpc.framework.consola.testEscena.EscenaTesteadora;
import org.junit.Test;

import static org.junit.Assert.*;

public class JuegoTest {
    @Test
    public void test(){
        Juego juego = new Juego();
        EscenaTesteadora escena = new EscenaTesteadora();

        // Ejecutar el juego en un hilo aparte
        Thread juegoThread = new Thread(() -> juego.iniciar(escena, Resolucion.VENTANA_VGA));
        juegoThread.start();

        try {
            // Esperar 2 segundos mientras el juego corre
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Detener el juego
        juego.detener();

        try {
            // Esperar a que termine el hilo del juego
            juegoThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (juego.getEscena() instanceof EscenaTesteadora test){
            System.out.println(test.getTester().frameCounter());
            boolean comprendido=test.getTester().frameCounter()>=110&&test.getTester().frameCounter()<=130;
            assertTrue(comprendido);
        }
    }

}