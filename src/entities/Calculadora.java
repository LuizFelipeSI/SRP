package entities;

public class Calculadora {

    public Double calcSalary(Funcionario funcionario) throws Exception {
        return funcionario.getCargo().getRegraCalculo().calcular(funcionario);
    }
}
