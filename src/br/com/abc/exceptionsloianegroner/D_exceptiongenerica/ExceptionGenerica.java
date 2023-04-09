package br.com.abc.exceptionsloianegroner.D_exceptiongenerica;

public class ExceptionGenerica {
    public static void main(String[] args) {

        int[] numeros = new int[]{4, 8, 16, 32, 64, 128};
        int[] denominadores = new int[]{2, 0, 4, 8, 0};

        for(int i = 0; i < numeros.length; i++) {
            try {
                System.out.println(numeros[i] + "/" + denominadores[i] +  " = " + numeros[i]/denominadores[i]);
            } catch(Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }

    }
}
