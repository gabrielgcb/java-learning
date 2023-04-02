package br.com.abc.javacore.K_enumeracoes.classes;

public enum TipoCliente { //Enumeracao é um tipo especial de classe, ou seja, pode possuir atributos e métodos
    PESSOA_FISICA(1, "Pessoa Fisica"), PESSOA_JURIDICA(2, "Pessoa Juridica");
    private int tipo;
    private String nome;


    TipoCliente(int tipo, String nome) {
        this.tipo = tipo;
        this.nome = nome;
    }

    public int getTipo() {
        return tipo;
    }
    public String getNome() {
        return this.nome;
    }

}
