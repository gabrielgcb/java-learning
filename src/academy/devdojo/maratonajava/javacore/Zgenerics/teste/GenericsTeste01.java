package academy.devdojo.maratonajava.javacore.Zgenerics.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTeste01 {
    public static void main(String[] args) {

//        List lista = new ArrayList();
//        lista.add("Homem-aranha");
//        lista.add(123L);
//        lista.add(new Consumidor("Gabriel"));
//
//        for(Object o : lista) {
//            if(o instanceof String) {
//                System.out.println("String");
//            }
//            if(o instanceof Long) {
//                System.out.println("Long");
//            }
//            if(o instanceof Consumidor) {
//                System.out.println("Consumidor");
//            }
//            System.out.println("Se tiver umas 200 classes... F total");
//        }

        List<String> lista = new ArrayList<>();
        lista.add("Gabriel");
        lista.add("Homem-aranha");
        lista.add("Vingadores");

        for(String s : lista) {
            System.out.println(s);
        }
        System.out.println("-------");

        add(lista, new Consumidor("Lucas"));

        for(String s : lista) {
            System.out.println(s);
        }

    }

    private static void add(List<String> lista, Consumidor consumidor) {
        // lista.add(consumidor);
        lista.add("um nome qualquer");
    }

}