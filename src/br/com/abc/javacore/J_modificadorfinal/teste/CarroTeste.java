package br.com.abc.javacore.J_modificadorfinal.teste;

import br.com.abc.javacore.J_modificadorfinal.classes.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro c = new Carro();

        System.out.println(c.getComprador());
        c.getComprador().setNome("Gabriel");
        System.out.println(c.getComprador());

    }
}
