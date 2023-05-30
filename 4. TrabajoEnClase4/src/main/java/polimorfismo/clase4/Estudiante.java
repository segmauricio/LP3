package polimorfismo.clase4;

/**
 *
 * @author Mauricio
 */
public class Estudiante {
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected double nota_promedio;

    //Constructor que acepte todos los atributos
    public Estudiante(String nombre, String apellido, int edad, double nota_promedio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nota_promedio = nota_promedio;
    }
    
    //Constructor que solo acepta nombre, apellido y edad.
    public Estudiante(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    //Metodos getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public double getNota_promedio() {
        return nota_promedio;
    }
    public void setNota_promedio(double nota_promedio) {
        this.nota_promedio = nota_promedio;
    }
}
