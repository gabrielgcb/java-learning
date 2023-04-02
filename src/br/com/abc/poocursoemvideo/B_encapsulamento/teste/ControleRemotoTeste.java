package br.com.abc.poocursoemvideo.B_encapsulamento.teste;

import br.com.abc.poocursoemvideo.B_encapsulamento.classes.ControleRemoto;

public class ControleRemotoTeste {
    public static void main(String[] args) {
        ControleRemoto controleRemoto = new ControleRemoto();
        controleRemoto.ligar();
        controleRemoto.abrirMenu();
        controleRemoto.maisVolume(200);

        System.out.println(controleRemoto);
    }
}
