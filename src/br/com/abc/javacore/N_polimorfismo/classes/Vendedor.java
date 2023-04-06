package br.com.abc.javacore.N_polimorfismo.classes;

public class Vendedor extends Funcionario {

    private float totalVendas;

    public Vendedor(String nome, float salario, float totalVendas) {
        super(nome, salario);
        this.totalVendas = totalVendas;
    }

    @Override
    public String toString() {
        return "Vendedor{" + super.toString() +
                " totalVendas=" + this.totalVendas +
                "}";
    }

    @Override
    public void calcularPagamento() {
        this.salario += (totalVendas * 0.05);
    }

    public float getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(float totalVendas) {
        this.totalVendas = totalVendas;
    }
}
