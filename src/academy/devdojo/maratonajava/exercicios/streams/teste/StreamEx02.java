package academy.devdojo.maratonajava.exercicios.streams.teste;

import academy.devdojo.maratonajava.exercicios.streams.dominio.Pessoa;

import java.util.List;
import java.util.stream.Collectors;

public class StreamEx02 {

    private static List<Pessoa> listPessoas = List.of(
            new Pessoa("gabriel", 22),
            new Pessoa("lucas", 19),
            new Pessoa("jose", 2),
            new Pessoa("joao", 43),
            new Pessoa("maria", 54),
            new Pessoa("debora", 32)
    );
    public static void main(String[] args) {

        listPessoas.stream().mapToInt(Pessoa::getIdade).average().ifPresent(System.out::println);
    }
}
