package br.com.abc.introducao.controlefluxo;

public class ControleFluxo2 {
    public static void main(String[] args) {
        // Operador ternario

        int idade = 20;
        boolean maiorDeIdade;
        String categoria;

        maiorDeIdade = idade >= 18 ? true : false;
        categoria = idade < 15 ? "Cat. infantil" : idade >= 15 && idade < 18 ? "Cat. juvenil" : "Cat. adulto";

        System.out.println(maiorDeIdade);
        System.out.println(categoria);

    }
}
