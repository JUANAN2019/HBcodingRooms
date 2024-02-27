import java.time.LocalDate;

public class Camioneta extends Vehiculo implements Combustion{

    private int capacidadTanque;
    private double consumoCombustible;

    public Camioneta(int id, String placa, String marca, String modelo, int año, double costo, int capacidadTanque, double consumoCombustible) {
        super(id, placa, marca, modelo, año, costo);
        this.capacidadTanque = capacidadTanque;
        this.consumoCombustible = consumoCombustible;
    }


    @Override
    public String recargarCombustible() {
        return null;
    }
    @Override
    public int calcularAntiguedad() {
        // Obtener la fecha actual
        LocalDate fechaActual = LocalDate.now();
        int anio = fechaActual.getYear();

        return anio - getAño();
    }

    public int getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    public double getConsumoCombustible() {
        return consumoCombustible;
    }

    public void setConsumoCombustible(double consumoCombustible) {
        this.consumoCombustible = consumoCombustible;
    }


}
