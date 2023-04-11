package br.com.abc.exceptionsloianegroner.H_exercicio.teste;


import br.com.abc.exceptionsloianegroner.H_exercicio.classes.Agenda;
import br.com.abc.exceptionsloianegroner.H_exercicio.classes.Contato;

public class Teste {
    public static void main(String[] args) {

        Contato c1 = new Contato();
        c1.setNome("Gabriel Guimaraes");
        Contato c2 = new Contato();
        c2.setNome("Lucas Guimaraes");
        Contato c3 = new Contato();
        c3.setNome("Glaucineia Guimaraes");

        Agenda agenda = new Agenda();
        System.out.println(agenda);
    }
}
