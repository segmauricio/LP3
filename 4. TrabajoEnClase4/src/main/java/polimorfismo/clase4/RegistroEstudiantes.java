package polimorfismo.clase4;

/**
 *
 * @author Mauricio
 */
public class RegistroEstudiantes {
    protected Estudiante[] estudiantes;
    protected int cantidadEstudiantes;
    
    public RegistroEstudiantes(int numEstudiantes) {
        estudiantes = new Estudiante[numEstudiantes];
    }
    
    //El método recibe un objeto Estudiante y lo agrega al arreglo de estudiantes
    public void agregarEstudiante(Estudiante estudiante) {
        if (cantidadEstudiantes < estudiantes.length) {
            estudiantes[cantidadEstudiantes] = estudiante;
            cantidadEstudiantes++;
            System.out.println("Estudiante agregado correctamente.");
        } else {
            System.out.println("No es posible agregar más estudiantes.");
        }
    }
    
    //Recibe el nombre de un estudiante, lo busca y elimina el objeto Estudiante correspondiente
    public void eliminarEstudiante(String estudianteAencontrar) {
        boolean encontrado = false;
        int i = 0;
        while (i < cantidadEstudiantes && !encontrado) {
            if (estudiantes[i].getNombre().equals(estudianteAencontrar)) {
                encontrado = true;
            } else {
                i++;
            }
        }
        if (encontrado) {
            for (int j = i; j < cantidadEstudiantes - 1; j++) {
                estudiantes[j] = estudiantes[j + 1];
            }
            cantidadEstudiantes--;
            System.out.println("Estudiante eliminado correctamente.");
        } else {
            System.out.println("El estudiante no existe.");
        }
    }
    
    /*Recibe el nombre de un estudiante, busca y devuelve el objeto Estudiante correspondiente del arreglo de estudiantes
    Si el estudiante no existe, devuelve null*/
    public Estudiante buscarEstudiante(String nombre) {
        Estudiante estudianteEncontrado = null;
        boolean encontrado = false;
        int i = 0;
        while (i < cantidadEstudiantes && !encontrado) {
            if (estudiantes[i].getNombre().equals(nombre)) {
                estudianteEncontrado = estudiantes[i];
                encontrado = true;
            } else {
                i++;
            }
        }
        if (encontrado) {
            System.out.println("Estudiante encontrado: " + estudianteEncontrado.getNombre() + " " + estudianteEncontrado.getApellido());
        } else {
            System.out.println("El estudiante no existe.");
        }
        return estudianteEncontrado;
    }
    
    //Mostrar la lista de estudiantes
    public void mostrarEstudiantes() {
    System.out.println("Lista de estudiantes: ");
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i] != null) {
                Estudiante estudiante = estudiantes[i];
                System.out.println("Nombre y Apellido: " + estudiante.getNombre() + " " + estudiante.getApellido());
                System.out.println("Edad: " + estudiante.getEdad());
                System.out.println("Nota promedio: " + estudiante.getNota_promedio());
                if (estudiante instanceof EstudianteInternacional) {
                    EstudianteInternacional estudianteInternacional = (EstudianteInternacional) estudiante;
                    System.out.println("País de origen: " + estudianteInternacional.getPaisOrigen());
                }
            }
            System.out.println("- - - - -");
        }
    }
}
