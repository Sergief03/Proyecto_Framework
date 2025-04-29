package bpc.framework.consola;

import java.awt.*;

public enum Resolucion {
    PANTALLA_COMPLETA(Toolkit.getDefaultToolkit().getScreenSize()),
    VENTANA_4K(new Dimension(4096, 2160)),
    VENTANA_FULLHD(new Dimension(1920, 1080)),
    VENTANA_QHD(new Dimension(2560, 1440)),
    VENTANA_VGA(new Dimension(800, 600));

    private Dimension resolucion;
    // Constructor
    private Resolucion(Dimension r) {
        this.resolucion = r;
    }
    // Getter
    public Dimension getResolution() {
        return resolucion;
    }

    private static Dimension obtenerResolucionPantalla() {
        return Toolkit.getDefaultToolkit().getScreenSize();
    }
}
