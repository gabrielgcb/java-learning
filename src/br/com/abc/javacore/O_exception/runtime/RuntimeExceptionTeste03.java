package br.com.abc.javacore.O_exception.runtime;

public class RuntimeExceptionTeste03 {
    public static void main(String[] args) {

        abreConexao();

    }

    public static String abreConexao() {
        try {
            System.out.println("Abrindo arquivo.");
            System.out.println("Escrevendo dados no arquivo.");
            return "conexao aberta.";
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recurso liberado pelo SO.");
        }
        return null;
    }

}
