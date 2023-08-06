package academy.devdojo.maratonajava.javacore.ZZDoptional.repositorio;

import academy.devdojo.maratonajava.javacore.ZZDoptional.dominio.Filme;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class FilmeRepository {

    public static List<Filme> listFilmes = List.of(
            new Filme(1, "Os Vingadores"),
            new Filme(2, "Tron"),
            new Filme(3, "A origem"),
            new Filme(4, "007"),
            new Filme(5, "Mamma mia")
    );

    public static Optional<Filme> findByTitle(String title) {
        return findBy(filme -> filme.getTitulo().equalsIgnoreCase(title));
    }

    public static Optional<Filme> findById(Integer id) {
        return findBy(filme -> filme.getId().equals(id));
    }

    public static Optional<Filme> findBy(Predicate<Filme> predicate) {
        Filme found = null;
        for(Filme filme : listFilmes) {
            if(predicate.test(filme)) {
                found = filme;
            }
        }
        return Optional.ofNullable(found);
    }
}
