package academy.devdojo.maratonajava.javacore.ZZEstreams.teste;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Quadrinhos;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StreamTeste06 {

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

        System.out.println("Alguma hq custa mais que 11? " +
                quadrinhosList.stream().anyMatch(quadrinho -> quadrinho.getPrice() > 11));

        System.out.println("Todas as hqs tem um preço maior que 0? " +
                quadrinhosList.stream().allMatch(quadrinho -> quadrinho.getPrice() > 0));

        System.out.println("Alguma hq custa menos que 0? " +
                quadrinhosList.stream().noneMatch(quadrinho -> quadrinho.getPrice() < 0));

        quadrinhosList.stream()
                .filter(hq -> hq.getPrice() > 3)
                .findAny()
                .ifPresent(System.out::println);

        quadrinhosList.stream()
                .sorted(Comparator.comparing(Quadrinhos::getTitulo).reversed())
                .findFirst()
                .ifPresent(System.out::println);

    }
}
