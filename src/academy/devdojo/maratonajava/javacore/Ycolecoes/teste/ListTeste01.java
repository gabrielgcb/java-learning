package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import java.util.ArrayList;
import java.util.List;

public class ListTeste01 {
    public static void main(String[] args) {

        // List nomes = new ArrayList(); v1.4

        List<String> nomes = new ArrayList<>(); // v1.5
        nomes.add("Gabriel");
        nomes.add("Bispo");
//        System.out.println(nomes.remove("Gabriel"));

        List<String> nomes2 = new ArrayList<>();
        nomes2.add("Guimarães");
        nomes.add("Cordeiro");
        nomes2.addAll(nomes);
        System.out.println("nomes2 " + nomes2);

        for (String nome : nomes) {
            System.out.println(nome);
        }

        nomes.add("Backend Developer");
        System.out.println("------------");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        System.out.println(numeros);

    }
}
