package academy.devdojo.maratonajava.javacore.Zgenerics.teste;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;

import java.util.List;

public class MetodoGenericoTeste01 {
    public static void main(String[] args) {
        criarArrayComUmObjeto(new Barco("Lancha"));
        criarArrayComUmObjeto(new Barco("Iate"));
        criarArrayComUmObjeto(new Barco("Submarino"));
    }

    private static <T> void criarArrayComUmObjeto(T t) {
        List<T> list = List.of(t);
        System.out.println(list);
    }

//    private static <T> List<T> criarArrayComUmObjeto2(T t) {
//        return List.of(t);
//    }
}
