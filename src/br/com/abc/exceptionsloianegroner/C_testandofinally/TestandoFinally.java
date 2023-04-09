package br.com.abc.exceptionsloianegroner.C_testandofinally;

public class TestandoFinally {
    public static void main(String[] args) {

        int[] numeros = new int[]{4, 8, 16, 32, 64, 128};
        int[] denominadores = new int[]{2, 0, 4, 8, 0};

        for(int i = 0; i < numeros.length; i++) {
            try {
                System.out.println(numeros[i] + "/" + denominadores[i] +  " = " + numeros[i]/denominadores[i]);
            } catch(ArithmeticException e1) {
                System.out.println("Erro ao dividir por zero.");
            } catch(ArrayIndexOutOfBoundsException e2) {
                System.out.println("Erro ao dividir por denominador que nao existe no indice.");
            }
            finally { // Sempre* será executado, a nao ser que a execução do programa termine dento do try ou catch
                        // por exemplo, system.exit(0);
                System.out.println("Essa linha impressa sempre apos o try ou catch.");
            }
        }

    }
}
