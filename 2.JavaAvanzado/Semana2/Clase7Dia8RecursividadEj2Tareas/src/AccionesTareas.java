import java.util.Arrays;
import java.util.List;

public class AccionesTareas {

    public void recorrerTareas(Tarea tarea){
        if(tarea.getNombre().equalsIgnoreCase("DirPrincipalList")){
            System.out.println(tarea.getNombre());
        }

        for(Tarea m : tarea.getTareas()){
            System.out.println( m.getNombre());

            if (m.getTareas().isEmpty()) {
                for (Tarea subtarea : tarea.getTareas()) {
                    System.out.println(tarea);
                }
            }
            recorrerTareas(m);

        }

    }
    public void agregarTareas(Tarea tarea, List<Tarea> tareaList){
        System.out.println(tarea.getTipo()+" "+tarea.getNombre());
        for(Tarea t : tareaList){
            if(t.getTipo().equalsIgnoreCase("Proyecto")){
                List<Tarea> tareasPrincipales = Arrays.asList(
                        new Tarea("Tarea Principal:", "Diseño de la aplicacion"),
                        new Tarea("Tarea Principal:", "Implementacion del Codigo"),
                        new Tarea("Tarea Principal:", "Pruebas y Depuracion")
                );

            }


        }
    }

    public void agregarTareasRecursivas(Tarea tarea, int nivel) {
        // Imprimir la tarea actual con la indentación adecuada
        for (int i = 0; i < nivel; i++) {
            System.out.print(" ");
        }
        System.out.println(tarea.getNombre());

        // Si la tarea tiene subtareas, recorrerlas y llamar al método de forma recursiva
        for (Tarea subtarea : tarea.getTareas()) {
            agregarTareasRecursivas(subtarea, nivel + 1);
        }
    }
}
