package br.com.abc.javacore.E_blocodeinicializacao.teste;

import br.com.abc.javacore.E_blocodeinicializacao.classes.Cliente;

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        System.out.println("Exibindo quantidade de parcelas possiveis: ");
        for(int parcela : c1.getParcelas()) {
            System.out.print(parcela + " ");
        }
    }
}
