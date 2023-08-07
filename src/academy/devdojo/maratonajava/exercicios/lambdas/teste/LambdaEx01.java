package academy.devdojo.maratonajava.exercicios.lambdas.teste;

/*Exercício de Lambdas:
Escreva um programa que recebe uma lista de números inteiros e
use uma expressão lambda para filtrar os números pares e, em seguida, imprima-os.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LambdaEx01 {
    public static void main(String[] args) {

        List<Integer> numerosInteiros = List.of(0,1,2,3,4,5,6,7,8,9);

        List<Integer> evenNumbers = filterEven(numerosInteiros, num -> num % 2 == 0);
        System.out.println("Even numbers: " + evenNumbers);

        List<Integer> numerosPares = filtrarPares(numerosInteiros);
        System.out.println("Números pares: " + numerosPares);
    }

    // usando a interface predicate
    private static List<Integer> filterEven(List<Integer> list, Predicate<Integer> predicate) {
        List<Integer> filteredList = new ArrayList<>();
        for(Integer e : list) {
            if(predicate.test(e)) {
                filteredList.add(e);
            }
        }
        return filteredList;
    }

    // usando lambda no método
    private static List<Integer> filtrarPares(List<Integer> list) {
        List<Integer> filteredList = new ArrayList<>();
        list.forEach(numero -> {
            if(numero % 2 == 0)
                filteredList.add(numero);
        });

        return filteredList;
    }
}
