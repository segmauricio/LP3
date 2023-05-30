package Actividad2;

/**
 *
 * @author Mauricio
 */
public class Producto implements Comparable<Producto>{
    protected String nombre;
    protected String description;
    protected double precio;
    protected int cantidadStock;

    //Constructor que acepta todos los atributos
    public Producto(String nombre, String description, double precio, int cantidadStock) {
        this.nombre = nombre;
        this.description = description;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
    }
    
    //Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getCantidadStock() {
        return cantidadStock;
    }
    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }
    
    // implementación de Comparable para poder ordenar los productos por precio
    @Override
    public int compareTo(Producto o) {
        if (this.precio < o.getPrecio()) {
            return -1;
        } else if (this.precio > o.getPrecio()) {
            return 1;
        } else {
            return 0;
        }
    }
}
