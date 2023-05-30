package polimorfismo.clase4;
import java.util.Scanner;

/**
 *
 * @author Mauricio
 */
public class Clase4 {
    public static void main(String[] args) {
        System.out.println("1) Actividad 1");
        Estudiante primerAlumno = new Estudiante("Juan", "Lopez", 21, 4.5);
        Estudiante segundoAlumno = new Estudiante("Micaela", "Sanchez", 19, 3);
        EstudianteInternacional primerAlumnoExtranjero = new EstudianteInternacional("Argentina", "Lucas", "Quark", 16, 2);
        Estudiante tercerAlumno = new Estudiante("Dario", "Kniv", 25, 3.4);
        EstudianteInternacional segundoAlumnoExtranjero = new EstudianteInternacional("Bolivia", "Kevin", "Sanchez", 24, 3.9);
        
       // Agregamos los estudiantes al registro
        RegistroEstudiantes registro = new RegistroEstudiantes(8);
        registro.agregarEstudiante(primerAlumno);
        registro.agregarEstudiante(segundoAlumno);
        registro.agregarEstudiante(tercerAlumno);
        registro.agregarEstudiante(primerAlumnoExtranjero);
        registro.agregarEstudiante(segundoAlumnoExtranjero);
        // Mostramos todos los estudiantes del registro
        registro.mostrarEstudiantes();
        System.out.println("------------------------------------------------------------------------");
        // Buscamos un estudiante
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del estudiante a buscar: ");
        String estudianteAencontrar = scanner.nextLine();
        registro.buscarEstudiante(estudianteAencontrar);
        // Eliminamos un estudiante
        registro.eliminarEstudiante("Dario");
    }
}
