package br.com.abc.javacore.L_classesabstratas.teste;

import br.com.abc.javacore.L_classesabstratas.classes.Funcionario;
import br.com.abc.javacore.L_classesabstratas.classes.Gerente;
import br.com.abc.javacore.L_classesabstratas.classes.Vendedor;

public class FuncionarioTeste {
    public static void main(String... args) {
        Gerente g = new Gerente("Gessica", "20146-5", 2000);
        Vendedor v = new Vendedor("Joao", "20150-21", 1500, 700);
        g.calculaSalario();
        v.calculaSalario();
        System.out.println(g);
        System.out.println(v);
    }
}
