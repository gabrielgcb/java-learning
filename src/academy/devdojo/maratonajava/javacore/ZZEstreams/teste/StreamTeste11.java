package academy.devdojo.maratonajava.javacore.ZZEstreams.teste;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Quadrinhos;

import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;

public class StreamTeste11 {
    private static final List<Quadrinhos> quadrinhosList = Arrays.asList(
            new Quadrinhos("O Espetacular Homem-Aranha", 9.99),
            new Quadrinhos("Quarteto Fantástico", 11.49),
            new Quadrinhos("Guerras Secretas", 6.89),
            new Quadrinhos("X-Men", 10.19),
            new Quadrinhos("X-Men", 10.19),
            new Quadrinhos("X-Men", 10.19),
            new Quadrinhos("X-Men", 10.19),
            new Quadrinhos("Homem de Ferro", 11.89),
            new Quadrinhos("Homem de Ferro", 11.89)
    );

    public static void main(String[] args) {
        System.out.println("usando stream: " + quadrinhosList.stream().count());
        System.out.println("usando Collectors: " + quadrinhosList.stream().collect(Collectors.counting()));

        quadrinhosList.stream().max(Comparator.comparing(Quadrinhos::getPrice)).ifPresent(valor -> System.out.println("usando stream: " + valor));
        quadrinhosList.stream().collect(Collectors.maxBy(Comparator.comparing(Quadrinhos::getPrice))).ifPresent(valor -> System.out.println("usando Collectors: " + valor));

        System.out.println("usando stream: " + quadrinhosList.stream().mapToDouble(Quadrinhos::getPrice).sum());
        System.out.println("usando Collectors: " + quadrinhosList.stream().collect(Collectors.summingDouble(Quadrinhos::getPrice)));

        quadrinhosList.stream().mapToDouble(Quadrinhos::getPrice).average().ifPresent(valor -> System.out.printf("usando stream: %.2f\n", valor));
        System.out.printf("usando Collectors: %.2f\n", quadrinhosList.stream().collect(Collectors.averagingDouble(Quadrinhos::getPrice)));

        System.out.println("-----------------");

        DoubleSummaryStatistics collect = quadrinhosList.stream().collect(Collectors.summarizingDouble(Quadrinhos::getPrice));
        System.out.println(collect);

        System.out.println(quadrinhosList.stream().map(Quadrinhos::getTitulo).collect(Collectors.joining(", ")));
    }
}
