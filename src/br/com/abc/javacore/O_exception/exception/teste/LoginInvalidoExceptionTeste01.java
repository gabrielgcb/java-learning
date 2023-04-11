package br.com.abc.javacore.O_exception.exception.teste;

import br.com.abc.javacore.O_exception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTeste01 {
    public static void main(String[] args) {

        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner scan = new Scanner(System.in);

        String usernameDB = "Gabriel";
        String senhaDB = "123456";

        System.out.print("Usuario: ");
        String usernameDigitado = scan.nextLine();
        System.out.print("Senha: ");
        String senhaDigitada = scan.nextLine();

        if (usernameDigitado.equals(usernameDB) && senhaDigitada.equals(senhaDB)) {
            System.out.println("Login realizado com sucesso!");
        } else {
            throw new LoginInvalidoException("Usuario ou senha invalidos.");
        }
    }

}
