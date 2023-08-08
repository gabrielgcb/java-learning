package academy.devdojo.maratonajava.javacore.ZZEstreams.teste;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTeste09 {
    public static void main(String[] args) {

        IntStream intStream = IntStream.rangeClosed(0, 50);
        intStream.filter(num -> num % 2 == 0).forEach(num -> System.out.print(num + " "));
        System.out.println();
        IntStream.range(0, 50).filter(num -> num % 2 == 0).forEach(num -> System.out.print(num + " "));
        System.out.println();

        Stream<String> stringStream = Stream.of("jogando ", "palavras", " aleatórias aqui", " vlw flw");
        stringStream
                .map(s -> s.toUpperCase())
                .forEach(s -> System.out.print(s));
        System.out.println();

        int[] num = {1,2,3,4,5};
        IntStream stream = Arrays.stream(num);
        stream.average().ifPresent(value -> System.out.println("Média: " + value));
    }
}
