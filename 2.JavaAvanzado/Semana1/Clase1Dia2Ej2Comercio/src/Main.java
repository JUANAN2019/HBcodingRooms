import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nombre;
        double precio = 0;
        int cantidad = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdúzaca el nombre del producto: ");
        nombre = scanner.nextLine();

// Validación básica del precio
        while (true) {
            System.out.println("Introduzca el precio: ");
            String precioStr = scanner.nextLine();

            try {
                precio = Double.parseDouble(precioStr);
                break;
            } catch (NumberFormatException e) {
                System.out.println("El dato introducido no es un número válido. Debe ser un número decimal.");
            }
        }

// Validación básica de la cantidad
        while (true) {
            System.out.println("Introduzca la cantidad: ");
            String cantidadStr = scanner.nextLine();

            try {
                cantidad = Integer.parseInt(cantidadStr);
                break;
            } catch (NumberFormatException e) {
                System.out.println("El dato introducido no es un número válido. Debe ser un número entero.");
            }
        }
        try {
            Inventario inventario = new Inventario();
            inventario.agregarProducto(new Producto(nombre, precio, cantidad));
        } catch (Exception e) {
            System.out.println("Se produjo un error al agregar el producto: " + e.getMessage());
        }
    }
}
