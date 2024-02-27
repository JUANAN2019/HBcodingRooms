import java.time.LocalDate;

public class Moto extends Vehiculo implements Combustion{

    private int cilindrada;
    private String tipoMotor;

    public Moto(int id, String placa, String marca, String modelo, int año, double costo, int cilindrada, String tipoMotor) {
        super(id, placa, marca, modelo, año, costo);
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
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


    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }
}
