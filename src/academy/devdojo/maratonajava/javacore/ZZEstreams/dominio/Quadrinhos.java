package academy.devdojo.maratonajava.javacore.ZZEstreams.dominio;

import java.util.Objects;

public class Quadrinhos {

    private String titulo;
    private double price;
    private Category category;

    public Quadrinhos(String titulo, double price) {
        this.titulo = titulo;
        this.price = price;
    }

    public Quadrinhos(String titulo, double price, Category category) {
        this(titulo, price);
        this.category = category;
    }

    @Override
    public String toString() {
        return "Quadrinhos{" +
                "titulo='" + titulo + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quadrinhos that = (Quadrinhos) o;
        return Objects.equals(titulo, that.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo);
    }

    public String getTitulo() {
        return titulo;
    }

    public double getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }
}
