import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Directorio {
    String nombre;
    List<Directorio> directorios;
    List<String> archivos;


    public Directorio(String nombre) {
        this.nombre      = nombre;
        this.directorios = new ArrayList<>();
        this.archivos    = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Directorio> getDirectorios() {
        return directorios;
    }

    public void setDirectorios(List<Directorio> directorios) {
        this.directorios = directorios;
    }

    public List<String> getArchivos() {
        return archivos;
    }

    public void setArchivos(List<String> archivos) {
        this.archivos = archivos;
    }
    public void agregarArchivo(String nombreArchivo) {
        if (!archivos.contains(nombreArchivo)) {
            archivos.add(nombreArchivo);
        }
    }

    @Override
    public String toString() {
        return "Directorio{" +
                "nombre='" + nombre + '\'' +
                ", directorios=" + directorios +
                ", archivos=" + archivos +
                '}';
    }
}

// Crea un nuevo directorio hijo
//        Directorio directorioHijo = new Directorio(nombreDHijo);
//
//        // Agrega el directorio hijo a la lista de subdirectorios del padre
//        directorioPadre.subdirectorios.add(directorioHijo);

//    public void agregarSubdirectorio(String nDirPadre, String nDirectorioNuevo) {
//        File directorioPadre = new File(rutaBase + "\\" + nDirPadre);
//        System.out.println(directorioPadre);
//        if (!directorioPadre.exists()) {
//            boolean directoriosCreados = directorioPadre.mkdirs();
//            if (directoriosCreados) {
//                System.out.println("Directorio padre creado");
//            } else {
//                System.out.println("Error al crear el directorio padre");
////                System.out.println("Mensaje de error: " + directorioPadre.getMessage());
////                System.out.println("Causa del error: " + directorioPadre.getCause());
//            }
//        }
//
//        File directorio = new File(rutaBase + "\\" + nDirPadre + "\\" + nDirectorioNuevo);
//        System.out.println(directorio );
//        if (!directorio.exists()) {
//            boolean directorioCreado = directorio.mkdir();
//            if (directorioCreado) {
//                System.out.println("Directorio nuevo creado");
//            } else {
//                System.out.println("Error al crear el directorio nuevo");
////                System.out.println("Mensaje de error: " + directorio.getMessage());
////                System.out.println("Causa del error: " + directorio.getCause());
//                // Maneja el error aquí
//            }
//        }
//    }


