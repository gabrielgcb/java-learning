package br.com.abc.javacore.H_heranca.classes;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor de funcionario.");
    }

    static {
        System.out.println("Bloco de inicializacao estatico de funcionario");
    }

    {
        System.out.println("Bloco de inicializacao de funcionario 1");
    }

    {
        System.out.println("Bloco de inicializacao de funcionario 2");
    }

    public void imprime() {
        super.imprime();
        System.out.println("Salario: R$" + this.salario);
        imprimeReciboPagamento();
    }

    public void imprimeReciboPagamento() {
        System.out.println("Eu " + super.nome + " recebi o pagamento de R$" + this.salario);
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
