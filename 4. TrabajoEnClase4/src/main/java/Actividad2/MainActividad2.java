package Actividad2;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Mauricio
 */
public class MainActividad2 {
    public static void main(String[] args) {
                // Crear algunos productos
        Producto p1 = new Producto("Zapatos", "Zapatos deportivos para correr", 250000, 10);
        Producto p2 = new Producto("Camiseta", "Camiseta deportiva de algodón", 129000, 35);
        Producto p3 = new Producto("Pantalones", "Pantalones deportivos para hombres", 67000, 15);
        Producto p4 = new Producto("Torta", "Torta de cumpleaños", 50000, 7);
        Producto p5 = new Producto("Termo", "Termo Stanley deportivo", 45000, 15);
        Producto p6 = new Producto("Riñonera", "Riñonera deportiva p/ hombres", 47000, 8);
        
        // Crear una venta
        Venta venta = new Venta();
        
        // Agregar los productos a la venta
        venta.agregarProducto(p1);
        venta.agregarProducto(p2);
        venta.agregarProducto(p3);
        venta.agregarProducto(p4);
        venta.agregarProducto(p5);
        venta.agregarProducto(p6);
        
        // Buscar un producto por nombre
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del producto a buscar: ");
        String nombreProducto = scanner.nextLine();
        Producto productoBuscado = venta.buscarProducto(nombreProducto);
        if (productoBuscado != null) {
            System.out.println("El producto " + productoBuscado.getNombre() + " está disponible.");
        } else {
            System.out.println("El producto " + nombreProducto + " no está disponible.");
        }
        
        // Eliminar un producto
        venta.eliminarProducto("Zapatos");
        
        // Ordenar los productos por precio
        ArrayList<Producto> productosOrdenadosPorPrecio = venta.getProductosOrdenadosPorPrecio();
        Collections.sort(productosOrdenadosPorPrecio);
        System.out.println("Productos ordenados por precio:");
        for (Producto producto : productosOrdenadosPorPrecio) {
            System.out.println(producto.getNombre() +", "+producto.getPrecio());
        }
        
        // Crear un envío
        Envio envio = new Envio("Av. 9 de Julio 1234");
        
        // Calcular el costo de envío
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Ingrese su distancia en km: ");
        double distanciaEnKm = scanner2.nextDouble();
        double costoDeEnvio = envio.calcularCostoEnvio(distanciaEnKm);
        System.out.println("El costo de envío es " + costoDeEnvio + " gs.");
    }
}
