package br.com.abc.javacore.N_polimorfismo.classes;

public abstract class Funcionario {

    protected String nome;
    protected float salario;

    public Funcionario(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + this.nome + '\'' +
                ", salario=" + this.salario +
                '}';
    }

    public abstract void calcularPagamento();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
