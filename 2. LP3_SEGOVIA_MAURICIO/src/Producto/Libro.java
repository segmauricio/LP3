package Producto;

import Persona.Persona;
import java.util.Objects;

/**
 *
 * @author ALUMNO
 */
public class Libro extends Producto {
    private String autor;
    
    public Libro(String titulo, double precio,String autor) {
        super(titulo, precio);
        this.autor = autor;
    }
    
    public void mostrarDetalles() {
        System.out.println("Libro: " + titulo + " -Autor: " + autor);
    }
    
    //hashCode
    @Override                                            //Generado con click derecho
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.autor);
        return hash;
    }   
    
    //equals
    @Override                                           //Generado con click derecho
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        return true;
    }
    
    
    
}

