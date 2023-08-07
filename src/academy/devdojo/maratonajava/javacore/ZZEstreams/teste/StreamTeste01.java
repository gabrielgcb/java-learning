package academy.devdojo.maratonajava.javacore.ZZEstreams.teste;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Quadrinhos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class StreamTeste01 {

    private static List<Quadrinhos> quadrinhosList = Arrays.asList(
            new Quadrinhos("O Espetacular Homem-Aranha", 9.99),
            new Quadrinhos("Quarteto Fantástico", 11.49),
            new Quadrinhos("Guerras Secretas", 6.89),
            new Quadrinhos("X-Men", 10.19),
            new Quadrinhos("Homem de Ferro", 11.89)
    );
    public static void main(String[] args) {

        quadrinhosList.sort((q1, q2) -> q1.getTitulo().compareTo(q2.getTitulo()));
        System.out.println("--- Ordenados por nome: ");
        for(Quadrinhos hq : quadrinhosList) {
            System.out.println("------- " + hq);
        }

        List<Quadrinhos> novaLista = new ArrayList<>();
        for(Quadrinhos hq : quadrinhosList) {
            if(hq.getPrice() < 10) {
                novaLista.add(hq);
            }
            if(novaLista.size() == 2) {
                break;
            }
        }

        System.out.println("\n--- Primeiras duas hqs com preço menor que 10: ");
        for(Quadrinhos hq : novaLista) {
            System.out.println("------- " + hq.getTitulo());
        }
    }


}
