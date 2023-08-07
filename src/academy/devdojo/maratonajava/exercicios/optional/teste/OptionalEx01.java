package academy.devdojo.maratonajava.exercicios.optional.teste;

import java.util.List;
import java.util.Optional;

public class OptionalEx01 {
    public static void main(String[] args) {
        List<String> nomes = List.of("Gabriel", "Lucas", "Lázaro", "Glaucinéia");
        List<String> nomes2 = List.of();

        System.out.println(retornaPrimeiroElemento(nomes).orElse("Lista vazia"));

        System.out.println(retornaPrimeiroNome(nomes2, "Lista vazia"));

        System.out.println(obterPrimeiroNome(nomes2).orElse("Lista vazia"));

    }

    // usando optional
    private static Optional<String> retornaPrimeiroElemento(List<String> list) {
        if(list.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(list.get(0));
    }

    // usando stream
    private static String retornaPrimeiroNome(List<String> list, String valorPadrao) {
        return list.stream().findFirst().orElse(valorPadrao);
    }

    // usando optional e stream
    private static Optional<String> obterPrimeiroNome(List<String> list) {
        return list.stream().findFirst();
    }
}
