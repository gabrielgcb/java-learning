package br.com.abc.javacore.M_interfaces.classes;

import br.com.abc.javacore.J_modificadorfinal.classes.Transportavel;

public class Produto implements Tributavel, Transportavel {
    private String nome;
    private double peso;
    private double preco;
    private double precoFinal;
    private double frete;

    @Override
    public void calcularImposto(){
        precoFinal = this.preco + (preco * IMPOSTO);
    }

    @Override
    public void calcularFrete(){
        frete = (peso * preco) / 250;
    }

    public String toString(){
        return "Nome do produto: " + this.nome +
                "\nPreco: " + this.preco +
                "\nPeso: " + this.peso +
                "\nPreco Final com imposto: " + this.precoFinal +
                "\nValor do frete: " + this.frete;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
