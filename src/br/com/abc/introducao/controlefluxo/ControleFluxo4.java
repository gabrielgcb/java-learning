package br.com.abc.introducao.controlefluxo;

public class ControleFluxo4 {
    public static void main(String[] args) {
        int contador = 11;

        while(contador < 10) {
            System.out.println(++contador);
        }

        do {
            System.out.println("Dentro do while.");
        } while(contador < 10);

        for(contador = 0; contador < 20; contador++) {
            System.out.println(contador);
        }

    }
}
