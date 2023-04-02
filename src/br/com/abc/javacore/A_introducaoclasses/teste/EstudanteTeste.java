package br.com.abc.javacore.A_introducaoclasses.teste;

import br.com.abc.javacore.A_introducaoclasses.classes.Estudante;

public class EstudanteTeste {
    public static void main(String[] args) {

        Estudante gabriel = new Estudante();
        gabriel.nome = "Gabriel";
        gabriel.matricula = "202105031";
        gabriel.idade = 21;

        System.out.println(gabriel.nome);
        System.out.println(gabriel.matricula);
        System.out.println(gabriel.idade);
    }
}
