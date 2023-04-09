package br.com.abc.exceptionsloianegroner.A_excecao;

public class Excecao {
    public static void main(String[] args) {

        try{
            int[] vetor = new int[4];
            System.out.println("Antes da exception");
            vetor[4] = 3;
            System.out.println("Esse texto nao sera impresso");
        } catch(ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Excecao ao acessar um indice do vetor que nao existe");
        }

        System.out.println("Esse texto sera impresso apos a exception");

    }
}
