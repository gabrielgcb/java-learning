package academy.devdojo.maratonajava.javacore.ZZEstreams.teste;

import java.util.function.UnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTeste16 {
    public static void main(String[] args) {

        System.out.println(Runtime.getRuntime().availableProcessors());

        long num = 10_000_000;

        sumFor(num);
        System.out.println("-----------");
        streamIterate(num);
        System.out.println("-----------");
        streamParellelIterate(num);
        System.out.println("-----------");
        sumLongStreamIterate(num);
        System.out.println("-----------");
        sumLongStreamParallelIterate(num);
    }

    private static void sumFor(long num) {
        System.out.println("Sum for");

        long result = 0;
        long init = System.currentTimeMillis();
        for (int i = 0; i <= num; i++) {
            result += i;
        }
        long end = System.currentTimeMillis();

        System.out.println("result = " + result + "\ntime spent = " + (end - init) + "ms");
    }

    private static void streamIterate(long num) {
        System.out.println("Stream iterate");

        long init = System.currentTimeMillis();
        Long result = Stream.iterate(1L, n -> n + 1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();

        System.out.println("result = " + result + "\ntime spent = " + (end - init) + "ms");
    }

    private static void streamParellelIterate(long num) {
        System.out.println("Stream parallel iterate");

        long init = System.currentTimeMillis();
        Long result = Stream.iterate(1L, n -> n + 1).limit(num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();

        System.out.println("result = " + result + "\ntime spent = " + (end - init) + "ms");
    }

    private static void sumLongStreamIterate(long num) {
        System.out.println("Long Stream iterate");

        long init = System.currentTimeMillis();
        Long result = LongStream.rangeClosed(0, num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();

        System.out.println("result = " + result + "\ntime spent = " + (end - init) + "ms");
    }

    private static void sumLongStreamParallelIterate(long num) {
        System.out.println("Long Stream Parallel iterate");

        long init = System.currentTimeMillis();
        Long result = LongStream.rangeClosed(0, num).parallel().parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();

        System.out.println("result = " + result + "\ntime spent = " + (end - init) + "ms");
    }
}
