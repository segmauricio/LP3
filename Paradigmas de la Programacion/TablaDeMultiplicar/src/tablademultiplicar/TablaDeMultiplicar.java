package tablademultiplicar;

/**
 *
 * @author laboratorio
 */
public class TablaDeMultiplicar {
    public static void Tabla(int val){
        for(int i=0; i<=11; i++){
            System.out.println(val + "*" + i + "=" + val*i);
        }
    }
    
    public static void main(String[] args) {
        Tabla(3);
    }
}
