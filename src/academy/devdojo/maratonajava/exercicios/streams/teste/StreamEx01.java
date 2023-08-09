package academy.devdojo.maratonajava.exercicios.streams.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx01 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1,2,3,4,5,6,7,8,9);
        System.out.println(numeros.stream().filter(num -> num % 2 == 0).collect(Collectors.toList()));

        List<String> nomes = List.of("gabriel", "guimarães", "cordeiro", "bispo");
        System.out.println(nomes.stream().map(String::toUpperCase).collect(Collectors.toList()));

        List<Integer> numeros2 = List.of(11,22,33,44,55,66,77,88,99);
        System.out.println(numeros2.stream().reduce(0, Integer::sum));

        List<String> nomes2 =  List.of("bola", "gato", "uva", "laranja", "volei", "paralelo");
        System.out.println(nomes2.stream().filter(n -> n.length() > 5).collect(Collectors.toList()));

        List<Integer> numeros3 = List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
        System.out.println(numeros3.stream()
                .filter(StreamEx01::ehPrimo).collect(Collectors.toList()));

        List<Integer> numeros4 = List.of(5,6,6,456,35,45,24,234,2342,4,675,6867,8);
        System.out.println(numeros4.stream().sorted().collect(Collectors.toList()));

        List<String> nomes4 = List.of("gabriel", "developer", "backend", "java");
        List<String> nomes5 = List.of("junior", "fullstack", "frontend", "angular");
        System.out.println(Stream.concat(nomes4.stream(), nomes5.stream()).collect(Collectors.toList()));
    }

    private static boolean ehPrimo(int num) {
        if(num < 0) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
