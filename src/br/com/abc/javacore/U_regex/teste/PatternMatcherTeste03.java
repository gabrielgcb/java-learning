package br.com.abc.javacore.U_regex.teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTeste03 {
    public static void main(String[] args) {
        // \d todos os digitos
        // \D tudo o que nao for digito
        // \s todos os espacos em brancos
        // \S todos os caracteres excluindo os brancos
        // \w = a-ZA-Z, digitos, _, basicamente exclui os caracteres especiais
        // \W tudo o que não for incluso no \w
        // [] range, procura tudo oq estiver dentro dos colchete, ex. [abcABC]
        
        String regex = "[a-zA-B]";
        String texto = "#cafeBABE";
        Pattern pattern = Pattern.compile(regex); //vai compilar a expressao regular e procurar todos os ab no texto
        Matcher matcher = pattern.matcher(texto);//o padrao vai casar com o texto, e vai retonar o matcher
        System.out.println("texto:  " + texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posicoes encontradas: ");
        while(matcher.find()) {
            System.out.print("indice: " + matcher.start() + ", " + matcher.group() + "\n");
        }

    }
}
