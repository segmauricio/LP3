package lp3_segovia_mauricio;
import Producto.Producto;
import Producto.Libro;
import Producto.Pelicula;
import Producto.Musica;

/**
 *
 * @author ALUMNO
 */
public class LP3_SEGOVIA_MAURICIO {
    //Establecemos los valores del bloque estatico fuera del main
    static int num;
    static {
        num = 9;
        System.out.println("Se ha inicializado num en el bloque de código estático con valor " + num);
    }
    
    //Establecemos los valores del bloque dinamico
    int num2;
    {
        num2 = 5;
        System.out.println("Se ha inicializado num en el bloque de código dinámico con valor " + num2);
    }
    public LP3_SEGOVIA_MAURICIO() {
        System.out.println("Se ha creado una nueva instancia de EjemploBloqueCodigoDinamico");
    }

    public static void main(String[] args) {
    //Polimorfismo
    Producto[] productos = new Producto[3];
    productos[0] = new Libro("La sombra del viento", 15.99, "Carlos Ruiz Zafón");
    productos[1] = new Pelicula("El Padrino", 19.99, 175);
    productos[2] = new Musica("Thriller", 9.99, "Michael Jackson");
    productos[0].mostrarDetalles();
    productos[1].mostrarDetalles();
    productos[2].mostrarDetalles();
    System.out.println("--------------------------------");
    //Operador instanceof
    Producto p = new Libro("Cien años de soledad", 123, "Gabriel García Márquez");
    Producto r = new Libro("Doscientos años de soledad", 1234, "Gabriel García Márquez");
    if (p instanceof Object) {
        System.out.println("El objeto p es un objeto");
        if (p instanceof Producto) {
            System.out.println("El objeto p es una instancia de Producto");
            if (p instanceof Libro) {
                System.out.println("El objeto p es una instancia de Libro");
            }
            else if (p instanceof Pelicula) {
                System.out.println("El objeto p es una instancia de Pelicula");
            } else if (p instanceof Musica) {
                System.out.println("El objeto p es una instancia de Musica");
            }
        }
    }
    //hashCode
    System.out.println(p.hashCode());
    //equals
    System.out.println(p.equals(r));
    //Bloque de codigo estatico
    System.out.println("Se ha inicializado num en el bloque de código estático con valor " + num);
    //Bloque de codigo dinamico
    LP3_SEGOVIA_MAURICIO obj = new LP3_SEGOVIA_MAURICIO();
    }
}
