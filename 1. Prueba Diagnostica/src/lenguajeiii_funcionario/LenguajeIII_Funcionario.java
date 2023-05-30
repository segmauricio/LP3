package lenguajeiii_funcionario;

import funcionarios.Funcionario;
import salario.Salario;

public class LenguajeIII_Funcionario {

    public static void main(String[] args) {
        Funcionario fun01 = new Funcionario();
        fun01.setDocnum("1234567");
        fun01.setApellidos("Gonzalez Vargas");
        fun01.setNombres("Pedro Fabian");
        fun01.setEdad(21);
        fun01.setSalario_base(3000000);
        //fun01.setSalario_minlegal(2550000);
        System.out.println(fun01.salario_neto());
        System.out.println(fun01.salario_dif());
        System.out.println(fun01.toString());
        System.out.println("--------------------------------------");
        Funcionario fun02 = new Funcionario("7654321", "Rodriguez Lopez", "Mario");
        fun02.setEdad(34);
        fun02.setSalario_base(2440000);
        System.out.println(fun02.salario_neto());
        System.out.println(fun02.salario_dif());
        System.out.println(fun02.toString());
        System.out.println("--------------------------------------");
        Funcionario fun03 = new Funcionario();       
    }
    
}
