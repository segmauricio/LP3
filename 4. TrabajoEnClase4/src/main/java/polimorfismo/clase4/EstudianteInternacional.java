package polimorfismo.clase4;

/**
 *
 * @author Mauricio
 */
public class EstudianteInternacional extends Estudiante {
    protected String paisOrigen;

    //Contructor
    public EstudianteInternacional(String paisOrigen, String nombre, String apellido, int edad, double nota_promedio) {
        super(nombre, apellido, edad, nota_promedio);
        this.paisOrigen = paisOrigen;
    }

    //Getters y setters
    public String getPaisOrigen() {
        return paisOrigen;
    }
    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
    
}
