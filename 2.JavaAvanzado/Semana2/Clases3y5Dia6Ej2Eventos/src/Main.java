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





//        public static void buscarEventoCategoria(){
            //System.out.println("Estoy en el metodo");
//            List<Evento> eventosReunion = eventos.stream()
//                    .filter(e -> e.getCategoria().equalsIgnoreCase("Reunion"))
//                    .collect(Collectors.toList());
//            List<Evento> eventosTaller = eventos.stream()
//                    .filter(e -> e.getCategoria().equalsIgnoreCase("Taller"))
//                    .collect(Collectors.toList());
//            List<Evento> eventosConferencia = eventos.stream()
//                    .filter(e -> e.getCategoria().equalsIgnoreCase("Conferencia"))
//                    .collect(Collectors.toList());

//            Optional<List<Evento>> optionalEventos = Optional.ofNullable(eventosReunion);
//
//            optionalEventos.ifPresentOrElse(
//                    events -> {
//                        System.out.println("Se encontraron " + eventos.size() + " eventos de la categoría  Reunion" );
//                        eventos.forEach(System.out::println);
//                    },
//                    () -> System.out.println("No se encontraron eventos de la categoría Reunion" )
//            );
        }

    public  void  agruparPorCategoria() {
        List<Evento> eventos = eventos.stream()
        List<Evento> eventosReunion = eventos.stream()
                    .filter(e -> e.getCategoria().equalsIgnoreCase("Reunion"))
                    .collect(Collectors.toList());
            List<Evento> eventosTaller = eventos.stream()
                    .filter(e -> e.getCategoria().equalsIgnoreCase("Taller"))
                    .collect(Collectors.toList());
            List<Evento> eventosConferencia = eventos.stream()
                    .filter(e -> e.getCategoria().equalsIgnoreCase("Conferencia"))
                    .collect(Collectors.toList());

    }

}

