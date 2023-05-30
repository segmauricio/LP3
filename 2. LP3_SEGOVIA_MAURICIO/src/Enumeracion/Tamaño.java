package Enumeracion;

/**
 *
 * @author ALUMNO
 */
public enum Tamaño {
    PEQUEÑO(10), MEDIANO(20),GRANDE(30);
    
    private int valor;
    
    private Tamaño(int valor) {
        this.valor = valor;
    }
    
    public int getValor() {
        return valor;
    }
}
