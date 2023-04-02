package br.com.abc.javacore.F_modificadorestatico.teste;


import br.com.abc.javacore.F_modificadorestatico.classes.Cliente;

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        Cliente c3 = new Cliente();

        System.out.println("Exibindo quantidade de parcelas possiveis: ");
        for(int parcela : c1.getParcelas()) {
            System.out.print(parcela + " ");
        }
        System.out.println();
        for(int parcela : c2.getParcelas()) {
            System.out.print(parcela + " ");
        }
        System.out.println();
        for(int parcela : c3.getParcelas()) {
            System.out.print(parcela + " ");
        }

        System.out.println("\ntamanho: " + Cliente.getParcelas().length);

    }
}
