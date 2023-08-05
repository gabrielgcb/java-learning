package academy.devdojo.maratonajava.javacore.ZZClambdas.teste;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Seriado;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.SeriadoComparators;

import java.util.ArrayList;
import java.util.List;

// Referência a métodos não-estáticos
public class MethodReferenceTeste02 {
    public static void main(String[] args) {

        List<Seriado> seriadoList = new ArrayList<>(List.of(
                new Seriado("iCarly", 200),
                new Seriado("Chaves", 300),
                new Seriado("Drake e Josh", 150),
                new Seriado("Zack e Cody", 200),
                new Seriado("Simpsons", 500)
        ));

        SeriadoComparators seriadoComparators = new SeriadoComparators();

        //seriadoList.sort((o1, o2) -> seriadoComparators.compareByNameNonStatic(o1, o2));
        seriadoList.sort(seriadoComparators::compareByNameNonStatic);

        System.out.println("--- Seriados ordenados em ordem alfabética: ");
        for(Seriado seriado : seriadoList) {
            System.out.println("--------- " + seriado);
        }

    }
}
