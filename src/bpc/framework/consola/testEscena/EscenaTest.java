package bpc.framework.consola.testEscena;

public class EscenaTest {
    public static void main(String[] args) {
        EscenaTesteadora escena = new EscenaTesteadora();

        //comprobar que no está inicializado
        System.out.println("antes: "+escena.getTester().inicializado());

        escena.inicializar();
        System.out.println("despues: "+escena.getTester().inicializado());

        //Ejecutar 1253 frames
        for(int i = 0; i < 1253; i++){
            escena.ejecutarFrame();
        }

        //Comprobar contador
        System.out.println("FrameCounter: "+escena.getTester().frameCounter());

        //Comprobar que se finaliza
        escena.finalizar();
        System.out.println("final: "+escena.getTester().inicializado());


    }
}
