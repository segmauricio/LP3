package tablademultiplicar;

/**
 *
 * @author laboratorio
 */
public class TablaII {
    public int valor;

    public TablaII(int valor) {
        this.valor = valor;
    }
    
    public void multiplicar(int val){
        for(int i=0; i<=11; i++){
            System.out.println(val + "*" + i + "=" + val*i);
        }
    }
    
    public void main(String[] args) {
        TablaII tabla = new TablaII(4);
        tabla.multiplicar(8);
    }
}
