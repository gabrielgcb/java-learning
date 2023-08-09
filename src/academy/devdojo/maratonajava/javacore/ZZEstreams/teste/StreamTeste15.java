package academy.devdojo.maratonajava.javacore.ZZEstreams.teste;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Quadrinhos;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class StreamTeste15 {
    private static final List<Quadrinhos> quadrinhosList = Arrays.asList(
            new Quadrinhos("O Espetacular Homem-Aranha", 9.99, Category.DRAMA),
            new Quadrinhos("Quarteto Fantástico", 8.49, Category.FANTASY),
            new Quadrinhos("Guerras Secretas", 6.89, Category.DRAMA),
            new Quadrinhos("X-Men", 10.19, Category.FANTASY),
            new Quadrinhos("X-Men", 10.19, Category.FANTASY),
            new Quadrinhos("Homem de Ferro", 11.89, Category.ROMANCE),
            new Quadrinhos("Homem de Ferro", 11.89, Category.ROMANCE)
    );

    public static void main(String[] args) {

        System.out.println(quadrinhosList
                .stream()
                .collect(Collectors.groupingBy(Quadrinhos::getCategory,
                        Collectors.summarizingDouble(Quadrinhos::getPrice)))
        );

        Map<Category, Map<Promotion, DoubleSummaryStatistics>> collect = quadrinhosList
                .stream()
                .collect(groupingBy(Quadrinhos::getCategory,
                         groupingBy(quadrinhos -> quadrinhos.getPrice() < 10 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE,
                                Collectors.summarizingDouble(Quadrinhos::getPrice))
                ));

        System.out.println(collect);
    }
}
