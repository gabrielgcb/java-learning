package br.com.abc.javacore.ZZClambdas.teste;

import br.com.abc.javacore.ZZClambdas.dominio.Seriado;
import br.com.abc.javacore.ZZClambdas.service.SeriadoComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Referência a métodos estáticos
public class MethodReferenceTeste01 {
    public static void main(String[] args) {

        List<Seriado> seriadoList = new ArrayList<>(List.of(
                new Seriado("iCarly", 200),
                new Seriado("Chaves", 300),
                new Seriado("Drake e Josh", 150),
                new Seriado("Zack e Cody", 200),
                new Seriado("Simpsons", 500)
        ));
        // Collections.sort(SeriadoComparators::compareByName);
        seriadoList.sort(SeriadoComparators::compareByName);
        System.out.println("--- Seriados ordenados em ordem alfabética: ");
        for(Seriado seriado : seriadoList) {
            System.out.println("--------- " + seriado);
        }

        System.out.println();

        // Collections.sort(SeriadoComparators::compareByEpisodes);
        seriadoList.sort(SeriadoComparators::compareByEpisodes);
        System.out.println("--- Seriados ordenados por número de episódios: ");
        for(Seriado seriado : seriadoList) {
            System.out.println("--------- " + seriado);
        }

    }
}
