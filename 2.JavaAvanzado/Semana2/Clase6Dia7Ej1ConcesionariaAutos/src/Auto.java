import java.time.LocalDate;

public class Auto {

    private String marca;
    private String modelo;
    private int precio;
    private int año;

    public Auto() {
    }

    public Auto(String marca, String modelo, int precio, int año) {
        this.marca  = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.año    = año;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                ", año=" + año +
                '}';
    }
}
