package entities;

public class Calcular10Ou20PorCento implements RegraCalculo {

    @Override
    public double calcular(Funcionario funcionario) {
        if (funcionario.getSalary() > 3000) {
            return funcionario.getSalary() * 0.8;
        } else {
            return funcionario.getSalary() * 0.9;
        }
    }
}