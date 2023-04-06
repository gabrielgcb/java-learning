package br.com.abc.poocursoemvideo.E_polimorfismoparte2.teste;

import br.com.abc.poocursoemvideo.E_polimorfismoparte2.classes.Cachorro;

public class PolimorfismoTeste {
    public static void main(String[] args) {

        Cachorro c = new Cachorro(15.4f, 6, 4, "Castanho escuro");
        c.reagir(false);
        c.reagir(15);
        c.reagir(2, 5);
    }
}
