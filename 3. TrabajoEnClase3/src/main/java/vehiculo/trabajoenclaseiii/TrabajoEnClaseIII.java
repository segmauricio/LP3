package vehiculo.trabajoenclaseiii;

/**
 *
 * @author Mauricio
 */
public class TrabajoEnClaseIII {
    public static void main(String[] args) {
        System.out.println("1) Clase vehiculo");
        Vehiculo miVehiculo = new Vehiculo("Moto", "Mami", 2022);
        System.out.println("Marca: " + miVehiculo.getMarca());
        System.out.println("Modelo: " + miVehiculo.getModelo());
        System.out.println("Año: " + miVehiculo.getYear());
        System.out.println("-----------------------------------------------------");
        System.out.println("1) Clase Coche");
        Coche miCoche = new Coche("Audi", "Modelo Modern-X", 2023, 2, "Automática");
        System.out.println("Marca: " + miCoche.getMarca());
        System.out.println("Modelo: " + miCoche.getModelo());
        System.out.println("Año: " + miCoche.getYear());
        System.out.println("Número de puertas: " + miCoche.getNroPuertas());
        System.out.println("Tipo de transmisión: " + miCoche.getTipoTranmision());
    }
}

