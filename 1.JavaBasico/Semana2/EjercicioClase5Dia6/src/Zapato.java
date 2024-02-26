public class Zapato extends Vestimenta{

    private String materia;
    private String tipoCierre;

    public Zapato(int codigo, String nombre, int precio, String marca, String talla, String color, String materia, String tipoCierre) {
        super(codigo, nombre, precio, marca, talla, color);
        this.materia = materia;
        this.tipoCierre = tipoCierre;
    }
    public String muestraMarca(){
        return "Estos zapatos son de marca" + this.getMarca();
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getTipoCierre() {
        return tipoCierre;
    }

    public void setTipoCierre(String tipoCierre) {
        this.tipoCierre = tipoCierre;
    }
}
