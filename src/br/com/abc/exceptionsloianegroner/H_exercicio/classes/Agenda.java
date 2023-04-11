package br.com.abc.exceptionsloianegroner.H_exercicio.classes;

import java.util.Arrays;

public class Agenda {
    private Contato[] contatos;

    public Agenda() {
        contatos = new Contato[5];
    }

    public void adicionarContatos(Contato contato) throws AgendaCheiaException {
        boolean cheia = true;
        for(int i=0; i<contatos.length; i++) {
            if(contatos[i] != null) {
                contatos[i] = contato;
                cheia = false;
            }
            if(cheia) {
                throw new AgendaCheiaException();
            }
        }
    }

    public void consultarContatoPorNome(String nome) {

    }

    @Override
    public String toString() {
        return "Agenda{" +
                "contatos=" + Arrays.toString(contatos) +
                "}\n";
    }


}
