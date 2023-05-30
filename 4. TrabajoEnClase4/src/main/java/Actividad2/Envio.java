package Actividad2;

/**
 *
 * @author Mauricio
 */
public class Envio {
    private String direccion;

    public Envio(String direccion) {
        this.direccion = direccion;
    }
    
    //Getter y Setter
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //Método para calcular el costo de envío en función de la distancia
    public double calcularCostoEnvio(double distanciaEnKm) {
        if (distanciaEnKm <= 5){
            return 5000;
        }
        else if (distanciaEnKm > 6 && distanciaEnKm <= 50){
            return 15000;
        }
        else{
            System.out.println("FAIL. Compra muy lejana. ");
            return 0;
        }
    }
}
