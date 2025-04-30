package bpc.framework.consola.testEscena;

import bpc.framework.consola.GameObject;

public class GameObjectTesteador extends GameObject {
    private boolean inicializado;
    private int frameCounter;

    public GameObjectTesteador() {
        inicializado = false;
        frameCounter = 0;
    }
    public boolean inicializado() { return inicializado; }
    public int frameCounter() { return frameCounter; }

    @Override
    public void inicializar() {
        inicializado = true;
    }

    @Override
    public void ejecutarFrame() {
        frameCounter++;
    }

    @Override
    public void finalizar() {
        inicializado = false;
    }

}
