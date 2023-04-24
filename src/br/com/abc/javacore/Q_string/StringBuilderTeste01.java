package br.com.abc.javacore.Q_string;

public class StringBuilderTeste01 {
    public static void main(String[] args) {
        String nome = "Gabriel Bispo";
        nome.concat(" Engenheiro de software");
        nome.substring(0, 7);
        System.out.println(nome);

        StringBuilder sb = new StringBuilder("Gabriel Bispo");
        sb.append(" Engenheiro de software").append("...");
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb);
    }
}
