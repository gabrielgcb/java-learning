package academy.devdojo.maratonajava.exercicios.lambdas.teste;

import java.util.ArrayList;
import java.util.List;

public class LambdaEx02 {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>(List.of("Gabriel", "Alonso", "Yuan", "Lucas", "Xavi"));

//        nomes.sort((o1, o2) -> {
//            Integer tam1 = o1.length();
//            Integer tam2 = o2.length();
//            return tam1.compareTo(tam2);
//        });

        nomes.sort((o1, o2) -> o1.length() - o2.length());

        System.out.println(nomes);

    }
}
