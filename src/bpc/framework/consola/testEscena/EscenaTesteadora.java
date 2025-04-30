package bpc.framework.consola.testEscena;

import bpc.framework.consola.Escena;

public class EscenaTesteadora extends Escena {
    private GameObjectTesteador tester;

    public EscenaTesteadora() {
        tester = new GameObjectTesteador();
    }

    public GameObjectTesteador getTester() { return tester; }

    @Override
    protected void añadirObjetosIniciales() {
        añadir(tester);
    }


}
