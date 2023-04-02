package br.com.abc.introducao.arrays;

public class Arrays5 {
    public static void main(String[] args) {

        int[][] dias = new int[2][5];

        dias[0][0] = 1;
        dias[0][1] = 2;
        dias[1][0] = 3;
        dias[1][1] = 4;;

        for(int i = 0; i < dias.length; i++) {
            System.out.println(dias[i]);//Endereço de memória em que está localizado a referencia para o nº array
            System.out.println(dias[i].length);//Tamanho do nº array
            for(int j = 0; j < dias[i].length; j++) {
                System.out.print(dias[i][j] + " ");//Valores contidos no nº array
            }
            System.out.println();
        }
        System.out.println("---------------------------------");
        for(int[] ref : dias) {
            for(int dia : ref) {
                System.out.print(dia + " ");
            }
            System.out.println();
        }

    }
}
