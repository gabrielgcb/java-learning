package br.com.abc.javacore.O_exception.teste.runtime;

public class RuntimeExceptionTeste01 {
    public static void main(String[] args) {
        // Checked e Unchecked
        Object object = null;
        System.out.println(object.toString());

        int[] array = new int[]{1,2};
        System.out.println(array[2]);
    }
}
