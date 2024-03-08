import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {




        Operario op1 = new Operario("Juan", new EstacionDeTrabajo("Calidad"));
        Operario op2 = new Operario("Luis", new EstacionDeTrabajo("Ensamblar"));
        Operario op3 = new Operario("Pedro", new EstacionDeTrabajo("Empaquetar"));
        Operario op4 = new Operario("María", new EstacionDeTrabajo("Empaquetar"));
        Operario op5 = new Operario("Ana", new EstacionDeTrabajo("Calidad"));
        Operario op6 = new Operario("Carlos", new EstacionDeTrabajo("Ensamblar"));
        Operario op7 = new Operario("Marta", new EstacionDeTrabajo("Empaquetar"));
        Operario op8 = new Operario("David", new EstacionDeTrabajo("Calidad"));
        Operario op9 = new Operario("Laura", new EstacionDeTrabajo("Ensamblar"));
        Operario op10 = new Operario("Javier", new EstacionDeTrabajo("Empaquetar"));
        Operario op11 = new Operario("Irene", new EstacionDeTrabajo("Calidad"));
        Operario op12 = new Operario("Alberto", new EstacionDeTrabajo("Ensamblar"));
        Operario op13 = new Operario("Sara", new EstacionDeTrabajo("Empaquetar"));
        Operario op14 = new Operario("Daniel", new EstacionDeTrabajo("Calidad"));

        Thread ot1 = new Thread(op1);
        Thread ot2 = new Thread(op2);
        Thread ot3 = new Thread(op3);
        Thread ot4 = new Thread(op4);
        Thread ot5 = new Thread(op5);
        Thread ot6 = new Thread(op6);
        Thread ot7 = new Thread(op7);
        Thread ot8 = new Thread(op8);
        Thread ot9 = new Thread(op9);
        Thread ot10 = new Thread(op10);
        Thread ot11 = new Thread(op11);
        Thread ot12 = new Thread(op12);
        Thread ot13 = new Thread(op13);
        Thread ot14 = new Thread(op14);

        ot1.start();
        ot2.start();
        ot3.start();
        ot4.start();
        ot5.start();
        ot6.start();
        ot7.start();
        ot8.start();
        ot9.start();
        ot10.start();
        ot11.start();
        ot12.start();
        ot13.start();
        ot14.start();
    }
}
