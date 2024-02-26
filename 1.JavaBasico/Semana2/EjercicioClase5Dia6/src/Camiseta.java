public class Camiseta extends Vestimenta{

    private String manga;
    private String cuello;

    public Camiseta(int codigo, String nombre, int precio, String marca, String talla, String color, String manga, String cuello) {
        super(codigo, nombre, precio, marca, talla, color);
        this.manga = manga;
        this.cuello = cuello;
    }
    public String muestraMarca(){
        return "Esta camiseta  es de  marca " + this.getMarca();
    }

    public String getManga() {
        return manga;
    }

    public void setManga(String manga) {
        this.manga = manga;
    }

    public String getCuello() {
        return cuello;
    }

    public void setCuello(String cuello) {
        this.cuello = cuello;
    }
}
