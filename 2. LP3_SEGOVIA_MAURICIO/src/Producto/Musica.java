package Producto;

/**
 *
 * @author ALUMNO
 */
public class Musica extends Producto {
    private String artista;
    
    public Musica(String titulo, double precio,String artista) {
        super(titulo, precio);
        this.artista = artista;
    }
    
    public void mostrarDetalles() {
        System.out.println("Música: " + titulo + " -Artista: " + artista);
    }
}
