package academy.devdojo.maratonajava.javacore.ZZClambdas.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

// Referência a métodos não-estáticos, usando a classe diretamente
public class MethodReferenceTeste03 {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>(List.of("Gabriel", "Lucas", "Lázaro", "Glaucinéia"));
        nomes.sort(String::compareTo);
        System.out.println(nomes);

        BiPredicate<List<String>, String> checkName = List::contains;
        System.out.println(checkName.test(nomes, "Lázaro"));

    }



}
