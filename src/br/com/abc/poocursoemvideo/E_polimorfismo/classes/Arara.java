package br.com.abc.poocursoemvideo.E_polimorfismo.classes;

public class Arara extends Ave {

    public Arara(float peso, int idade, int membros, String corPena) {
        super(peso, idade, membros, corPena);
    }

    @Override
    public String toString() {
        return super.toString() + " Arara{} ";
    }

    @Override
    public void locomover() {
        System.out.println("---------- @SUCESSO, A ARARA ESTA VOANDO.");
    }

    @Override
    public void alimentar() {
        System.out.println("---------- @SUCESSO, A ARARA SE ALIMENTANDO.");

    }

    @Override
    public void emitirSom() {
        System.out.println("---------- @SUCESSO, A ARARA ESTA EMITINDO UM SOM.");
    }

    @Override
    public void fazerNinho() {
        System.out.println("---------- @SUCESSO, A ARARA ESTA FAZENDO O NINHO.");
    }
}
