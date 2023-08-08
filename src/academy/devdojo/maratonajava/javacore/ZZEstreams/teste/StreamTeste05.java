package academy.devdojo.maratonajava.javacore.ZZEstreams.teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTeste05 {
    public static void main(String[] args) {
        List<String> palavras = List.of("gabriel", "bispo", "backend", "developer");

        List<Character> letras = new ArrayList<>();
        for (String palavra : palavras) {
            for (int i = 0; i <= palavra.length() - 1; i++) {
                letras.add(palavra.charAt(i));
            }
        }
        System.out.println(letras);

        System.out.println("--------------------");

        List<String> letra = palavras.stream().map(p -> p.split("")) // Stream<String[]>
                .flatMap(Arrays::stream) // Stream<String>
                .collect(Collectors.toList());

        System.out.println(letra);

    }
}
