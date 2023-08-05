package academy.devdojo.maratonajava.javacore.ZZClambdas.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTeste02 {

    private static List<String> nomes = List.of("Gabriel", "Lucas", "Lázaro", "Glaucinéia");
    public static void main(String[] args) {

        System.out.println("Lista principal: " + nomes + "\n------");

        List<Object> tamanhosNomes = map(nomes, s -> s.length());
        System.out.println("Tamanho dos nomes: " + tamanhosNomes);
        List<Object> uppercaseNomes = map(nomes, s -> s.toUpperCase());
        System.out.println("Em uppercase: " + uppercaseNomes);
        List<Object> primeiraLetra = map(nomes, s -> s.charAt(0));
        System.out.println("Primeira letra: " + primeiraLetra);
        List<Object> hashCode = map(nomes, s -> s.hashCode());
        System.out.println("Hash code: " + hashCode);

    }
    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> size = new ArrayList<>();
        for(T e : list) {
            size.add(function.apply(e));
        }
        return size;
    }
}
