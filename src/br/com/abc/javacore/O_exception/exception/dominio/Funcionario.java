package br.com.abc.javacore.O_exception.exception.dominio;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa {

    public void salvar() throws LoginInvalidoException {
        System.out.println("Salvando funcionario");
    }
}
