package br.com.abc.poocursoemvideo.E_polimorfismo.classes;

public class PolimorfismoTeste {
    public static void main(String[] args) {

        Cachorro c = new Cachorro(15.600f, 12, 4, "Preto");
        System.out.println(c);
        c.abanarRabo();
        c.locomover();
        c.emitirSom();

        Goldfish g = new Goldfish(2f, 3, 3, "Dourado");
        System.out.println(g);
        g.emitirSom();

        Arara a = new Arara(1.400f, 5, 4, "Amarelo com verde");
        System.out.println(a);
        a.fazerNinho();

        Cobra co = new Cobra(3, 4, 0, "Vermelha");
        System.out.println(co);
        co.locomover();

        Canguru can = new Canguru(50f, 6, 5, "Marrom");
        System.out.println(can);
        can.usarBolsa();

    }
}
