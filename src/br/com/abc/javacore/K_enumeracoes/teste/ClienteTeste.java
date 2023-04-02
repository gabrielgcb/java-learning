package br.com.abc.javacore.K_enumeracoes.teste;

import br.com.abc.javacore.K_enumeracoes.classes.Cliente;
import br.com.abc.javacore.K_enumeracoes.classes.TipoCliente;

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Gabriel", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.APRAZO);
        System.out.println(cliente);
    }
}
