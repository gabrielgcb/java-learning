package br.com.abc.poocursoemvideo.D_herancaparte2.classes;

public class Visitante extends Pessoa {

    public Visitante(String nome, int idade, char sexo) {
        super(nome, idade, sexo);
    }

    @Override
    public String toString() {
        return super.toString() + " Visitante{} ";
    }
}
