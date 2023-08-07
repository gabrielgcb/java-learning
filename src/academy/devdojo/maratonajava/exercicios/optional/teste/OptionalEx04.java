package academy.devdojo.maratonajava.exercicios.optional.teste;

import java.util.List;
import java.util.Optional;

/*Exercício de Optional e Coleções:
Crie uma função que receba uma lista de números inteiros e retorne o valor máximo usando Optional.
Caso a lista esteja vazia, retorne um Optional.empty().
*/

public class OptionalEx04 {
    public static void main(String[] args) {

        List<Integer> numeros = null;
        Optional<Integer> maiorValor = valorMaximo(numeros);

        if(maiorValor.isPresent()) {
            System.out.println("Maior valor: " + maiorValor);
        } else {
            System.out.println("Lista vazia");
        }
    }

    private static Optional<Integer> valorMaximo(List<Integer> list) {
        if(list == null || list.isEmpty()) {
            return Optional.empty();
        }
        return list.stream().max((o1, o2) -> o1.compareTo(o2));
    }
}
