import java.util.ArrayList;
import java.util.List;

public class Inventario {

    private List<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public void agregarProducto(String nombre, double precio, int cantidad)  {
        Producto nuevoProducto = new Producto(nombre, precio, cantidad);
        productos.add(nuevoProducto);
    }

    public void agregarProducto(Producto producto) {
    }
}
