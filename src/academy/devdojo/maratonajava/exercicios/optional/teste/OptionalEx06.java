package academy.devdojo.maratonajava.exercicios.optional.teste;

import java.util.List;
import java.util.Optional;

public class OptionalEx06 {
    public static void main(String[] args) {

        List<String> animais = List.of("gatos", "pato", "rato");

//        Optional<String> firstElement = animais.stream().filter(s -> s.length() >= 5).findFirst();
//        if(firstElement.isPresent()) {
//            System.out.println(firstElement.get());
//        } else {
//            System.out.println("Lista vazia");
//        }

        Optional<String> cincoCararacteres = primeiroCincoCararacteres(animais);

        if(cincoCararacteres.isPresent()) {
            System.out.println("Primeira string da lista com cinco caracteres: " + cincoCararacteres.get());
        } else {
            System.out.println("Lista vazia");
        }
    }

    private static Optional<String> primeiroCincoCararacteres(List<String> list) {
        if(list == null || list.isEmpty()) {
            return Optional.empty();
        }
        for(String e : list) {
            if(e.length() >= 5) {
                return Optional.of(e);
            }
        }
        return Optional.empty();
    }
}
