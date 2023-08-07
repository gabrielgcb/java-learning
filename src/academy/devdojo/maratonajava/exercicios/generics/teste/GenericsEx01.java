package academy.devdojo.maratonajava.exercicios.generics.teste;

/*
Exercício de Generics:
Crie uma classe chamada GenericBox que possa armazenar um objeto de qualquer tipo.
Implemente os métodos set e get para adicionar e recuperar o valor do objeto armazenado.
*/

import academy.devdojo.maratonajava.exercicios.generics.dominio.GenericBox;

import java.util.List;

public class GenericsEx01 {

    public static void main(String[] args) {

        GenericBox<String> genericString = new GenericBox<>();
        genericString.setValue("Gabriel");
        System.out.println("String: " + genericString.getValue());

        GenericBox<Long> genericLong = new GenericBox<>();
        genericLong.setValue(123_456_789L);
        System.out.println("Long: " + genericLong.getValue());

        List<Integer> listaInteiros = List.of(1,2,3,4,5,6,7,8,9);
        GenericBox<List<Integer>> genericInteger = new GenericBox<>();
        genericInteger.setValue(listaInteiros);
        System.out.println("List integer: " + genericInteger.getValue());
    }
}
