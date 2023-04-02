package br.com.abc.javacore.M_interfaces.teste;

import br.com.abc.javacore.M_interfaces.classes.Produto;

public class InterfaceTeste {
    public static void main(String[] args) {
        Produto p = new Produto();
        p.setNome("PC GAMER");
        p.setPeso(5d);
        p.setPreco(10000d);
        p.calcularImposto();
        p.calcularFrete();
        System.out.println(p);

    }
}
