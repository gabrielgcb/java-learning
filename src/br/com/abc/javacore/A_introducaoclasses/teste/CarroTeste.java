package br.com.abc.javacore.A_introducaoclasses.teste;

import br.com.abc.javacore.A_introducaoclasses.classes.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.modelo = "Gol";
        carro.placa = "OGM-4435";
        carro.velocidadeMaxima = 240f;

        System.out.println(carro.modelo);
        System.out.println(carro.placa);
        System.out.println(carro.velocidadeMaxima);
    }
}
