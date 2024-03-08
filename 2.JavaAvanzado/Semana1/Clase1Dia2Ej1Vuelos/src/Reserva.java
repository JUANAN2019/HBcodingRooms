public class Reserva {

    private String nombre;
    private String destino;
    private String fecha;
    private int numeroAsientos;

    public Reserva() {
    }

    public Reserva(String nombre, String destino, String fecha, int numeroAsientos) {
        this.nombre         = nombre;
        this.destino        = destino;
        this.fecha          = fecha;
        this.numeroAsientos = numeroAsientos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getNumeroAsientos() {
        return numeroAsientos;
    }

    public void setNumeroAsientos(int numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }
    public void reservaVuelo(int asientosDisponibles) throws ReservaInvalidadaException{
        if(getNumeroAsientos() > asientosDisponibles){
            throw new ReservaInvalidadaException("No hay suficientes asientos disponibles");
        }
    }


}
