package br.com.abc.javacore.O_exception.exception.teste;

import br.com.abc.javacore.O_exception.exception.dominio.Funcionario;
import br.com.abc.javacore.O_exception.exception.dominio.LoginInvalidoException;
import br.com.abc.javacore.O_exception.exception.dominio.Pessoa;

public class SobrescritaComExceptionTeste01 {
    public static void main(String[] args) {

        Pessoa p = new Pessoa();
        Funcionario f = new Funcionario();

        try {
            f.salvar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }

    }
}
