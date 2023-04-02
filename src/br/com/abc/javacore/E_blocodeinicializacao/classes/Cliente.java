package br.com.abc.javacore.E_blocodeinicializacao.classes;

public class Cliente {
    // Ordem de execucao de um programa java:
    // 1º Alocado espaço na memoria para o objeto que será criado
    // 2º Cada atributo de classe é criado e inicializado com seus valores default ou valores explicitos
    // 3º Bloco de inicialização é executado
    // 4º O construtor é executado
    private int[] parcelas;
    //Bloco de inicialização
    {
        parcelas = new int[100];
        System.out.println("Dentro do bloco de inicializazao.");
        for(int i = 1; i <= 100; i++) {
            parcelas[i-1] = i;
        }
    }
    public Cliente() {
    }
    public int[] getParcelas() {
        return this.parcelas;
    }
    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }

}
