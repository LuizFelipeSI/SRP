package application;

import entities.Calculadora;
import entities.Cargo;
import entities.Funcionario;

public class Program {

    public static void main(String[] args) throws Exception {


        Funcionario f = new Funcionario(Cargo.DESENVOLVEDOR, 4000.0);
        Calculadora c = new Calculadora();


        System.out.println(c.calcSalary(f));

    }
}
