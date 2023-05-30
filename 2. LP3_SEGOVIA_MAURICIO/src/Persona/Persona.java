package Persona;

import java.util.Objects;

/**
 *
 * @author ALUMNO
 */
//Comparación de Objetos - equals
public class Persona {
    private String nombre;
    private int edad;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return edad == persona.edad && Objects.equals(nombre, persona.nombre);
    }
}