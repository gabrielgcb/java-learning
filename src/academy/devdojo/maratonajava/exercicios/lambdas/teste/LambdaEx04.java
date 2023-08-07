package academy.devdojo.maratonajava.exercicios.lambdas.teste;

import java.util.ArrayList;
import java.util.List;

/*Exercício de Lambdas e Coleções:
Escreva um programa que receba uma lista de strings e use uma expressão lambda
para remover todas as strings vazias (de tamanho zero) da lista.
*/

public class LambdaEx04 {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>(List.of("", "Gabriel", "Lucas", "", "", "Lázaro", "", "Glaucinéia"));

        System.out.println(nomes);

        nomes.removeIf(string -> string.isEmpty());

        System.out.println(nomes);
    }
}
