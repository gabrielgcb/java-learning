package academy.devdojo.maratonajava.javacore.ZZEstreams.teste;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Quadrinhos;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

import static academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion.NORMAL_PRICE;
import static academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion.UNDER_PROMOTION;
import static java.util.stream.Collectors.groupingBy;

public class StreamTeste14 {
    private static final List<Quadrinhos> quadrinhosList = Arrays.asList(
            new Quadrinhos("O Espetacular Homem-Aranha", 9.99, Category.DRAMA),
            new Quadrinhos("Quarteto Fantástico", 11.49, Category.FANTASY),
            new Quadrinhos("Guerras Secretas", 6.89, Category.DRAMA),
            new Quadrinhos("X-Men", 10.19, Category.FANTASY),
            new Quadrinhos("X-Men", 10.19, Category.FANTASY),
            new Quadrinhos("Homem de Ferro", 11.89, Category.ROMANCE),
            new Quadrinhos("Homem de Ferro", 11.89, Category.ROMANCE)
    );

    public static void main(String[] args) {

        Map<Category, Long> collect = quadrinhosList.stream().collect(groupingBy(Quadrinhos::getCategory, Collectors.counting()));
        System.out.println(collect);

        quadrinhosList
                .stream()
                .collect(groupingBy(Quadrinhos::getCategory,
                                    Collectors.maxBy(Comparator.comparing(Quadrinhos::getPrice))))
                .forEach((category, quadrinhos) -> System.out.println(category + " " + quadrinhos.get()));

    }
}
