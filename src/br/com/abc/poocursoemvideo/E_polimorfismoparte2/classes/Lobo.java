package br.com.abc.poocursoemvideo.E_polimorfismoparte2.classes;

import java.sql.SQLOutput;

public class Lobo extends Mamifero {

    public Lobo(float peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
    }

    @Override
    public String toString() {
        return super.toString() + " Lobo{} ";
    }

    @Override
    public void emitirSom() {
        System.out.println("---------- @SUCESSO, O LOBO ESTA EMITINDO SOM 'AUUUUU AUUUU AUUU'");
    }
}
