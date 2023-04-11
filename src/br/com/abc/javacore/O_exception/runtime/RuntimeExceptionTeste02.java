package br.com.abc.javacore.O_exception.runtime;

public class RuntimeExceptionTeste02 {
    public static void main(String[] args) {
        try {
            divisao(1,0);
        } catch(RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println("Codigo finalizado.");
    }

    /**
     *
     * @param a
     * @param b não pode ser zero
     * @return
     * @throws IllegalArgumentException caso b seja zero
     */
    private static int divisao(int a, int b) throws IllegalArgumentException {
        if(b == 0) {
            throw new IllegalArgumentException("Argumento invalido, nao e possivel a divisao por zero.");
        }
        return a/b;
    }

}
