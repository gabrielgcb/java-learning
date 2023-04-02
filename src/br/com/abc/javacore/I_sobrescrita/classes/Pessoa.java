package br.com.abc.javacore.I_sobrescrita.classes;

public class Pessoa extends Object {
    private String nome;
    private int idade;

    // A sobrescrita de métodos altera o comportamento do método na subclasse que foi originalmente
    // definido na superclasse
    @Override
    public String toString() {
        super.toString();
        return "Nome: " + this.nome +
                "\nIdade: " + this.idade;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
