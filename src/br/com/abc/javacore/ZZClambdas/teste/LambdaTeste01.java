package br.com.abc.javacore.ZZClambdas.teste;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTeste01 {

    private static List<String> notas = List.of("C", "D", "E", "F", "G", "A", "B");
    public static void main(String[] args) {

        forEach(notas, nota -> System.out.print(nota + " "));

    }
    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for(T e : list) {
            consumer.accept(e);
        }
    }

}
