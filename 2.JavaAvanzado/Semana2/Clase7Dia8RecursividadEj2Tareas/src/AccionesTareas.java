import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AccionesTareas {

    public void recorrerTareas(Tarea tarea){
        if(tarea.getNombre().equalsIgnoreCase("Proyecto")){
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
//    public void agregarTareas(Tarea tarea, List<Tarea> tareaList){
//
//        List<Tarea> tipoTarea = new ArrayList<>();;
//        for(Tarea t : tareaList){
//            System.out.println(t.getTipo()+" "+t.getNombre());
//            if(t.getTipo().equalsIgnoreCase("Proyecto:")){
//                System.out.println("estoy en if proyecto");
//            }
//            if(t.getTipo().equalsIgnoreCase("Tarea Principal:")){
//                System.out.println("estoy en tarea principal");
//                List<Tarea> tareasPrincipales = Arrays.asList(
//                        new Tarea(t.getTipo(), t.getNombre())
//                );
//                tipoTarea = tareasPrincipales;
//                tarea.setTareas(tipoTarea);
//            }
////            if(t.getTipo().equalsIgnoreCase("Tarea Principal:")){
////                System.out.println("estoy en tareaPrincipal");
////                List<Tarea> subtareas = Arrays.asList(
////                        new Tarea(t.getTipo(), t.getNombre())
////                );
////                tipoTarea = subtareas;
////
////            }
//
//
//            agregarTareas(tarea,tipoTarea);
//
//        }
//
//    }
     public  void agregarTareasRecursivamente(Tarea tarea, String nombreTarea) {
            // Crear una nueva subtarea
            String tipoTarea= "tarea";
            Tarea subtarea = new Tarea(tipoTarea, nombreTarea);

            // Agregar la subtarea a la tarea padre
            tarea.agregarTarea(tarea);

            // Preguntar si hay más subtareas
            System.out.println("¿Desea agregar otra subtarea a " + nombreTarea + "? (Y/N)");
            Scanner scanner = new Scanner(System.in);
            String respuesta = scanner.nextLine();

            // Si la respuesta es sí, llamar a la función recursivamente
            if (respuesta.equalsIgnoreCase("Y")) {
                System.out.println("Introduzca el nombre de la tarea: ");
                String nombreNuevaTarea = scanner.nextLine();
                agregarTareasRecursivamente(tarea, nombreNuevaTarea);
            }

        }
//        public void agregarTar(List<Tarea> tareaList){
//            if(tareaList.isEmpty()) return;
//            Tarea proyecto = new Tarea("Proyecto:", "Desarrolo de software");
//            List<Tarea> tareasPrincipales = new ArrayList<>();
//
//            for (Tarea tarea : tareaList) {
//                if (tarea.getTipo().equals("Tarea Principal")) {
//                    tareasPrincipales.add(tarea);
//                    System.out.println("Tarea principal: " + tarea.getNombre());
//
//
//                    List<Tarea> subtareas = new ArrayList<>();
//                    for (Tarea subtarea : tareaList) {
//                        System.out.println(tarea.getNombre());
//                        System.out.println(tarea.getTipo()
//                        );
//                        if (subtarea.getTipo().equals("Subtarea " + tarea.getNombre())) {
//                            subtareas.add(subtarea);
//                        }
//                    }
//
//                    for (Tarea subtarea : subtareas) {
//                        System.out.println(" - " + subtarea.getNombre());
//                    }
//                }
//            }
//            proyecto.setTareas(tareasPrincipales);
//
//        }
    public void agregarTarea(List<Tarea> tareaList){

    }


}
