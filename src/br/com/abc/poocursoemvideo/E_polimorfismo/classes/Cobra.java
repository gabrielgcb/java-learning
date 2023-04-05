package br.com.abc.poocursoemvideo.E_polimorfismo.classes;

public class Cobra extends Reptil {

    public Cobra(float peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros, corEscama);
    }

    @Override
    public String toString() {
        return super.toString() + " Cobra{} ";
    }

    @Override
    public void locomover() {
        System.out.println("--------- @SUCESSO, A COBRA ESTA SE ARRASTANDO.");
    }

    @Override
    public void alimentar() {
        System.out.println("--------- @SUCESSO, A COBRA ESTA SE ALIMENTANDO.");
    }

    @Override
    public void emitirSom() {
        System.out.println("--------- @SUCESSO, A COBRA ESTA EMITINDO SOM.");
    }
}
