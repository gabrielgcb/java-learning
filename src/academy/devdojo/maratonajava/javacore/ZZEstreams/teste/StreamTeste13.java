package academy.devdojo.maratonajava.javacore.ZZEstreams.teste;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Quadrinhos;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collectors;

import static academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion.*;
import static java.util.stream.Collectors.groupingBy;

public class StreamTeste13 {
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
        Map<Object, List<Quadrinhos>> collect = quadrinhosList
                .stream()
                .collect(groupingBy(quadrinhos ->
                        quadrinhos.getPrice() < 10 ? UNDER_PROMOTION : NORMAL_PRICE)
                );

        System.out.println(collect);

        System.out.println("----------------------------");

        Map<Category, Map<Promotion, List<Quadrinhos>>> collect1 = quadrinhosList
                .stream()
                .collect(groupingBy(Quadrinhos::getCategory, groupingBy(quadrinhos -> quadrinhos.getPrice() < 10 ? UNDER_PROMOTION : NORMAL_PRICE)
                ));

        System.out.println(collect1);
    }
}
