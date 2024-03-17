import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;



public class Main {


    public static void main(String[] args) {

       List<Vehiculo> vehiculos = Arrays.asList(
               new Vehiculo("Ford", "Fiesta", 1000),
               new Vehiculo("Ford", "Focus", 1200),
               new Vehiculo("Ford", "Explorer", 2500),
               new Vehiculo("Fiat", "Uno", 500),
               new Vehiculo("Fiat", "Cronos", 1000),
               new Vehiculo("Fiat", "Torino", 1250),
               new Vehiculo("Chevrolet", "Aveo", 1250),
               new Vehiculo("Chevrolet", "Spin", 2500),
               new Vehiculo("Toyota", "Corolla", 1200),
               new Vehiculo("Toyota", "Fortuner", 3000),
               new Vehiculo("Renault", "Logan", 950)
       );

       List<Vehiculo> vehiculosPrecio = vehiculos.stream()
               .sorted(Comparator.comparing(Vehiculo::getCosto))
               .collect(Collectors.toList());
       vehiculosPrecio.forEach(System.out::println);


        System.out.println("POR MARCA Y POR PRECIO");
        List<Vehiculo> vehiculoMarcaPrecio = vehiculos.stream()
                .sorted(Comparator.comparing(Vehiculo::getMarca)
                        .thenComparing(Comparator.comparing(Vehiculo::getCosto)))
                .collect(Collectors.toList());
       vehiculoMarcaPrecio.forEach(System.out::println);
        System.out.println("precio no mayor 1000, precio mayor = 10000 y promedio todos vehiculos");

        List<Vehiculo> vehiculosMenosMil = vehiculos.stream()
            .filter(v -> v.getCosto()< 1000)
            .collect(Collectors.toList());
        vehiculosMenosMil.forEach(System.out::println);
        System.out.println("Vehiculos costo igual o mayor a 1000");
        List<Vehiculo> vehiculosMasMil = vehiculos.stream()
                .filter(v -> v.getCosto()>= 1000)
                .collect(Collectors.toList());
        vehiculosMasMil.forEach(System.out::println);
        System.out.println("Media coste vehiculos");
       vehiculos.stream()
                .mapToInt(Vehiculo::getCosto)
                .average()
                .ifPresent(CostoPromedio -> System.out.printf("El costo medio de un vehiculo es : %.2f\n",CostoPromedio));

    }


}
