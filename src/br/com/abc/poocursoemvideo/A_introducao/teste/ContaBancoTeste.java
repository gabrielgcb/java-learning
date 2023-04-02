package br.com.abc.poocursoemvideo.A_introducao.teste;

import br.com.abc.poocursoemvideo.A_introducao.classes.ContaBanco;

public class ContaBancoTeste {
    public static void main(String... args) {

        ContaBanco c1 = new ContaBanco(0, false);
        c1.setNumConta(1111);
        c1.setTipo("CC");
        c1.setDono("Gabriel Guimaraes Cordeiro Bispo");

        c1.abrirConta();
        c1.depositar(5f);
        c1.depositar(100f);
        c1.sacar(200f);
        c1.fecharConta();
        c1.sacar(105f);
        c1.fecharConta();
        c1.sacar(93);
        c1.fecharConta();
    }
}
