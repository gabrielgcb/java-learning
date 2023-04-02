package br.com.abc.javacore.B_introducaometodos.classes;

public class Calculadora {

    public static void somaDoisNumeros() {
        System.out.println(5+5);
    }
    public static void subtraiDoisNumeros(int x, int y) {
        System.out.println(x-y);
    }
    public static void multiplicaDoisNumeros(int a, float b) {
        System.out.println(a*b);
    }
    public static double divideDoisNumeros(double num1, double num2) {
        if(num2 != 0){
            return num1/num2;
        }
        return 0;
    }
    public static void imprimeDoisNumerosDivididos(double num1, double num2) {
        if(num2 != 0) {
            System.out.println(num1/num2);
            return;
        }
        System.out.println("Erro, divisao por zero.");
    }
    public static void alteraDoisNumeros(int num1, int num2) {
        num1 = 30;
        num2 = 50;
        System.out.println("Dentro do altera dois numeros:");
        System.out.println("num1: " +num1);
        System.out.println("num2: " +num2);
    }

    public static void somaArray(int[] numeros) {
        int soma = 0;
        for(int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
    public static void somaVarArgs(int... numeros) {
        int soma = 0;
        for(int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
    public static void somaVarArgs2(double valorDouble, int valorInt, int... numeros) { // o VarArgs deve sempre ser o ultimo parametro
        double soma = 0;
        for(int num : numeros) {
            soma += num + valorDouble + valorInt;
        }
        System.out.println(soma);
    }

}
