package academy.devdojo.maratonajava.exercicios.lambdas.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class LambdaEx03 {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>(List.of("gabriel", "lucas", "josé", "rita", "maria"));

        System.out.println(nomes);
        nomes.replaceAll(nome -> nome.toUpperCase());
        System.out.println(nomes);

    }
}
