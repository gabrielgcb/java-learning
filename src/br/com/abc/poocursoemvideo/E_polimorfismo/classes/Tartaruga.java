package br.com.abc.poocursoemvideo.E_polimorfismo.classes;

public class Tartaruga extends Reptil {

    public Tartaruga(float peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros, corEscama);
    }

    @Override
    public String toString() {
        return super.toString() + " Tartaruga{} ";
    }

    @Override
    public void locomover() {
        System.out.println("-------- @SUCESSO, A TARTARUGA ESTA SE LOCOMOVENDO BEEEEEEM DEVAGAR.");
    }

    @Override
    public void alimentar() {
        System.out.println("-------- @SUCESSO, A TARTARUGA ESTA SE ALIMENTADO.");
    }

    @Override
    public void emitirSom() {
        System.out.println("-------- @SUCESSO, A TARTARUGA ESTA EMITINDO SOM.");
    }

}
