package entities;

public enum Cargo {

    DESENVOLVEDOR(new Calcular10Ou20PorCento()),
    DBA(new Calcular15Ou25PorCento()),
    TESTER(new Calcular15Ou25PorCento());

    Cargo(RegraCalculo regraCalculo) {
        this.regraCalculo = regraCalculo;
    }

    private RegraCalculo regraCalculo;

    public RegraCalculo getRegraCalculo() {
        return regraCalculo;
    }
}
