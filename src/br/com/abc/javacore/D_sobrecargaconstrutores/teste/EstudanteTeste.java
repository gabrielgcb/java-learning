package br.com.abc.javacore.D_sobrecargaconstrutores.teste;

import br.com.abc.javacore.D_sobrecargaconstrutores.classes.Estudante;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante e1 = new Estudante("202105031", "Gabriel", new float[]{8, 8.2f, 9.8f});
        e1.imprimeDadosEstudante();
    }
}
