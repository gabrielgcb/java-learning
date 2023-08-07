package academy.devdojo.maratonajava.exercicios.generics.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class GenericEx03 {
    public static void main(String[] args) {

        List<Integer> numeros = List.of(1,2,3,4,5,6,7,8);
        List<Integer> numerosPares = filter(numeros, num -> num % 2 == 0);
        System.out.println("elementos pares: " + numerosPares);

        Optional<Integer> primeiroNumero = retornarPrimeiroElemento(numeros);
        System.out.println("primeiro elemento: " + primeiroNumero);
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();
        for(T e : list) {
            if (predicate.test(e)) {
                filteredList.add(e);
            }
        }
        return filteredList;
    }

    private static <T> Optional<T> retornarPrimeiroElemento(List<T> list) {
        return list.stream().findFirst();
    }
}
