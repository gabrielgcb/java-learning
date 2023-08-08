package academy.devdojo.maratonajava.javacore.ZZEstreams.teste;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Quadrinhos;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class StreamTeste12 {
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

        quadrinhosList.stream().collect(Collectors.groupingBy(Quadrinhos::getCategory)).forEach((category, quadrinhos) -> System.out.println(category + " " + quadrinhos));

        System.out.println("-------------------------");
        
        Map<Category, List<Quadrinhos>> collect = quadrinhosList.stream().collect(Collectors.groupingBy(Quadrinhos::getCategory));
        System.out.println(collect);
    }
}
