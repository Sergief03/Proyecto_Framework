package bpc.framework.consola.testSprite;

import bpc.framework.consola.Escena;
import bpc.framework.consola.GameObject;

public class EscenaTester extends Escena {
    private GameObject tester;

    public EscenaTester(GameObject t){
        this.tester=t;
    }

    public GameObject getTester(){
        return this.tester;
    }

    @Override
    protected void añadirObjetosIniciales() {
        this.añadir(this.tester);
    }
}
