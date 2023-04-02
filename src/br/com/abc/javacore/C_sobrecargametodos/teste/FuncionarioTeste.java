package br.com.abc.javacore.C_sobrecargametodos.teste;

import br.com.abc.javacore.C_sobrecargametodos.classes.Funcionario;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.init("Gabriel Bispo", "111.222.333-44", 5700f, "443322-1");
        f1.imprimeDadosFuncionario();
    }
}
