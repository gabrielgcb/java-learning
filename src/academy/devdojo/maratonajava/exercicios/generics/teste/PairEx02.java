package academy.devdojo.maratonajava.exercicios.generics.teste;

import academy.devdojo.maratonajava.exercicios.generics.dominio.Pair;

/*
Exercício de Generics:
Crie uma classe chamada Pair que contém dois elementos de tipos diferentes.
Implemente os métodos getFirst e getSecond para recuperar os valores.
*/
public class PairEx02 {
    public static void main(String[] args) {
        Pair<String, Integer> pares = new Pair<>();
        pares.setValueOfT("Gabriel");
        pares.setValueOfU(22);
        System.out.println(pares.getFirst() + " " + pares.getSecond());
    }
}
