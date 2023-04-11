package br.com.abc.exceptionsloianegroner.H_exercicio.classes;

public class AgendaCheiaException extends Exception {

    @Override
    public String getMessage() {
        return "Nao e possivel adicionar mais contatos, pois a agenda esta cheia";
    }
}
