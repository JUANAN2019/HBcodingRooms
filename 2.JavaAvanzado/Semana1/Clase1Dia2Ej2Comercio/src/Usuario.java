public class Usuario {

    private int id;

    public Usuario() {
    }

    public Usuario(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    public void agregarProducto(Producto producto, Inventario inventario) throws NombreProductoVacioException, PrecioInvalidoException, CantidadProductoInvalidaException {
//
//        // Validación de datos
//        if (producto.getNombre() == null || producto.getNombre().isEmpty()) {
//            throw new NombreProductoVacioException("El nombre del producto no puede estar vacío");
//        }
//        double precio = 0;
//        int cantidad = 0;
//        try {
//            precio = Double.parseDouble(String.valueOf(precio));
//        } catch (NumberFormatException e) {
//            throw new PrecioInvalidoException("El precio del producto debe ser un valor numérico");
//        }
//
//        if (precio <= 0) {
//            throw new PrecioInvalidoException("El precio del producto debe ser un valor positivo");
//        }
//
//        try {
//             cantidad = Integer.parseInt(String.valueOf(cantidad));
//        } catch (NumberFormatException e) {
//            throw new CantidadProductoInvalidaException("La cantidad del producto debe ser un valor entero");
//        }
//
//        if (cantidad <= 0) {
//            throw new CantidadProductoInvalidaException("La cantidad del producto debe ser un valor positivo");
//        }
//
//        // ... (Código para agregar el producto al sistema)
//    }
}
