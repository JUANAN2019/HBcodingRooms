
public class ArrayConPosicion {

    private int dato;
    private int posicion;

    public ArrayConPosicion(int dato, int posicion) {
        this.dato = dato;
        this.posicion = posicion;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Dato: " + dato + ", Posición: " + posicion;
    }
}