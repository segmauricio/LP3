package Actividad2;
import java.util.ArrayList;

/**
 *
 * @author Mauricio
 */
public class Venta {
    private ArrayList<Producto> productos;

    public Venta() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public void eliminarProducto(String nombre) {
        Producto producto = buscarProducto(nombre);
        if (producto != null) {
            this.productos.remove(producto);
        }
    }

    public Producto buscarProducto(String nombre) {
        for (Producto producto : productos) {
            if (producto.getNombre().equals(nombre)) {
                return producto;
            }
        }
        return null;
    }
    
    public ArrayList<Producto> getProductosOrdenadosPorPrecio() {
        ArrayList<Producto> productosOrdenadosPorPrecio = new ArrayList<Producto>(productos);
        productosOrdenadosPorPrecio.sort(null);
        return productosOrdenadosPorPrecio;
    }
}
