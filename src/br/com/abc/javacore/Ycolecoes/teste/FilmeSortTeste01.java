package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Filme;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class FilmeById implements Comparator<Filme> {
    @Override
    public int compare(Filme filme1, Filme filme2) {
        return filme1.getId().compareTo(filme2.getId());
    }
}

public class FilmeSortTeste01 {
    public static void main(String[] args) {

        List<Filme> filmes = new ArrayList<>(6);

        filmes.add(new Filme(5L, "Homem Aranha", 25.99));
        filmes.add(new Filme(1L, "Vingadores Guerra Infinita", 56.99));
        filmes.add(new Filme(56L, "Tron, o legado", 15.99));
        filmes.add(new Filme(25L, "A origem", 22.49));
        filmes.add(new Filme(7L, "Mamma Mia", 15.49));
        filmes.add(new Filme(11L, "Happy Feet", 9.90));

        for(Filme filme : filmes) {
            System.out.println(filme);
        }

        System.out.println("--------------");
        Collections.sort(filmes);
        for(Filme filme : filmes) {
            System.out.println(filme);
        }

        System.out.println("--------------");
//        Collections.sort(filmes, new FilmeById());
        filmes.sort(new FilmeById());
        for(Filme filme : filmes) {
            System.out.println(filme);
        }

    }
}
