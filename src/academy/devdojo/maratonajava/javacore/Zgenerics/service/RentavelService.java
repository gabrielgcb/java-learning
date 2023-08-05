package academy.devdojo.maratonajava.javacore.Zgenerics.service;

import java.util.List;

public class RentavelService<T> {

    private List<T> objetosDisponiveis;

    public RentavelService(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public T buscarObjetoDisponivel() {
        System.out.println("Buscando objeto(s) disponível(s)...");
        T t = objetosDisponiveis.remove(0);
        System.out.println("Alugando objeto " + t);
        System.out.println("Objeto(s) disponível(s)");
        System.out.println(objetosDisponiveis);
        return t;
    }

    public void retornarObjetoAlugado(T t) {
        System.out.println("Devolvendo objeto " + t);
        objetosDisponiveis.add(t);
        System.out.println("Objeto(s) disponível(s)");
        System.out.println(objetosDisponiveis);
    }
}
