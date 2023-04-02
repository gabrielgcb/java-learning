package br.com.abc.javacore.J_modificadorfinal.classes;

public final class Carro { // Uma classe final não pode ser extendida, é uma classe perfeita
    public static final double VELOCIDADE_FINAL = 250;
    private final Comprador COMPRADOR = new Comprador(); // Para inicializar um variavel do tipo reference, nós criamos
                                                            // um novo objeto.
    private String nome;
    private String marca;

    @Override
    public String toString() {
        return "Nome: " + this.nome +
                "\nMarca: " + this.marca;
    }

    public final void imprime() { // Um método final não pode ser sobrescrito, ou seja, deverá sempre ter o
                                    // mesmo comportamento em todas as classes filhas, é um método perfeito
    }
    public Comprador getComprador() {
        return COMPRADOR;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

}
