package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Filme;

import java.util.LinkedList;
import java.util.List;

public class IteratorTeste01 {
    public static void main(String[] args) {

        List<Filme> filmes = new LinkedList<>();

        filmes.add(new Filme(5L, "Homem Aranha", 25.99, 5));
        filmes.add(new Filme(1L, "Vingadores Guerra Infinita", 56.99, 2));
        filmes.add(new Filme(56L, "Tron, o legado", 15.99, 0));
        filmes.add(new Filme(25L, "A origem", 22.49, 0));
        filmes.add(new Filme(7L, "Mamma Mia", 15.49, 3));
        filmes.add(new Filme(11L, "Happy Feet", 9.90, 0));

//        Iterator<Filme> filmeIterator = filmes.iterator();
//        while(filmeIterator.hasNext()) {
//            Filme filme = filmeIterator.next();
//            if(filme.getQuantidade() == 0) {
//                filmeIterator.remove();
//            }
//        }

        // programação funcional
        filmes.removeIf(filme -> filme.getQuantidade() == 0);
        System.out.println(filmes);

    }
}
