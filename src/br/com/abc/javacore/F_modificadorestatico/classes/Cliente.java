package br.com.abc.javacore.F_modificadorestatico.classes;

public class Cliente {
    // Ordem de execucao de um programa java:
    // 0º Bloco de inicialização estático é executado quando a JVM carregar a classe (é executado apenas uma vez)
    // 1º Alocado espaço na memoria para o objeto que será criado
    // 2º Cada atributo de classe é criado e inicializado com seus valores default ou valores explicitos
    // 3º Bloco de inicialização é executado
    // 4º O construtor é executado
    private static int[] parcelas;

    //Bloco de inicialização
    static { //O bloco é executado apenas uma vez, pois dessa maneira é economizado processamento e memória
        parcelas = new int[100];
        System.out.println("Dentro do bloco de inicializazao.");
        for (int i = 1; i <= 100; i++) {
            parcelas[i - 1] = i;
        }
    }

    public Cliente() {
    }

    public static int[] getParcelas() {
        return Cliente.parcelas;
    }

}
