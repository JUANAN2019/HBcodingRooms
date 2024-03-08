public class Usuario {
    private String nombre;
    private String destino;
    private Fecha fecha;
    private int numeroAsientos;
    public Usuario() {
    }

    public Usuario(String nombre, String destino, Fecha fecha, int numeroAsientos) {
        this.nombre         = nombre;
        this.destino        = destino;
        this.fecha         = fecha;
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

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }
    public int getNumeroAsientos() {
        return numeroAsientos;
    }

    public void setNumeroAsientos(int numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }

    public String realizarReserva(Vuelo vuelo) throws ReservaInvalidadaException {

        validarReserva(vuelo);



        return "Reserva realizada correctamente para el vuelo " + vuelo.getId() + ". dipone de  " + this.getNumeroAsientos();


    }
    public void validarReserva(Vuelo vuelo){
        int asientosValidados = this.numeroAsientos > 0 ? numeroAsientos : -1;
        if (vuelo == null) {
            throw new IllegalArgumentException("El vuelo no puede ser nulo");
        }
        if (this.getNombre() == null || this.getNombre().isEmpty()) {
            try {
                throw new ReservaInvalidadaException("El nombre del pasajero no puede estar vacío");
            } catch (ReservaInvalidadaException e) {
                throw new RuntimeException(e);
            }
        }

        if (this.getDestino() == null || this.getDestino().isEmpty()) {
            try {
                throw new ReservaInvalidadaException("El destino no puede estar vacio");
            } catch (ReservaInvalidadaException e) {
                throw new RuntimeException(e);
            }
        }
        if (asientosValidados == -1) {
            try {
                throw new ReservaInvalidadaException("El campo de número de asientos no puede estar vacío");
            } catch (ReservaInvalidadaException e) {
                throw new RuntimeException(e);
            }
        }
        if (vuelo.getAsientosDisponibles() < numeroAsientos) {
            try {
                throw new ReservaInvalidadaException("No hay suficientes asientos disponibles para el vuelo \" + idVuelo");
            } catch (ReservaInvalidadaException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
