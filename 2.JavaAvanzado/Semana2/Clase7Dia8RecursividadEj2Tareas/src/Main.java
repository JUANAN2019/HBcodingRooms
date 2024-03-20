import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Tarea tarea = new Tarea("Tarea Principal:", "Diseño de la aplicacion");
        Tarea proyecto = new Tarea("Proyecto:", "Desarrolo de software");
        Tarea principal1 =   new Tarea("Tarea Principal:", "Diseño de la aplicacion");
        List<Tarea> tareasPrincipales = Arrays.asList(
               // new Tarea("Proyecto", "Desarrolo de software"),
                new Tarea("Tarea Principal", "Diseño de la aplicacion"),
                new Tarea("Tarea Principal", "Implementacion del Codigo"),
                new Tarea("Tarea Principal", "Pruebas y Depuracion"),
                new Tarea("Subtarea Diseño", "Prototipo"),
                new Tarea("Subtarea Diseño", "Interfaz"),
                new Tarea("Subtarea Diseño", "Documentar requisitos"),
                new Tarea("Subsubtarea Interfaz", "Definir Esquema de Colores"),
                new Tarea("Subsubtarea Interfaz", "Diseñar Diseño Responsivo")

        );

//        List<Tarea> subtareaDiseño = Arrays.asList(
//                new Tarea("Subtarea", "Prototipo"),
//                new Tarea("Subtarea", "Interfaz"),
//                new Tarea("Subtarea", "Documentar requisitos")
//        );
        List<Tarea> subtareaDiseño = Arrays.asList(
                new Tarea("SubtareaDiseño", "Prototipo"),
                new Tarea("SubtareaDiseño", "Interfaz"),
                new Tarea("SubtareaDiseño", "Documentar requisitos")
        );

//        List<Tarea> subSubTareaInterfaz = Arrays.asList(
//                new Tarea("Sub-subtarea", "Definir Esquema de Colores"),
//                new Tarea("Sub-subtarea", "Diseñar Diseño Responsivo")
//        );
        List<Tarea> subSubTareaInterfaz = Arrays.asList(
                new Tarea("SubsubtareaInterfaz", "Definir Esquema de Colores"),
                new Tarea("SubsubtareaInterfaz", "Diseñar Diseño Responsivo")
        );
//        List<Tarea> subtareImplementacionCodigo = Arrays.asList(
//                new Tarea("Subtarea", "Desarrollar Backend"),
//                new Tarea("Subtarea", "Desarrollar Frontend")
//        );
        List<Tarea> subtareImplementacionCodigo = Arrays.asList(
                new Tarea("SubtareImplementacionCodigo", "Desarrollar Backend"),
                new Tarea("SubtareImplementacionCodigo", "Desarrollar Frontend")
        );
        List<Tarea> subSubTareaBackend = Arrays.asList(
                new Tarea("Sub-subtarea", "Configurar Base de Datos"),
                new Tarea("Sub-subtarea", "Crear Logica de Negocion")
        );
        List<Tarea> subSubTareaFrontend = Arrays.asList(
                new Tarea("Sub-subtarea", "Codificar Interfaz de usuario"),
                new Tarea("Sub-subtarea", "Integrar con Backend")
        );
        List<Tarea> subtarePruebasyDepuracion = Arrays.asList(
                new Tarea("Subtarea", "Ejecutar Pruebas de Integracion"),
                new Tarea("Subtarea", "Solucionar Errores")
        );

        AccionesTareas acciones = new AccionesTareas();
        acciones.agregarTareasRecursivamente(proyecto, principal1.getNombre() );
        //acciones.agregarTareas(proyecto, tareasPrincipales);

        //acciones.recorrerTareas(proyecto);
       // acciones.agregarTareasRecursivas(proyecto, 0);
        //System.out.println(proyecto);
        //  System.out.println("--"+ tarea.getTipo()+" "+ tarea.getNombre());

//        Tarea tareaPrincipal = new Tarea("Tarea Principal", "Organizar evento");

        //Tarea subtarea1 = new Tarea("Subtarea", "Crear Prototipo");

// Agrega la subtarea a la tarea principal

    }
}
