package br.com.abc.poocursoemvideo.E_polimorfismo.classes;

public class Canguru extends Mamifero {

    public Canguru(float peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
    }

    @Override
    public String toString() {
        return super.toString() + " Canguru{} ";
    }

    public void usarBolsa(){
        System.out.println("---------- @SUCESSO, O CANGURU ESTA USANDO A BOLSA.");
    }

    @Override
    public void locomover() {
        System.out.println("---------- @SUCESSO, O CANGURU ESTA SE LOCOMOVENDO.");
    }

    @Override
    public void alimentar() {
        System.out.println("---------- @SUCESSO, O CANGURU ESTA SE ALIMENTADO.");
    }

    @Override
    public void emitirSom() {
        System.out.println("---------- @SUCESSO, O CANGURU ESTA EMITINDO SOM.");
    }
}
