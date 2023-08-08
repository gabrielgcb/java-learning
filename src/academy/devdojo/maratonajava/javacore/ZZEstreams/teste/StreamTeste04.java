package academy.devdojo.maratonajava.javacore.ZZEstreams.teste;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamTeste04 {
    public static void main(String[] args) {

        List<List<String>> ifVoleibol = new ArrayList<>();
        List<String> levantadores = List.of("Gabriel", "Burgel", "Jéssica");
        List<String> ponteiros = List.of("Clóvis", "Rogério", "Gabi", "Dani");
        List<String> opostos = List.of("Kleyver", "Patrícia");
        List<String> centrais = List.of("Eduardo", "Mateus");
        List<String> liberos = List.of("Emanuel", "Júlia");

        ifVoleibol = List.of(levantadores, ponteiros, opostos, centrais, liberos);

        for(List<String> pessoas : ifVoleibol) {
            for(String pessoa : pessoas) {
                System.out.println(pessoa);
            }
        }
        System.out.println("---------------");

        ifVoleibol.stream().flatMap(list -> list.stream()).forEach(System.out::println);

    }
}
