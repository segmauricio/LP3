package Imprimible;

import Producto.Libro;

/**
 *
 * @author ALUMNO
 */
public class Libro2 implements Imprimible {
    private String titulo;
    private String autor;
    
    public Libro2(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    public void imprimir() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
    }
}
