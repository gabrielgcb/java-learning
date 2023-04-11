package br.com.abc.exceptionsloianegroner.G_exercicio.dominio;

import java.util.Arrays;

public class Agenda {

    private Contato[] contatos;

    @Override
    public String toString() {
        return "Agenda{" +
                "contatos=" + Arrays.toString(contatos) +
                '}';
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }
}
