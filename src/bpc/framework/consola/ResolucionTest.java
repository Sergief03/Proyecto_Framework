package bpc.framework.consola;

import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class ResolucionTest {
    @Test
    public void Test1(){
        Dimension[] dimensiones = {
                new Dimension(4096, 2160),
                new Dimension(1920, 1080),
                new Dimension(2560, 1440),
                new Dimension(800, 600)
        };

        Resolucion[] resoluciones = {
                Resolucion.VENTANA_4K,
                Resolucion.VENTANA_FULLHD,
                Resolucion.VENTANA_QHD,
                Resolucion.VENTANA_VGA
        };

        for (int i = 0;i<dimensiones.length;i++){
            assertEquals(dimensiones[i], resoluciones[i].getResolution());
        }
    }
}