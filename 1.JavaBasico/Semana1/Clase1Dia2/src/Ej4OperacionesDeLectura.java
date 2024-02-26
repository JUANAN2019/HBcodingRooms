import java.util.Scanner;

public class Ej4OperacionesDeLectura {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce dos numeros, con los cuales vamos a realizar las operaciones de suma, resta, multiplicacion y division");
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();

        while(num2 ==0){
            System.out.println("El segundo numero no puede ser 0, introduzca otro numero");
            num2 = teclado.nextInt();
        }
        System.out.println("El resultado de la suma es: "+num1 + num2);
        System.out.println("El resultado de la resta es: "+(num1 - num2));
        System.out.println("El resultado de la multiplicacion es: "+num1 * num2);
        System.out.println("El resultado de la division es: "+num1/num2);

        //Qué sucede si como segundo número de una división se ingresa 0? Que el resultado de infinito
        // Con lo que sabes o aprendiste hasta ahora…¿De qué manera tratarías de evitar ésta situación? pidiendo al usuario que el valor del segundo numero sea diferente a 0 o asignando un valor por defecto al segundo numero diferente a 0,
        // Yo lo he solucionado con el while, asi hasta que el usuario no introduzca un numero diferente a 0 el programa no se termina de ejecutar.
    }
}
