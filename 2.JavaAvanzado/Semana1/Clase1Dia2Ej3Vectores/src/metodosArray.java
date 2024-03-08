public class metodosArray {

    public  void leerElemento (int[] array, int posicion){

    int elemento;
        try {
           elemento = array[posicion] ;
            System.out.println("El elemento es " + elemento);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: La posición " + posicion + " está fuera del rango del array" +e);
        }

    }
}
