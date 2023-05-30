package Producto;

/**
 *
 * @author ALUMNO
 */
public class Pelicula extends Producto {
    private int duracion;
    public Pelicula(String titulo, double precio, int duracion) {
        super(titulo, precio);
        this.duracion = duracion;
    }
    
    public void mostrarDetalles() {
        System.out.println("Película: " + titulo + "- Duración: " + duracion + " minutos");
    }
}

