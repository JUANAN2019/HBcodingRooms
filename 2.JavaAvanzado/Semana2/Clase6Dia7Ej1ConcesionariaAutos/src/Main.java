public class Main {

    public static void main(String[] args) {

        InventarioAutos<Auto> inventario1 = new InventarioAutos<>();
        inventario1.agregarAuto(new Auto("Seat", "Leon", 22000, 2020));
        inventario1.agregarAuto(new Auto("Fiat", "Tipo", 18000, 2012));
        inventario1.agregarAuto(new Auto("Opel", "Astra", 21000, 2015));
        inventario1.agregarAuto(new Auto("Seat", "Toledo", 20000, 2012));
        inventario1.agregarAuto(new Auto("Fiat", "Bravo", 18000, 2012));
        inventario1.agregarAuto(new Auto("Opel", "Vectra", 21000, 2015));


        inventario1.buscarAutoAño(2012);
        inventario1.buscarAutoAño(2050);

        inventario1.buscarAutoMarca("Seat");
        inventario1.buscarAutoMarca("Mercedes");

        inventario1.calcularValorTotal();

    }
}
