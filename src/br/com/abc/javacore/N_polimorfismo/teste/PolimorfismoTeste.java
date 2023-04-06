package br.com.abc.javacore.N_polimorfismo.teste;

import br.com.abc.javacore.N_polimorfismo.classes.Funcionario;
import br.com.abc.javacore.N_polimorfismo.classes.Gerente;
import br.com.abc.javacore.N_polimorfismo.classes.RelatorioPagamento;
import br.com.abc.javacore.N_polimorfismo.classes.Vendedor;

public class PolimorfismoTeste {
    public static void main(String[] args) {

        RelatorioPagamento relatorio = new RelatorioPagamento();

        Vendedor v = new Vendedor("LUIZ JOSE", 5400f, 10000);
        //relatorioPagamento.relatorioPagamentoVendedor(v1);
        relatorio.relatorioPagamentoGenerico(v);

        Gerente g = new Gerente("GABRIEL G C BISPO", 7600f, 3500f);
        //relatorioPagamento.relatorioPagamentoGerente(g);
        relatorio.relatorioPagamentoGenerico(g);

    }
}
