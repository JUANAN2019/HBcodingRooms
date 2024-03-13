import java.sql.SQLOutput;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Empleado> empleados = List.of(
                new Empleado("Juan", 20000.0, "Desarrollador"),
                new Empleado("Pedro", 32000.0, "Desarrollador"),
                new Empleado("Luisa", 28000.0, "Desarrollador"),
                new Empleado("Ana", 31000.0, "Analista"),
                new Empleado("Santiago", 45000.0, "Analista"),
                new Empleado("Marta", 27000.0, "Analista"),
                new Empleado("Teresa", 43000.0, "Gerente"),
                new Empleado("Manuel", 45000.0, "Gerente"),
                new Empleado("Julian", 50000.0, "Gerente")
        );


        List<Empleado> empleadosSalario = empleados.stream()
                .filter(p -> p.getSalario() >35000.0)
                .collect(Collectors.toList());

        empleadosSalario.forEach(System.out::println);


         empleados.stream()
                .filter(e -> e.getCategoria().equalsIgnoreCase(("Gerente")))
                .mapToDouble(Empleado::getSalario)
                .average()
                .ifPresent(salarioPromedio -> System.out.printf("El salario promedio de gerente es : %.2f\n", salarioPromedio));



        Map<String, Double> salarioPromedioPorCategoria = empleados.stream()
                .collect(Collectors.groupingBy(Empleado::getCategoria, Collectors.averagingDouble(Empleado::getSalario)));


        salarioPromedioPorCategoria.forEach((categoria, salarioPromedio) -> {System.out.printf("%s: %.2f\n", categoria, salarioPromedio);});



        Optional<Empleado> empleadoConMayorSalario = empleados.stream()
                .max(Comparator.comparingDouble(Empleado::getSalario));

        empleadoConMayorSalario.ifPresent(emp ->
                System.out.println("El empleado con el salario más alto es: " + emp.getNombre() + " con un salario de: " + emp.getSalario()));




    }
}
