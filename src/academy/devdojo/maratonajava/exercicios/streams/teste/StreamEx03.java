package academy.devdojo.maratonajava.exercicios.streams.teste;

import academy.devdojo.maratonajava.exercicios.streams.dominio.Produto;

import java.util.Comparator;
import java.util.List;
import java.util.function.DoublePredicate;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamEx03 {

    private static List<Produto> listProdutos = List.of(
            new Produto("PS4", 4500),
            new Produto("Bola de volei", 80),
            new Produto("Camisa social", 50),
            new Produto("Mochila", 129.90),
            new Produto("Tênis", 299),
            new Produto("Encordoamento", 78)
    );
    public static void main(String[] args) {
        System.out.println(listProdutos.stream().filter(p -> p.getPreco() < 100).collect(Collectors.toList()));

        listProdutos.stream().min(Comparator.comparing(Produto::getPreco)).ifPresent(System.out::println);
    }
}
