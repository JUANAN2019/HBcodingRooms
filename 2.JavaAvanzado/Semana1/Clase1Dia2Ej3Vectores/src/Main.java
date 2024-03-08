import javax.swing.text.AbstractDocument;
import java.sql.Array;
import java.util.ArrayList;


    public class Main {

        public static void main(String[] args) {
            metodosArray acceso = new metodosArray();
            int[] miArray = new int [5];
            miArray[0] = 1;
            miArray[1] = 2;
            miArray[2] = 3;
            miArray[3] = 4;
            miArray[4] = 5;
            acceso.leerElemento(miArray,6);


        }

    }
