import java.time.LocalDate;
public class Auto extends Vehiculo implements Electrico {

    private double capacidadBateria;

    private double autonomia;

    public Auto(int id, String placa, String marca, String modelo, int año, double costo, double capacidadBateria, double autonomia) {
        super(id, placa, marca, modelo, año, costo);
        this.capacidadBateria = capacidadBateria;
        this.autonomia = autonomia;
    }

    @Override
    public String cargarEnergia() {
        return "Estas cargando energia en tu Auto.";
    }

    @Override
    public int calcularAntiguedad() {
        // Obtener la fecha actual
        LocalDate fechaActual = LocalDate.now();
        int anio = fechaActual.getYear();

        return anio - getAño();
    }

    public double getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(double capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public double getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(double autonomia) {
        this.autonomia = autonomia;
    }

}
