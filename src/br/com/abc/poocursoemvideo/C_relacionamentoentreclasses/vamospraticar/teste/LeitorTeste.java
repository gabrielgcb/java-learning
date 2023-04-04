package br.com.abc.poocursoemvideo.C_relacionamentoentreclasses.vamospraticar.teste;

import br.com.abc.poocursoemvideo.C_relacionamentoentreclasses.vamospraticar.classes.Livro;
import br.com.abc.poocursoemvideo.C_relacionamentoentreclasses.vamospraticar.classes.Pessoa;

public class LeitorTeste {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("JOANNA D'ARC SMITH", 35, 'F');
        Livro l = new Livro("Guerra e Paz", "Victor Hugo", 456);
        l.setLeitor(p);
        System.out.println(p);
        System.out.println(l);
        l.abrir();
        for(int i = 0; i < 234; i++){
            l.avancarPag();
        }
        l.getPagAtual();
        System.out.println(l);
        l.folhear(384);
        System.out.println(l);

    }
}