package br.com.abc.javacore.O_exception.error;

public class StackOverflowTeste1 {
    public static void main(String[] args) {
        recursividade();
    }

    public static void recursividade() {
        recursividade();
    }
}
