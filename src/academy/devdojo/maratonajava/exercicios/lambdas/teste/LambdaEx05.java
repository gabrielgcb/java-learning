package academy.devdojo.maratonajava.exercicios.lambdas.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

/*
Exercício de Lambdas e Coleções:
Escreva um programa que receba uma lista de nomes e use uma expressão lambda
para filtrar os nomes que começam com a letra "A" e, em seguida, imprima-os.
*/
public class LambdaEx05 {
    public static void main(String[] args) {

        List<String> nomes = List.of("gabriel", "alex");

        Optional<List<String>> nomesA = filtrarNomesA(nomes, s -> s.toUpperCase().charAt(0) == 'A');

        if(nomesA.isPresent()) {
            System.out.println("Nomes que iniciam com a letra A: " + nomesA.get());
        } else {
            System.out.println("Lista vazia");
        }
    }

    private static Optional<List<String>> filtrarNomesA(List<String> list, Predicate<String> predicate) {
        if(list == null || list.isEmpty()) {
            return Optional.empty();
        }
        List<String> filteredList = new ArrayList<>();
        for(String e : list) {
            if(predicate.test(e)) {
                filteredList.add(e);
            }
        }
        return Optional.of(filteredList);
    }
}
