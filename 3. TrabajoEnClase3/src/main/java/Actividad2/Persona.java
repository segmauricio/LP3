package Actividad2;
import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Mauricio
 */
public class Persona {
    protected String apellido;
    protected String nombre;
    protected LocalDate fechaNac;
    
    // Constructor por defecto
    public Persona() {
        this.apellido = "";
        this.nombre = "";
        this.fechaNac = null;
    }

    //Constructor con todos sus atributos
    public Persona(String apellido, String nombre, LocalDate fechaNac) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
    }

    //Setters y Getters
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public LocalDate getfechaNac() {
        return fechaNac;
    }
    public void setfechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }
    
    //Metodo para calcular la edad
    public int calcularEdad(){
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaNac, fechaActual);
        return periodo.getYears();
    }
}
