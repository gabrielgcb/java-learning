package br.com.abc.poocursoemvideo.E_polimorfismo.classes;

public class Goldfish extends Peixe {

    public Goldfish(float peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros, corEscama);
    }

    @Override
    public String toString() {
        return super.toString() + " Goldfish{} ";
    }

    @Override
    public void soltarBolha() {
        System.out.println("---------- @SUCESSO, O PEIXE DOURADO ESTA SOLTANDO BOLHAS.");
    }

    @Override
    public void locomover() {
        System.out.println("---------- @SUCESSO, O PEIXE DOURADO ESTA NADANDO.");
    }

    @Override
    public void alimentar() {
        System.out.println("---------- @SUCESSO, O PEIXE DOURADO ESTA SE ALIMENTANDO.");
    }

    @Override
    public void emitirSom() {
        System.out.println("---------- @SUCESSO, O PEIXE DOURADO ESTA EMITINDO SOM.");
    }
}
