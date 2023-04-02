package br.com.abc.introducao.controlefluxo;

public class ControleFluxo6 {
    public static void main(String[] args) {
        //Dado um valor de um carro, descubra em quantas vezes ele pode ser parcelado
        //Porem as parcelas nao podem ser menores que 1000

        double valorTotal = 30000;
        double valorParcela;
        int parcela;

        for(parcela = (int) valorTotal; parcela >= 1; parcela--) {
            valorParcela = valorTotal / parcela;
            if(valorParcela < 1000) {
                continue;
            }
            System.out.println(parcela + " vez(es) de R$" + valorParcela);
        }

    }
}
