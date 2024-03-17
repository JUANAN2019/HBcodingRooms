
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Directorio listaDirectorios = new Directorio("DirPrincipalList" );

        List<Directorio> listDirectorios1 = Arrays.asList(
                new Directorio("Directorio -11"),
                new Directorio("Directorio -12"),
                new Directorio("Directorio -13")
        );
        listaDirectorios.setDirectorios(listDirectorios1);


        List<Directorio> listDirectorios11 = Arrays.asList(

                new Directorio("Directorio -111"),
                new Directorio("Directorio -112"),
                new Directorio("Directorio -113")
        );
        listaDirectorios.getDirectorios().get(0).setDirectorios(listDirectorios11);

        System.out.println(listaDirectorios.getDirectorios());
        listaDirectorios.getDirectorios().get(0).agregarArchivo("Archivo-1");;
        listaDirectorios.getDirectorios().get(1).agregarArchivo("Archivo-2");;


        List<Directorio> listDirectorios12 = Arrays.asList(
                new Directorio("Directorio -121"),
                new Directorio("Directorio -122"),
                new Directorio("Directorio -133")
        );
        listaDirectorios.getDirectorios().get(1).setDirectorios(listDirectorios12);

        List<Directorio> listDirectorios13 = Arrays.asList(
                new Directorio("Directorio -131"),
                new Directorio("Directorio -132"),
                new Directorio("Directorio -133")
        );
        listaDirectorios.getDirectorios().get(2).setDirectorios(listDirectorios13);

        ExploradorDirectorio exp = new ExploradorDirectorio();
        exp.recorrerDirectorios(listaDirectorios);


}}
