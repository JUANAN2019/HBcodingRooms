import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> llamadas = new ArrayList<>();
        for (int i=0;i<10;i++){
            llamadas.add("Llamada"+i);
        }

        Agente agente1 = new Agente("Luis",llamadas);
        Agente agente2 = new Agente("Juan",llamadas);

        Thread agen1 = new Thread(agente1);
        Thread agen2 = new Thread(agente2);

        agen1.start();
        agen2.start();

    }
}
