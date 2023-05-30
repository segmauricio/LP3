package Actividad2;
import java.time.LocalDate;

/**
 *
 * @author Mauricio
 */
public class MainActividad2 {
    public static void main(String[] args) {
        System.out.println("1) Clase Persona");
        Persona persona1 = new Persona("García", "Juan", LocalDate.of(1996, 3, 18));
        System.out.println("Apellido: " + persona1.getApellido());
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Fecha de nacimiento: " + persona1.getfechaNac());
        System.out.println("Edad: " + persona1.calcularEdad());
        System.out.println("-----------------------------------------");
        System.out.println("2) Clase Cliente");
        Cliente cliente1 = new Cliente("Micniuk", "Osvaldo", LocalDate.of(1980, 7, 30), "876534-4", "0974675432", LocalDate.of(2023, 3, 23) );
        System.out.println("Apellido: " + cliente1.getApellido());
        System.out.println("Nombre: " + cliente1.getNombre());
        System.out.println("Fecha de nacimiento: " + cliente1.getfechaNac());
        System.out.println("Edad: " + cliente1.calcularEdad());
        System.out.println("RUC: " + cliente1.getRuc());
        System.out.println("RUC: " + cliente1.getTelefono());
        System.out.println("Fecha de registro: " + cliente1.getFechaRegistro()); 
    }
}
