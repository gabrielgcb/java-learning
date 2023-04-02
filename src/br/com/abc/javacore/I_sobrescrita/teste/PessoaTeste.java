package br.com.abc.javacore.I_sobrescrita.teste;

import br.com.abc.javacore.I_sobrescrita.classes.Pessoa;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Joaquina Santana");
        p.setIdade(120);
        System.out.println(p);
    }
}
