import java.util.Scanner;

public class Ej2Clase2Dia3 {
    public static void main(String[] args) {

        double precio ;
        double total = 0;
        System.out.println("Introduzca el precio de los productos que ha cogido, cuando desee finalizar la compra introduzca el 0 como valor de producto");
        Scanner teclado = new Scanner(System.in);

        precio = teclado.nextInt();

        while(precio != 0){
            total += precio;
            precio = teclado.nextInt();
        }

        System.out.println("Ha finalizado su compra, y el total de esta asciende a: "+total);


    }
}
