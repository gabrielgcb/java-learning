package br.com.abc.javacore.B_introducaometodos.teste;

import br.com.abc.javacore.B_introducaometodos.classes.Estudante;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante e1 = new Estudante();
        e1.setNome("Gabriel");
        e1.setIdade(21);
        float[] notas = new float[]{5.9f, 8.5f, 6.7f, 5, 6};
        e1.setNotas(notas);

        e1.imprimeDadosEstudante();
        e1.calculaMedia(notas);
        System.out.println("Aprovado? " + e1.isAprovado());

    }
}
