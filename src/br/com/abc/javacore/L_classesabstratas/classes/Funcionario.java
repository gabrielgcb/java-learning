package br.com.abc.javacore.L_classesabstratas.classes;

import br.com.abc.javacore.L_classesabstratas.Pessoa;

public abstract class Funcionario extends Pessoa { //Não pode ser instaciada, apenas extendida
    protected String clt;
    protected double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String clt, double salario) {
        this.nome = nome;
        this.clt = clt;
        this.salario = salario;
    }

    @Override
    public String toString() { //Método concreto, por independente da classe, irá funcionar da mesma maneina
                                // em todas as subclasses
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", clt='" + clt + '\'' +
                ", salario=" + salario +
                '}';
    }

    public abstract void calculaSalario();

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getClt() {
        return clt;
    }
    public void setClt(String clt) {
        this.clt = clt;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
