package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Filme;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTeste01 {
    public static void main(String[] args) {

        // não permite elementos duplicados e são organizados pelo hash, a nao ser que utiliza o Linked
        Set<Filme> filmes = new HashSet<>();
        //Set<Filme> filmes = new LinkedHashSet<>();

        filmes.add(new Filme(5L, "Homem Aranha", 25.99, 5));
        filmes.add(new Filme(1L, "Vingadores Guerra Infinita", 56.99, 2));
        filmes.add(new Filme(56L, "Tron, o legado", 15.99, 0));
        filmes.add(new Filme(25L, "A origem", 22.49, 0));
        filmes.add(new Filme(7L, "Mamma Mia", 15.49, 3));
        filmes.add(new Filme(11L, "Happy Feet", 9.90, 0));
        filmes.add(new Filme(11L, "Happy Feet", 8.4, 5));

        for(Filme filme : filmes) {
            System.out.println(filme);
        }

    }
}
