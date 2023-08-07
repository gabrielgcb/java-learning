package academy.devdojo.maratonajava.javacore.ZZEstreams.teste;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Quadrinhos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamTeste02 {

    private static List<Quadrinhos> quadrinhosList = Arrays.asList(
            new Quadrinhos("O Espetacular Homem-Aranha", 9.99),
            new Quadrinhos("Quarteto Fantástico", 11.49),
            new Quadrinhos("Guerras Secretas", 6.89),
            new Quadrinhos("X-Men", 10.19),
            new Quadrinhos("Homem de Ferro", 11.89)
    );
    public static void main(String[] args) {

        List<String> titles = quadrinhosList.stream()
                .sorted((hq1, hq2) -> hq1.getTitulo().compareTo(hq2.getTitulo()))
                .filter((hq) -> hq.getPrice() < 10)
                .limit(2)
                .map(Quadrinhos::getTitulo)
                .collect(Collectors.toList());

        System.out.println(titles);
    }
}
