public class Main {
    public static void main(String[] args) {

        Vuelo miVuelo = new Vuelo(5, 1);

        Usuario usuario1 = new Usuario("Juan", "Madrid", new Fecha(02,10,2024),4 );

        try {
            usuario1.realizarReserva(miVuelo);
            System.out.println("Reserva realizada correctamentre");
        } catch (ReservaInvalidadaException e) {
            throw new RuntimeException(e);
        }
    }
}
