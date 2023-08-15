package entities;

public class Calcular15Ou25PorCento implements RegraCalculo {

    @Override
    public double calcular(Funcionario funcionario) {
        if (funcionario.getSalary() > 2000) {
            return funcionario.getSalary() * 0.75;
        } else {
            return funcionario.getSalary() * 0.85;
        }
    }
}
