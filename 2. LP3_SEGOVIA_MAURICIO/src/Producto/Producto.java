package Producto;

/**
 *
 * @author ALUMNO
 */
public abstract class Producto {
    protected String titulo;
    protected double precio;
    
    public Producto(String titulo, double precio){
        this.titulo = titulo;
        this.precio = precio;
    }

    public abstract void mostrarDetalles();
}