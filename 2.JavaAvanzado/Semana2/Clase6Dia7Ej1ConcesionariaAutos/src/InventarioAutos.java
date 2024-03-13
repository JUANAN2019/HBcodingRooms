import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class InventarioAutos<T extends Auto> {

    private List<T> autos;

    public InventarioAutos() {
        this.autos = new ArrayList<>();
    }

    public void agregarAuto(T auto) {
        autos.add(auto);
        System.out.println("Auto agregado al inventario: " + auto.toString());
    }

    public void buscarAutoAño(int año) {
        List<T> autosEncontrados = autos.stream()
                .filter(a -> a.getAño() == año)
                .collect(Collectors.toList());
        Optional<List<T>> optionalAutos = Optional.ofNullable(autosEncontrados);

        optionalAutos.ifPresentOrElse(
                autos -> {
                    // Procesar la lista de autos encontrados
                    System.out.println("Se encontraron " + autos.size() + " autos del año  " + año);
                    autos.forEach(auto -> {
                        System.out.println(auto.toString());
                    });
                },
                () -> {
                    // No se encontraron autos
                    System.out.println("No se encontraron autos del año" + año);
                }
        );
    }

    public void buscarAutoMarca(String marca) {
        List<T> autosEncontrados = autos.stream()
                .filter(a -> a.getMarca() == marca)
                .collect(Collectors.toList());
        Optional<List<T>> optionalAutos = Optional.ofNullable(autosEncontrados);

        optionalAutos.ifPresentOrElse(
                autos -> {
                    // Procesar la lista de autos encontrados
                    System.out.println("Se encontraron " + autos.size() + " autos de la marca  " + marca);
                    autos.forEach(auto -> {
                        System.out.println(auto.toString());
                    });
                },
                () -> {
                    // No se encontraron autos
                    System.out.println("No se encontraron autos de la marca" + marca);
                }
        );
    }

    public void calcularValorTotal() {
        double valor = autos.stream()
                .mapToDouble(Auto::getPrecio)
                .sum();

        System.out.println("El valor total del inventario es : " + valor);
        ;
    }
}
