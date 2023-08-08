package academy.devdojo.maratonajava.javacore.ZZEstreams.teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class StreamTeste07 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 16, 7, 8, 9);

        numeros.stream().reduce((x, y) -> x + y).ifPresent(System.out::println);
        System.out.println(numeros.stream().reduce(0, (x, y) -> x + y));

        numeros.stream().reduce(Integer::sum).ifPresent(System.out::println);
        System.out.println(numeros.stream().reduce(0, Integer::sum));

        System.out.println("--------------------");

        numeros.stream().reduce((x, y) -> x * y).ifPresent(System.out::println);
        System.out.println(numeros.stream().reduce(1, (x, y) -> x * y));

        System.out.println("--------------------");

        System.out.println(numeros.stream().max(Integer::compareTo).get());
        System.out.println(numeros.stream().reduce(Integer::max).get());


    }
}
