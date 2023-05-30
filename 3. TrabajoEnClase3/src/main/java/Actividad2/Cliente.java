package Actividad2;
import java.time.LocalDate;

/**
 *
 * @author Mauricio
 */
public class Cliente extends Persona{
    protected String ruc;
    protected String telefono;
    protected LocalDate fechaRegistro;
    
    // Constructor por defecto
    public Cliente() {
        super();
        this.ruc = "";
        this.telefono = "";
        this.fechaRegistro = null;
    }
    
    //Constructor completo con telefono y fechaRegistro. Si los quito entonces los valores son NULL en el main
    /*
    public Cliente(String apellido, String nombre, LocalDate fechaNac,  String ruc, String telefono, LocalDate fechaRegistro){
        super(apellido, nombre, fechaNac);
        this.ruc = ruc;
        this.telefono = telefono;
        this.fechaRegistro = fechaRegistro;
    }*/
    
    //Constructor que solicita todos los atributos de persona y el ruc
    public Cliente(String apellido, String nombre, LocalDate fechaNac,  String ruc, String telefono, LocalDate fechaRegistro){
        super(apellido, nombre, fechaNac);
        this.ruc = ruc;
    }
    
    //Getters y Setters
    public String getRuc() {
        return ruc;
    }
    public void setRuc(String ruc) {
        this.ruc = ruc;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }
    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    
}
