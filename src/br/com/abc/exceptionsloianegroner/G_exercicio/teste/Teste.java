package br.com.abc.exceptionsloianegroner.G_exercicio.teste;

import br.com.abc.exceptionsloianegroner.G_exercicio.dominio.Agenda;
import br.com.abc.exceptionsloianegroner.G_exercicio.dominio.Contato;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Agenda agenda = new Agenda();

        boolean isZero;

        do {
            System.out.println("---------- @DIGITE: ");
            System.out.println("(1) Para consultar um contato na agenda");
            System.out.println("(2) Para adicionar um novo contato na agenda");

            int digito = Integer.parseInt(scan.nextLine());

            if(digito == 1) {
                System.out.println(agenda);
            } else {
                Contato contato = new Contato();
                System.out.println("Informe o nome do novo contato: ");
                contato.setNome(scan.nextLine());
                System.out.println("Informe o telefone do novo contato: ");
                contato.setTelefone(scan.nextLine());
                agenda.setContatos(new Contato[]{contato});
            }
            System.out.println("Deseja continuar? ");
            System.out.println("(0) - Nao.");
            System.out.println("(1) - Sim.");
            digito = Integer.parseInt(scan.nextLine());
            if(digito == 0) {
                isZero = true;
            } else {
                isZero = false;
            }
        } while (!isZero);


    }
}
