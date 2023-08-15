package entities;

public class Funcionario {

    private Cargo cargo;
    private Double salary;

    public Funcionario(Cargo cargo, Double salary) {
        this.cargo = cargo;
        this.salary = salary;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
