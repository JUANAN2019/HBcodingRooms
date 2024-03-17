import java.util.List;

public class ExploradorDirectorio {




    public void recorrerDirectorios(Directorio directorio) {

        if(directorio.getNombre().equalsIgnoreCase("DirPrincipalList")){
            System.out.println(directorio.getNombre());
        }

        for(Directorio m : directorio.getDirectorios()){
            System.out.println( m.getNombre());

            if (m.getArchivos().isEmpty()) {
                for (String archivo : directorio.getArchivos()) {
                    System.out.println(archivo);
                }
            }
            recorrerDirectorios(m);

        }

    }

}
