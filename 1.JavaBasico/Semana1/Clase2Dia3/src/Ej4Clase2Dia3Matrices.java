import java.util.Scanner;

public class Ej4Clase2Dia3Matrices {

    public static void main(String[] args) {
        int fila, asiento;
        String[][] asientos = new String[5][5];
        boolean finalizar = false;

        //mejor poner asientos.length para que si cambias arriba la signacion de filas y en el segundo for asientos[0].length para que tome la cantidad de asientos por columna
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                asientos[i][j] = "O";
            }
        }
        System.out.println("Plano asientos disponibles");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("[" +asientos[i][j]+"]");
            }
            System.out.println("");
        }

        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Introduzca la fila: Si quiere terminar el programa introduzca -1");
            fila = teclado.nextInt();
            if (fila == -1) break;
            System.out.println("Introduzca el asiento: ");
            asiento = teclado.nextInt();


            if (asientos[fila-1][asiento-1].equals("O")) {
                asientos[fila-1][asiento-1] = "X";
                System.out.println("\nHa realizado la reserva exitosamente");
                System.out.println("Plano asientos disponibles");
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        System.out.print(asientos[i][j]+" ");
                    }
                    System.out.println("\n");
                }
            }else{
                System.out.println("Elija otro asiento ese esta ocupado");
            }


        } while (!finalizar);



    }
}
