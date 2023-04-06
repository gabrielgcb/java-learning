package br.com.abc.javacore.N_polimorfismo.classes;

public class Gerente extends  Funcionario {

    private float participacaoNosLucros;

    public Gerente(String nome, float salario, float participacaoNosLucros) {
        super(nome, salario);
        this.participacaoNosLucros = participacaoNosLucros;
    }

    @Override
    public String toString() {
        return "Gerente{"+ super.toString() +
                "participacaoNosLucros=" + participacaoNosLucros +
                "}";
    }

    @Override
    public void calcularPagamento() {
        this.salario += (this.participacaoNosLucros*0.2);
    }

    public float getParticipacaoNosLucros() {
        return participacaoNosLucros;
    }

    public void setParticipacaoNosLucros(float participacaoNosLucros) {
        this.participacaoNosLucros = participacaoNosLucros;
    }
}
