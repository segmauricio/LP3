package vehiculo.trabajoenclaseiii;

/**
 *
 * @author Mauricio
 */
public class Coche extends Vehiculo{
    protected int nroPuertas;
    protected String tipoTranmision;
    
    public Coche(){     
    }
    
    //Constructor
    public Coche(String marca, String modelo, int year, int nroPuertas, String tipoTransmision){
        super(marca, modelo, year);
        this.nroPuertas = nroPuertas;
        this.tipoTranmision = tipoTransmision;
    }

    //Getters y Setters
    public int getNroPuertas() {
        return nroPuertas;
    }
    public void setNroPuertas(int nroPuertas) {
        this.nroPuertas = nroPuertas;
    }
    public String getTipoTranmision() {
        return tipoTranmision;
    }
    public void setTipoTranmision(String tipoTranmision) {
        this.tipoTranmision = tipoTranmision;
    }
}
