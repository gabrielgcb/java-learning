package br.com.abc.exceptionsloianegroner.F_criandoexcecao;

public class DivisaoNaoExata extends Exception {

    private int num;
    private int denominador;

    public DivisaoNaoExata(int num, int denominador) {
        super();
        this.num = num;
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return "Resultado de " + num + "/" + denominador + " nao e um inteiro.";
    }
}
