package br.com.abc.exceptionsloianegroner.G_exercicio.teste;

import br.com.abc.exceptionsloianegroner.G_exercicio.dominio.Agenda;
import br.com.abc.exceptionsloianegroner.G_exercicio.dominio.Contato;

import java.util.Scanner;

public class Teste2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Contato[] contatos = new Contato[5];
        Agenda agenda = new Agenda();

        int i = 0;
        boolean isZero;

        do {
            System.out.println("---------- @DIGITE: ");
            System.out.println("(1) Para consultar um contato na agenda");
            System.out.println("(2) Para adicionar um novo contato na agenda");

            int digito = Integer.parseInt(scan.nextLine());

            if(digito == 1) {
                System.out.println(agenda);
            } else {
                System.out.println("Informe o nome do novo contato: ");
                contatos[i].setNome(scan.nextLine());
                System.out.println("Informe o telefone do novo contato: ");
                contatos[i].setTelefone(scan.nextLine());
                agenda.setContatos(new Contato[]{contatos[i]});
            }
            System.out.println("Deseja continuar? ");
            System.out.println("(0) - Nao.");
            System.out.println("(1) - Sim.");
            digito = Integer.parseInt(scan.nextLine());
            if(digito == 0) {
                isZero = true;
            } else {
                isZero = false;
                i++;
            }
        } while (!isZero);

    }
}
