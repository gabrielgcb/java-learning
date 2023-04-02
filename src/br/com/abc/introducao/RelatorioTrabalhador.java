package br.com.abc.introducao;

public class RelatorioTrabalhador {
    public static void main (String[] args) {
        String nome = "Gabriel";
        char sexo = 'M';
        byte idade = 21;
        String estadoCivil = "solteiro";
        float salario = 1780.55f;

        System.out.println("O(a) trabalhador(a) " +nome+
                           ", do sexo " +sexo+
                           ", idade " +idade+
                           ", estado civil " +estadoCivil+
                           " e salario " +salario+
                           " encontra-se empregado neste estabelecimento.");

    }
}
