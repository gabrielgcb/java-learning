package br.com.abc.javacore.L_classesabstratas.classes;

public class Gerente extends Funcionario {

    public Gerente() {
    }
    public Gerente(String nome, String clt, double salario) {
        super(nome, clt, salario);
    }

    @Override
    public void calculaSalario() {
        this.salario = this.salario + (this.salario * 0.2);
    }



}
