package br.com.abc.javacore.H_heranca.teste;

import br.com.abc.javacore.H_heranca.classes.Endereco;
import br.com.abc.javacore.H_heranca.classes.Funcionario;
import br.com.abc.javacore.H_heranca.classes.Pessoa;

public class HerancaTeste {
    public static void main(String... args) {
        //Pessoa p1 = new Pessoa("Gabriel");
        //p1.setNome("Gabriel");
        //p1.setCpf("000.111.222-33");

        Endereco endereco = new Endereco();
        endereco.setRua("Rua 25");
        endereco.setBairro("Setor central");

        //p1.setEndereco(endereco);

        Funcionario f1 = new Funcionario("Luiz");
        f1.setEndereco(endereco);
        f1.setSalario(3500.50);
        f1.setCpf("123.456.789.00");

        //p1.imprime();
        //f1.imprime();

    }
}
