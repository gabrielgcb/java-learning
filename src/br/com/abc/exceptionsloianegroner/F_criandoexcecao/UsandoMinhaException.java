package br.com.abc.exceptionsloianegroner.F_criandoexcecao;

public class UsandoMinhaException {
    public static void main(String[] args) {

        int[] numeros = new int[]{4, 8, 5, 16, 21, 32, 64, 127};
        int[] denominadores = new int[]{2, 2, 4, 0, 4, 8, 0};

        for(int i = 0; i < numeros.length; i++) {
            try {
                if(numeros[i] % 2 != 0) {
                    throw new DivisaoNaoExata(numeros[i], denominadores[i]);
                }
                System.out.println(numeros[i] + "/" + denominadores[i] +  " = " + numeros[i]/denominadores[i]);
            } catch(ArithmeticException | ArrayIndexOutOfBoundsException | DivisaoNaoExata e) {
                System.out.println("Aconteceu um erro.");
                e.printStackTrace();
            }
        }

    }
}
