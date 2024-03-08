public class Vuelo {
    private int asientosDisponibles;
    private int id;

    public Vuelo() {
    }

    public Vuelo(int asientosDisponibles, int id) {
        this.asientosDisponibles = asientosDisponibles;
        this.id = id;
    }

    public int getAsientosDisponibles() {
        return asientosDisponibles;
    }

    public void setAsientosDisponibles(int asientosDisponibles) {
        this.asientosDisponibles = asientosDisponibles;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
