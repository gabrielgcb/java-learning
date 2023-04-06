package br.com.abc.poocursoemvideo.D_herancaparte2.classes;

public class Bolsista extends Aluno {

    private float bolsa;

    public Bolsista(String nome, int idade, char sexo, String matricula, String curso, float bolsa) {
        super(nome, idade, sexo, matricula, curso);
        this.bolsa = bolsa;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Bolsista{" +
                "bolsa=" + this.bolsa +
                "} ";
    }

    public void renovarBolsa() {
        System.out.println("---------- @SUCESSO, A BOLSA DO ALUNO " + this.nome + " FOI RENOVADA.");
    }

    @Override
    public void pagarMensalidade() {
        System.out.println("--------- @SUCESSO, A MENSALIDADE DO BOLSISTA " + this.nome + " FOI PAGA.");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
