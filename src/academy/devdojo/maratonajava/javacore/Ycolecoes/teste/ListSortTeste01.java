package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Filme;

public class ListSortTeste01 {
    public static void main(String[] args) {

//        List<String> filmes = new ArrayList<>(6);
//        filmes.add("Homem-Aranha");
//        filmes.add("Vingadores Guerra Infinita");
//        filmes.add("Tron, o legado");
//        filmes.add("A origem");
//        filmes.add("Mamma Mia");
//        filmes.add("Happy Feet");
//
//        Collections.sort(filmes);
//
//        for(String filme : filmes) {
//            System.out.println(filme);
//        }
//
//        System.out.println("-----------");
//
//        List<Double> dinheiros = new ArrayList<>();
//        dinheiros.add(100.26);
//        dinheiros.add(55D);
//        dinheiros.add(78.45);
//        dinheiros.add(12.36);
//        dinheiros.add(25.99);
//
//        System.out.println(dinheiros);
//        Collections.sort(dinheiros);
//        System.out.println(dinheiros);

        Filme filme = new Filme(123L, "Homem Aranha", 156.99);
        Filme filme2 = new Filme(null, "fghfg", 45.6);
        System.out.println(filme.equals(filme2));

    }
}
