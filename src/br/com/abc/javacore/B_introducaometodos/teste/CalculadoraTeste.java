package br.com.abc.javacore.B_introducaometodos.teste;

import br.com.abc.javacore.B_introducaometodos.classes.Calculadora;

public class CalculadoraTeste {
    public static void main(String... args) {

        /*Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();
        calc.subtraiDoisNumeros(10, 27);
        calc.multiplicaDoisNumeros(9, 72f);
        System.out.println("Divisao de dois numeros.");
        double retorno = calc.divideDoisNumeros(56.4d, 0);
        System.out.println(retorno);
        System.out.println("Imprimindo dois numeros divididos.");
        calc.imprimeDoisNumerosDivididos(12d,5d);
        System.out.println("Continuando a exec.");*/

        // Após a aula de métodos estáticos
        Calculadora.somaDoisNumeros();
        Calculadora.subtraiDoisNumeros(10, 27);
        Calculadora.multiplicaDoisNumeros(9, 72f);
        System.out.println("Divisao de dois numeros.");
        double retorno = Calculadora.divideDoisNumeros(56.4d, 0);
        System.out.println(retorno);
        System.out.println("Imprimindo dois numeros divididos.");
        Calculadora.imprimeDoisNumerosDivididos(12d,5d);
        System.out.println("Continuando a exec.");

        int[] numeros = new int[]{1,2,3,4,5};
        Calculadora.somaArray(numeros);
        Calculadora.somaVarArgs(1,2,3,4,5);
        Calculadora.somaVarArgs2(5.62, 15, 1,2,3,4,5);
    }
}