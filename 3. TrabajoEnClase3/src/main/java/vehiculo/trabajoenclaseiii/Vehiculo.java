package vehiculo.trabajoenclaseiii;

/**
 *
 * @author Mauricio
 */
public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int year;
    
    public Vehiculo(){
    }
    
    //Constructor
    public Vehiculo(String marca, String modelo, int year) {
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
    }
    
    //Setters y Getters
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
}


