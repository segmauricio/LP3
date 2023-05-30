package funcionarios;
import salario.Salario;

public class Funcionario {
    private String docnum;
    private String apellidos;
    private String nombres;
    private int edad;
    //private final double salario_minlegal = 2550000; //final hace que esto sea una constante
    private double salario_base;

    public String getDocnum() {
        return docnum;
    }

    public void setDocnum(String docnum) {
        this.docnum = docnum;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    /*
    public double getSalario_minlegal() {
        return salario_minlegal;
    }
    */

    public double getSalario_base() {
        return salario_base;
    }

    public void setSalario_base(double salario_base) {
        this.salario_base = salario_base;
    }

    //METODOS
    public double salario_neto(){
        return this.salario_base * Salario.ips;
    }
    public double salario_dif() {
        Salario saldo = new Salario();                  //Instanciamos la clase
        //return this.salario_base-this.salario_minlegal;
        return this.salario_base - saldo.salario_minbase;
    }
    
    //Constructor
    public Funcionario(){
     
    }
    public Funcionario(String docnum, String apellidos, String nombres) {
        this.docnum = docnum;
        this.apellidos = apellidos;
        this.nombres = nombres;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "docnum = " + docnum + ", apellidos = " + apellidos + ", nombres = " + nombres + ", edad = " + edad + ", salario_minlegal = " + ", salario_base = " + salario_base + '}';
    }
}