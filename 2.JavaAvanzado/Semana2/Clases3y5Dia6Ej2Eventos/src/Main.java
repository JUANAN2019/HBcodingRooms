import java.time.LocalDate;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        List<Evento> eventos = Arrays.asList(
                new Evento("Daily", LocalDate.of(2024, 2, 2), "Reunion"),
                new Evento("Weekly", LocalDate.of(2024, 3, 14), "Taller"),
                new Evento("Daily", LocalDate.of(2024, 5, 25), "Reunion"),
                new Evento("Monthly", LocalDate.of(2024, 4, 1), "Conferencia"),
                new Evento("Monthly", LocalDate.of(2024, 4, 1), "Reunion"),
                new Evento("Daily", LocalDate.of(2024, 5, 25), "Reunion"),
                new Evento("Weekly", LocalDate.of(2024, 6, 12), "Taller"),
                new Evento("Monthly", LocalDate.of(2024, 7, 10), "Conferencia")
        );



        List<Evento> eventoPorFecha = eventos.stream()
                .filter(e -> e.getFecha().equals(LocalDate.of(2024, 4, 1)))
                .toList();

        eventoPorFecha.forEach(System.out::println);





            long eventosReunion = eventos.stream()
                    .filter(e -> e.getCategoria().equalsIgnoreCase("Reunion"))
                    .count();
        System.out.println("Los eventos de la categoria Reunion son: " + eventosReunion);
            long eventosTaller = eventos.stream()
                    .filter(e -> e.getCategoria().equalsIgnoreCase("Taller"))
                    .count();
        System.out.println("Los eventos de la categoria Taller son: " + eventosTaller);
            long eventosConferencia = eventos.stream()
                    .filter(e -> e.getCategoria().equalsIgnoreCase("Conferencia"))
                    .count();
        System.out.println("Los eventos de la categoria Reunion son: " + eventosConferencia);

        Optional<Evento> eventoProximo = eventos.stream()
                .filter(evento -> evento.getFecha().isAfter(LocalDate.now()))
                .min((e1, e2) -> e1.getFecha().compareTo(e2.getFecha()));

        System.out.println("El evento mas proximo es : " + eventoProximo);

        }



}

