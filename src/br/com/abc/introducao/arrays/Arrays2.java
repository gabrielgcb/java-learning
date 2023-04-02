package br.com.abc.introducao.arrays;

public class Arrays2 {
    public static void main(String[] args) {
        //valores preenchidos na memória por padrão, caso a variavel nao seja inicializada
        //byte, short, int, long, float, double = 0
        //char = '\u0000' ' '
        //boolean = false
        //reference = null

        String[] nomes = new String[3];
        nomes[0] = "Gabriel";
        nomes[1] = "Lucas";
        nomes[2] = "Maria";

        for(int i = 0; i < nomes.length; i++) {
            System.out.println("Valor armazenado: "+nomes[i]);
        }

        nomes = new String[3];
        for(int i = 0; i < nomes.length; i++) {
            System.out.println("Valor armazenado: "+nomes[i]);
        }

    }
}
