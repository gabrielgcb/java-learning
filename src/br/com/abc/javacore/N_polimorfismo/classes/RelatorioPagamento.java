package br.com.abc.javacore.N_polimorfismo.classes;

public class RelatorioPagamento {

    /*public void relatorioPagamentoGerente(Gerente gerente) {
        System.out.println("---------- @GERANDO RELATORIO DE PAGAMENTO PARA A GERENCIA...");
        gerente.calcularPagamento();
        System.out.println("---------- @NOME: " + gerente.getNome());
        System.out.println("---------- @SALARIO: " + gerente.getSalario());
        System.out.println("********** ********** ********** **********");
    }

    public void relatorioPagamentoVendedor(Vendedor vendedor) {
        System.out.println("---------- @GERANDO RELATORIO DE PAGAMENTO PARA OS VENDEDORES...");
        vendedor.calcularPagamento();
        System.out.println("---------- @NOME: " + vendedor.getNome());
        System.out.println("---------- @SALARIO: " + vendedor.getSalario());
        System.out.println("********** ********** ********** **********");
    }*/

    public void relatorioPagamentoGenerico(Funcionario funcionario) {
        System.out.println("---------- @GERANDO RELATORIO DE PAGAMENTO...");
        funcionario.calcularPagamento();
        System.out.println("---------- @NOME: " + funcionario.getNome());
        System.out.println("---------- @SALARIO: " + funcionario.getSalario());
        if(funcionario instanceof Gerente) { //Se o funcionario estiver referenciado um objeto do tipo Gerente
            Gerente g = (Gerente) funcionario;
            //((Gerente) funcionario).getParticipacaoNosLucros());
            System.out.println("---------- @PARTICIPACAO NOS LUCROS: " + g.getParticipacaoNosLucros());
        }
        if(funcionario instanceof Vendedor){ //Se o funcionario estiver referenciado um objeto do tipo Vendedor
            Vendedor v = (Vendedor) funcionario;
            //((Vendedor) funcionario).getTotalVendas(); Uma outra forma de fazer um casting direto sem a V.R
            System.out.println("---------- @TOTAL DE VENDAS: " + v.getTotalVendas());
        }
        System.out.println("#############################################");
    }

}
