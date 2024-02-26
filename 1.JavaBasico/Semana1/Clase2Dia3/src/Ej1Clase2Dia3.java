import java.util.Scanner;

public class Ej1Clase2Dia3 {
    public static void main(String[] args) {

        int edad;
        System.out.println("Introduzca su edad: ");
        Scanner teclado = new Scanner(System.in);
        edad = teclado.nextInt();
        if(edad >= 18){
            System.out.println("Puede acceder al evento");
        }else{
            System.out.println("Usted no tiene la edad permitida para acceder al evento");
        }
    }
}
