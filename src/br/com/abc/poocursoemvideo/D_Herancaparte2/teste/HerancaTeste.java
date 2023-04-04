package br.com.abc.poocursoemvideo.D_Herancaparte2.teste;

import br.com.abc.poocursoemvideo.D_Herancaparte2.classes.*;

public class HerancaTeste {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Gabriel B.", 21, 'M', "20215015", "Eng. de Software");
        System.out.println(a1);

        Bolsista b1 = new Bolsista("Joao", 23, 'M', "1236-5", "JAVA", 1200f);
        System.out.println(b1);
        b1.pagarMensalidade();
        b1.renovarBolsa();

        Professor p1 = new Professor("Anderson", 42, 'M', "Fisica 3", 12000f);
        System.out.println(p1);
        p1.receberAumento(1300f);

        Tecnico t1 = new Tecnico("Nubia", 26, 'F', "4564", "Eletronica", "545-84");
        System.out.println(t1);
        t1.pagarMensalidade();
        t1.praticar();

        Visitante v1 = new Visitante("Rafaela", 15, 'F');
        System.out.println(v1);

    }
}
