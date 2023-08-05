package academy.devdojo.maratonajava.javacore.ZZClambdas.dominio;

import java.util.Objects;

public class Seriado {
    private String name;
    private int episodes;

    public Seriado(String name, int episodes) {
        this.name = name;
        this.episodes = episodes;
    }

    @Override
    public String toString() {
        return "Seriado{" +
                "name='" + name + '\'' +
                ", episodes=" + episodes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seriado seriado = (Seriado) o;
        return Objects.equals(name, seriado.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getName() {
        return name;
    }

    public int getEpisodes() {
        return episodes;
    }
}
