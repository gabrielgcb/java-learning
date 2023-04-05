package br.com.abc.poocursoemvideo.E_polimorfismo.classes;

public class Cachorro extends Mamifero {

    public Cachorro(float peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
    }

    @Override
    public String toString() {
        return  super.toString() + " Cachorro{} ";
    }

    public void enterrarOsso() {
        System.out.println("---------- @SUCESSO, O CACHORRO ESTA ENTERRANDO O OSSO.");
    }

    public void abanarRabo() {
        System.out.println("---------- @SUCESSO, O CACHORRO ESTA ABANANDO O RABO.");
    }

    @Override
    public void locomover() {
        System.out.println("---------- @SUCESSO, O CACHORRO ESTA SE LOCOMOVENDO.");
    }

    @Override
    public void alimentar() {
        System.out.println("---------- @SUCESSO, O CACHORRO ESTA SE ALIMENTANDO.");
    }

    @Override
    public void emitirSom() {
        System.out.println("---------- @SUCESSO, O CACHORRO ESTA LATINDO AU! AU! AU !");
    }
}
