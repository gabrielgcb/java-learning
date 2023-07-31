package academy.devdojo.maratonajava.javacore.Ycolecoes.dominio;

import java.util.Objects;

public class Filme implements Comparable<Filme> {

    private Long id;
    private String nome;
    private double preco;
    private int quantidade;

    public Filme(Long id, String nome, double preco) {
        Objects.requireNonNull(id, "Id não pode ser nulo");
        Objects.requireNonNull(nome, "Nome não pode ser nulo");
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Filme(Long id, String nome, double preco, int quantidade) {
        this(id, nome, preco);
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Filme filme = (Filme) o;
        return Objects.equals(id, filme.id) && Objects.equals(nome, filme.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(Filme outroFilme) {
        // return negativo se this < outroFilme
        // return 0 se this == outroFilme
        // return positivo se this > outroFilme

//        if(this.id < outroFilme.getId())
//            return -1;
//        if(this.id.equals(outroFilme.getId()))
//            return 0;
//        return 1;

//        return Double.compare(preco, outroFilme.getPreco()); // comparando por tipo primitivo, nesse caso preço
//        return Double.valueOf(preco).compareTo(outroFilme.getPreco());

//        return this.id.compareTo(outroFilme.getId()); // wrappers possuem os próprios métodos para comparar
        return this.nome.compareTo(outroFilme.getNome());
    }
}
