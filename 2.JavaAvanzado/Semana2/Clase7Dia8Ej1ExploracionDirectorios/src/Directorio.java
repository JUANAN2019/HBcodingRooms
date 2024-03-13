import java.io.File;
import java.util.List;

class Directorio {
    String nombre;
    List<Directorio> subdirectorios;
    List<String> archivos;

    String rutaBase = "C:/Users/JUNAN/Desktop/HBPROYECTOSCODING/2.JavaAvanzado/Semana2/Clase7Dia8Ej1ExploracionDirectorios";
    // Constructor, métodos para agregar subdirectorios y archivos, etc.


    public Directorio(String nombre, List<Directorio> subdirectorios, List<String> archivos) {
        this.nombre         = nombre;
        this.subdirectorios = subdirectorios;
        this.archivos       = archivos;
    }
    public  void agregarSubdirectorio(String nDirPadre, String nDirectorioNuevo){
        File directorio = new File();
        if(directorio.exists()){

        }

    }
    public void agregarArchivo(String directorio, String archivo){

    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Directorio> getSubdirectorios() {
        return subdirectorios;
    }

    public void setSubdirectorios(List<Directorio> subdirectorios) {
        this.subdirectorios = subdirectorios;
    }

    public List<String> getArchivos() {
        return archivos;
    }

    public void setArchivos(List<String> archivos) {
        this.archivos = archivos;
    }

}