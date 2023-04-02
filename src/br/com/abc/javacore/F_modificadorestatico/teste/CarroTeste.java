package br.com.abc.javacore.F_modificadorestatico.teste;

import br.com.abc.javacore.F_modificadorestatico.classes.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(220);
        System.out.println(Carro.getVelocidadeLimite());

        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Audi", 275);
        Carro c3 = new Carro("Mercedes", 290);

        c1.imprimeDadosCarro();
        c2.imprimeDadosCarro();
        c3.imprimeDadosCarro();

        System.out.println("######################################");

        c1.imprimeDadosCarro();
        c2.imprimeDadosCarro();
        c3.imprimeDadosCarro();

    }
}
