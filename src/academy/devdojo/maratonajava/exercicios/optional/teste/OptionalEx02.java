package academy.devdojo.maratonajava.exercicios.optional.teste;

import java.util.List;
import java.util.Optional;

public class OptionalEx02 {
    public static void main(String[] args) {

        List<Integer> numerosInteiros = List.of();
        System.out.println(retonarMenorValor(numerosInteiros));
    }

    private static Optional<Integer> retonarMenorValor(List<Integer> list) {
        return list.stream().min((o1, o2) -> o1.compareTo(o2));
    }
}
