package academy.devdojo.maratonajava.javacore.ZZEstreams.teste;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class StreamTeste10 {
    public static void main(String[] args) {

        Stream.iterate(1, integer -> integer+2)
                .limit(50)
                .forEach(integer -> System.out.print(integer + " "));

        ThreadLocalRandom random = ThreadLocalRandom.current();
        Stream.generate(random::nextInt)
                .limit(50)
                .forEach(System.out::println);

    }
}
