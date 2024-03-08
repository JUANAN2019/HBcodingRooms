import java.util.List;

public class Agente implements Runnable{
    private String nombre;
    private List<String> llamadas;

    public Agente(String nombre, List<String> llamadas) {
        this.nombre   = nombre;
        this.llamadas = llamadas;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getLlamadas() {
        return llamadas;
    }

    public void setLlamadas(List<String> llamadas) {
        this.llamadas = llamadas;
    }

    public void run() {
        while (!llamadas.isEmpty()) {
            String llamada = llamadas.remove(0);
            atenderLlamada(llamada);
            resolverConsulta(llamada);
            registrarInformacion(llamada);
        }
    }
    public void atenderLlamada(String llamada) {
        System.out.println("Estoy atendiendo una llamada, soy el agente:" +nombre +" y atiendo la llamada "+llamada);
    }
    public void resolverConsulta(String llamada) {
        System.out.println("Estoy resolviendo consulta de una llamada, soy el agente:" +nombre +" y atiendo la llamada "+llamada);
    }
    public void registrarInformacion(String llamada) {
        System.out.println("Estoy registrando informacion de una llamada, soy el agente:" +nombre +" y atiendo la llamada "+llamada);
    }
}
