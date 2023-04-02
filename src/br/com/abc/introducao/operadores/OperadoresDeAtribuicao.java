package br.com.abc.introducao.operadores;

public class OperadoresDeAtribuicao {
    // =, -=, +=, *=, /=, %=
    public static void main(String[] args) {
        int salario = 1000;
        salario = salario + 1000;
        salario *= 1.1;
        System.out.println(salario);

        int numero = 11;
        numero %= 2;
        System.out.println(numero);
    }
}
