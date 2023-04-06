package br.com.abc.javacore.N_polimorfismoparte2.teste;

import br.com.abc.javacore.N_polimorfismoparte2.classes.ArquivoDAOImpl;
import br.com.abc.javacore.N_polimorfismoparte2.classes.GenericDAO;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DAOTeste {
    public static void main(String[] args) {
        //ArquivoDAOImpl arquivoDAO = new ArquivoDAOImpl();
        //DatavaseDAOImpl databaseDAO = new DataBaseImpl();

        //GenericDAO arquivoDAO = new DatabaseDAOImpl(); //Não é vantajoso trocar a variavel de referencia, quando
        GenericDAO arquivoDAO = new ArquivoDAOImpl();      //se trabalha com coleção de java

        arquivoDAO.save();

        List<String> lista = new LinkedList<>(); // ou ArrayList<>()
        lista.add("Nome 1");
        lista.add("Nome 2");
        lista.add("Nome 3");
        lista.add("Nome 4");

        for(String nome : lista) {
            System.out.println(nome);
        }

    }
}
