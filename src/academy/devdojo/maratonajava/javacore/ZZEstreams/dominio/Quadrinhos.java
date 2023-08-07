package academy.devdojo.maratonajava.javacore.ZZEstreams.dominio;

import java.util.Objects;

public class Quadrinhos {

    private String titulo;
    private double price;

    public Quadrinhos(String titulo, double price) {
        this.titulo = titulo;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Quadrinhos{" +
                "titulo='" + titulo + '\'' +
                ", price=" + price +
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
}
