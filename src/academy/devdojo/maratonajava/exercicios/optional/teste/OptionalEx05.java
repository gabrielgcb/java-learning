package academy.devdojo.maratonajava.exercicios.optional.teste;

import java.util.List;
import java.util.Optional;

// Exercício de Optional e Coleções:
// Crie uma função que receba uma lista de números decimais e retorne a soma dos valores usando Optional.
// Caso a lista esteja vazia, retorne um Optional.empty().

public class OptionalEx05 {
    public static void main(String[] args) {

        List<Double> numDecimais = List.of(4.5, 6.5, 4.7, 8.9, 9.9);

//        Double soma = numDecimais.stream().reduce(0.0, (elemento, acumulado) -> elemento + acumulado);
//        System.out.println(soma);

        Optional<Double> resultadoSoma = somarValores(numDecimais);

        if(resultadoSoma.isPresent()) {
            System.out.println("Valor da soma: " + resultadoSoma.get());
        } else {
            System.out.println("Lista vazia.");
        }
    }

    private static Optional<Double> somarValores(List<Double> list) {
        if(list == null || list.isEmpty()) {
            return Optional.empty();
        }
        double soma = 0;
        for(Double e : list) {
            soma += e;
        }
        return Optional.of(soma);
    }
}
