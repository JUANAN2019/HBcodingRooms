public class Mamifero extends Animal{

    private int numeroPatas;
    private String tipoReproduccion;
    private String colorPelaje;
    private String habitat;

    public Mamifero(int id, String nombre, int edad, String tipoDePiel, String tipoAlimentacion, int numeroPatas, String tipoReproduccion, String colorPelaje, String habitat) {
        super(id, nombre, edad, tipoDePiel, tipoAlimentacion);
        this.numeroPatas = numeroPatas;
        this.tipoReproduccion = tipoReproduccion;
        this.colorPelaje = colorPelaje;
        this.habitat = habitat;
    }

    @Override
    public String saludar() {
        return "Hola, soy un mamifero";
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }


    public String getTipoReproduccion() {
        return tipoReproduccion;
    }


    public void setTipoReproduccion(String tipoAlimentacion) {
        this.tipoReproduccion = tipoAlimentacion;
    }

    public String getColorPelaje() {
        return colorPelaje;
    }

    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}
