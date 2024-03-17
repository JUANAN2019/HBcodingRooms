import java.util.Arrays;
import java.util.List;

public class Tarea {

    private String tipo;
    private String nombre;

    List<Tarea> tareas;


    public Tarea(String tipo, String nombre, List<Tarea> tareas) {
        this.tipo   = tipo;
        this.nombre = nombre;
        this.tareas = tareas;
    }
    public Tarea(String tipo, String nombre) {
        this.tipo   = tipo;
        this.nombre = nombre;
        this.tareas = tareas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Tarea> getTareas() {
        return tareas;
    }

    public void setTareas(List<Tarea> tareas) {
        this.tareas = tareas;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "tipo='" + tipo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", tareas=" + tareas +
                '}';
    }
    public void agregarTarea( Tarea tarea, String tipo, String nombre) {
        List<Tarea> lista = Arrays.asList(
                new Tarea(tipo,nombre)
        );
        tarea.getTareas().get(0).setTareas(lista);

    }
}

