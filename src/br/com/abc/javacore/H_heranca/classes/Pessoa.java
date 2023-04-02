package br.com.abc.javacore.H_heranca.classes;

public class Pessoa extends Object {
    // Modificador de acesso 'protected' -> os atributos da classe podem ser acessados caso a classe chamadora
    // seja do mesmo pacote, ou seja uma subclasse/filha da classe que possui os respectivos atributos.
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    public Pessoa(String nome) {
        System.out.println("Dentro do construtor de pessoa.");
        this.nome = nome;
    }

    static {
        System.out.println("Bloco de inicializacao estatico de pessoa");
    }

    {
        System.out.println("Bloco de inicializacao de pessoa 1");
    }

    {
        System.out.println("Bloco de inicializacao de pessoa 2");
    }


    public void imprime() {
        System.out.println("--------------------\nDados da pessoa: ");
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Endereco: " + this.endereco.getRua() + " " + this.endereco.getBairro());
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return this.cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public Endereco getEndereco() {
        return this.endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
