package academy.devdojo.maratonajava.javacore.ZZEstreams.teste;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Quadrinhos;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;

public class StreamTeste08 {
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

        quadrinhosList.stream()
                .map(Quadrinhos::getPrice)
                .filter(price -> price > 11)
                .reduce(Double::sum)
                .ifPresent(System.out::println);

        System.out.println(quadrinhosList.stream()
                .mapToDouble(Quadrinhos::getPrice)
                .filter(price -> price > 11)
                .sum());

    }
}
