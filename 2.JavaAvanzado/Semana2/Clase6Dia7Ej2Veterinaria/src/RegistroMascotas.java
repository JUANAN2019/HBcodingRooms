import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

public class RegistroMascotas <T extends Mascota>{

    private List<Mascota> mascotas;
    private static final String[] NOMBRESMASCOTA = {"Toby", "Max", "Luna", "Bella", "Rocky"};
    private static final String[] ESPECIES = {"Perro", "Gato", "Reptil", "Ave"};
    public RegistroMascotas(){
        this.mascotas = new ArrayList<>();
    }




    public void agregarMascota(T mascota){
        mascotas.add(mascota);
        System.out.println("Mascota agregada al registro: " +mascota.toString());
    }


    public void buscarMascota(String especie) {
        List<Mascota> mascotasEncontradas = mascotas.stream()
                .filter(m -> m.getEspecie() == especie)
                .collect(Collectors.toList());
        Optional<List<Mascota>> optionalMascotas = Optional.ofNullable(mascotasEncontradas);

        optionalMascotas.ifPresentOrElse(
                mascotas -> {
                    // Procesar la lista de autos encontrados
                    System.out.println("Se encontraron " + mascotas.size() + " mascotas de la especie  " + especie);
                    mascotas.forEach(m -> {
                        System.out.println(m.toString());
                    });
                },
                () -> {
                    // No se encontraron autos
                    System.out.println("No se encontraron mascotas de la especie" + especie);
                }
        );
    }
    public void contarMascotas(){
        long  mascotasEncontradas = mascotas.stream()
                .count();

        System.out.println("El numero de mascotas registradas es " +mascotasEncontradas);
    }

    public void agregarMascotaAleatoria() {
        Random random = new Random();

        String nombre = NOMBRESMASCOTA[random.nextInt(NOMBRESMASCOTA.length)];
        int edad = random.nextInt(10) + 1;
        String especie = ESPECIES[random.nextInt(ESPECIES.length)];

        Mascota mascota = (Mascota) new Mascota(obtenerIdMasAlto(),nombre, edad, especie);
        mascotas.add(mascota);

        System.out.println("Mascota agregada al registro: " + mascota.toString());
    }

    public String obtenerIdMasAlto() {
        if (mascotas.isEmpty()) {
            return "0000";
        }

        int idMax = Integer.parseInt(mascotas.get(0).getId());
        for (Mascota mascota : mascotas) {
            int idActual = Integer.parseInt(mascota.getId());
            if (idActual > idMax) {
                idMax = idActual;
            }
        }

        return String.format("%04d", idMax + 1);
    }
}
