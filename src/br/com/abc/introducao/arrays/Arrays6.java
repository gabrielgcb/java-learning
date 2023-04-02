package br.com.abc.introducao.arrays;

public class Arrays6 {
    public static void main(String[] args) {

        int[][] dias = new int[3][];
        dias[0] = new int[]{1,2};
        dias[1] = new int[]{3,4,5};
        dias[2] = new int[]{6,7,8,9};

        for(int i = 0; i < dias.length; i++) {
            System.out.println("Referencia/endereco: " + dias[i]);
            System.out.println("Tamanho da array: " + dias[i].length);
            System.out.println("Valores armazenados na  array: ");
            for(int j = 0; j < dias[i].length; j++) {
                System.out.print("|"+dias[i][j]+"|");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------");
        for(int[] ref : dias) {
            for(int dia : ref) {
                System.out.print("|"+dia+"|");
            }
            System.out.println();
        }

    }
}
