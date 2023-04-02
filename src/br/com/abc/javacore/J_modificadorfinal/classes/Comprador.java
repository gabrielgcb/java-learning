package br.com.abc.javacore.J_modificadorfinal.classes;

public class Comprador {
    private String nome;

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Comprador{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
