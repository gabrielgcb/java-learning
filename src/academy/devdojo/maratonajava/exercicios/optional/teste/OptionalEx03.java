package academy.devdojo.maratonajava.exercicios.optional.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/*
Exercício de Optional:
Crie uma função que recebe uma lista de números decimais e retorna a média dos valores usando Optional.
Caso a lista esteja vazia, retorne um Optional.empty().
*/

public class OptionalEx03 {
    public static void main(String[] args) {

        List<Double> numerosDecimais = null;
        Optional<Double> media = calcularMedia(numerosDecimais);

        if(media.isPresent()) {
            System.out.println("Média: " + media.get());
        } else {
            System.out.println("Lista vazia");
        }
    }

    private static Optional<Double> calcularMedia(List<Double> list) {
        if(list == null || list.isEmpty()){
            return Optional.empty();
        }
        double soma = 0;
        for(Double e : list) {
            soma += e;
        }
        return Optional.of(soma / list.size());
    }
}
