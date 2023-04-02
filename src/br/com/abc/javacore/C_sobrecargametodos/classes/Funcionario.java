package br.com.abc.javacore.C_sobrecargametodos.classes;

public class Funcionario {
    private String nome;
    private String cpf;
    private float salario;
    private String rg;

    //Metodos de inicializaçao >init<
    public void init(String nome, String cpf, float salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }
    public void init(String nome, String cpf, float salario, String rg) {
        init(nome, cpf, salario);
        this.rg = rg;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getNome() {
        return this.nome;
    }
    public String getCpf() {
        return this.cpf;
    }
    public float getSalario() {
        return this.salario;
    }
    public String getRg() {
        return this.rg;
    }

    public void imprimeDadosFuncionario() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Salario: " + this.salario);
        System.out.println("RG: " + this.rg);
    }
}
