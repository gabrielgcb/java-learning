package br.com.abc.poocursoemvideo.A_introducao.teste;

import br.com.abc.poocursoemvideo.A_introducao.classes.Caneta;

public class CanetaTeste {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("Azul", "BIC", true);
        c1.setPonta(0.5f);
        c1.setCarga(70);

        System.out.println(c1.getModelo());
        System.out.println(c1.getCor());
        System.out.println(c1.getPonta());
        System.out.println(c1.getCarga());
        System.out.println(c1.isTampada());

        c1.status();
        c1.rabiscar();
        c1.tampar();
        c1.rabiscar();
        c1.destampar();
        c1.rabiscar();
    }
}
