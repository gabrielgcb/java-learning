package academy.devdojo.maratonajava.javacore.ZZEstreams.teste;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Quadrinhos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamTeste03 {

    private static List<Quadrinhos> quadrinhosList = Arrays.asList(
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

        Stream<Quadrinhos> stream = quadrinhosList.stream();

        quadrinhosList.forEach(quadrinho -> System.out.println(quadrinho));

        long count = stream.filter(hq -> hq.getPrice() < 11)
                .count();
        System.out.println(count);

        long count2 = quadrinhosList.stream()
                .distinct()
                .filter(hq -> hq.getPrice() < 11)
                .count();
        System.out.println(count2);
    }
}
