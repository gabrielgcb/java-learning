package br.com.abc.introducao.controlefluxo;

public class ExercicioControleFluxo3 {
    public static void main(String[] args) {
        //Imprima todos os numeros pares de 0 até 100.000
        int valor = 100000;
        for(int numero = 0; numero <= valor; numero++) {
            if(numero % 2 == 0) {
                System.out.print(numero + " ");
            } else {
                System.out.print("Numero impar." + " ");
            }
        }

    }
}
