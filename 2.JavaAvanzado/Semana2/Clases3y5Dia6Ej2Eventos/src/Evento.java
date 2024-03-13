import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Evento {

    private String nombre;
    private LocalDate fecha;
    private String categoria;

    private List<Evento> eventos ;
    public Evento(String nombre, LocalDate fecha, String categoria) {
        this.nombre    = nombre;
        this.fecha     = fecha;
        this.categoria = categoria;
    }
    public void addEvento(List<Evento> eventos) {
        eventos.add(this);
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(List<Evento> eventos) {
        this.eventos = eventos;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "nombre='" + nombre + '\'' +
                ", fecha=" + fecha +
                ", categoria='" + categoria + '\'' +
                '}';
    }
    public  void buscarEventoCategoria( ) {
        List<Evento> eventosEncontrados = eventos.stream()
                .filter(e -> e.getCategoria().equals(categoria))
                .collect(Collectors.toList());

        Optional<List<Evento>> optionalEventos = Optional.ofNullable(eventosEncontrados);

        optionalEventos.ifPresentOrElse(
                events -> {
                    System.out.println("Se encontraron " + eventos.size() + " eventos de la categoría " + categoria);
                    eventos.forEach(System.out::println);
                },
                () -> System.out.println("No se encontraron eventos de la categoría " + categoria)
        );
    }
}
