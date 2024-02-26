import java.util.Scanner;

public class Ej3Clase2Dia3 {
    public static void main(String[] args) {
        double[] temperaturas = new double[7];
        double temperaturaTotal = 0;

        System.out.println("Introduzca las temperaturas maximas de los ultimos siete dias:");
        Scanner teclado = new Scanner(System.in);
        for(int i = 0; i < 7; i++){

            temperaturas[i] = teclado.nextDouble();
            temperaturaTotal += temperaturas[i];

        }
        for(int i = 0; i < 7; i++){

            System.out.println("Dia "+ (i+1) +". Temperatura: " +temperaturas[i]);
        }

        System.out.printf("La temperatura media ha sido: %.1f" ,(temperaturaTotal/7));
    }
}
