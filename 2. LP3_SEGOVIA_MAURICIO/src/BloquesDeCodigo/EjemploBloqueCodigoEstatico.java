package BloquesDeCodigo;

/**
 *
 * @author ALUMNO
 */
public class EjemploBloqueCodigoEstatico{
    static int num;
    static {
        num = 9;
        System.out.println("Se ha inicializado num en el bloque de código estático con valor " + num);
    }
    public static void main(String[] args) {
        System.out.println("El valor de num es: " + num);
    }
}
