package br.com.abc.poocursoemvideo.C_relacionamentoentreclasses.teste;

import br.com.abc.poocursoemvideo.C_relacionamentoentreclasses.classes.Luta;
import br.com.abc.poocursoemvideo.C_relacionamentoentreclasses.classes.Lutador;

public class LutadorTeste {
    public static void main(String... args) {
        Lutador[] lutadores = new Lutador[5];
        lutadores[0] = new Lutador("Charles do Bronx", "Brasil", 19, 1.80f, 75f, 22, 0 , 1);
        lutadores[1] = new Lutador("Gabriel 'Abels' Bispo", "Brasil", 21, 1.75f, 72f, 20, 2 , 0);
        lutadores[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2 , 1);
        lutadores[3] = new Lutador("Dead Code", "Australia", 28, 1.93f, 81.6f, 13, 0 , 2);
        lutadores[4] = new Lutador("Pretty Boy", "Franca", 31, 1.75f, 68.9f, 11, 3 , 1);

        /*System.out.println(lutadores[0]);
        System.out.println(lutadores[1]);
        System.out.println(lutadores[2]);
        System.out.println(lutadores[3]);
        System.out.println(lutadores[4]);*/

        lutadores[0].setCategoria();
        lutadores[1].setCategoria();

        Luta luta1 = new Luta();
        luta1.setDesafiado(lutadores[0]);
        luta1.setDesafiante(lutadores[1]);
        luta1.setRounds(12);
        luta1.marcarLuta();

        lutadores[0].status();
        lutadores[1].status();

    }
}
