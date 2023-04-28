package br.com.abc.javacore.U_regex.teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTeste01 {
    public static void main(String[] args) {
        String regex = "aba"; //vai procurar todos os ab que eu tenho no texto
        //String texto = "abaaba";
        String texto2 = "abababa";
        Pattern pattern = Pattern.compile(regex); //vai compilar a expressao regular e procurar todos os ab no texto
        Matcher matcher = pattern.matcher(texto2);//o padrao vai casar com o texto, e vai retonar o matcher
        System.out.println("texto:  " + texto2);
        System.out.println("indice: 0123456");
        System.out.println("regex: " + regex);
        System.out.print("Posicoes encontradas: ");
        while(matcher.find()) {
            System.out.print(matcher.start() + " ");
        }

    }
}
