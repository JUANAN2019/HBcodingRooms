public class Main {
    public static void main(String[] args) {


        RegistroMascotas<Mascota> registroMascotas = new RegistroMascotas<>();
        registroMascotas.agregarMascota(new Perro("0001", "Ernesto", 5, "Perro"));
        registroMascotas.agregarMascota(new Perro("0002", "Pupy", 6, "Perro"));

        registroMascotas.agregarMascota(new Gato("0003", "Bruma", 2, "Gato"));
        registroMascotas.agregarMascota(new Gato("0004", "Luis", 5, "Gato"));

        registroMascotas.agregarMascota(new Ave("0005", "Tomas", 4, "Tucan"));
        registroMascotas.agregarMascota(new Ave("0006", "Julio", 9, "Loro"));

        registroMascotas.agregarMascota(new Reptil("0007","Juancho", 3, "Cocodrilo"));
        registroMascotas.agregarMascota(new Reptil("0008","Felipe", 1, "Lagarto"));


        registroMascotas.buscarMascota("Perro");
        registroMascotas.contarMascotas();

        registroMascotas.agregarMascotaAleatoria();
        registroMascotas.agregarMascotaAleatoria();


    }

}
