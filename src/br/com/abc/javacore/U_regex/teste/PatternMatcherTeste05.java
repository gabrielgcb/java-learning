package br.com.abc.javacore.U_regex.teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTeste05 {
    public static void main(String[] args) {
        // \d todos os digitos
        // \D tudo o que nao for digito
        // \s todos os espacos em brancos
        // \S todos os caracteres excluindo os brancos
        // \w = a-ZA-Z, digitos, _, basicamente exclui os caracteres especiais
        // \W tudo o que não for incluso no \w
        // [] range, procura tudo oq estiver dentro dos colchete, ex. [abcABC]
        // ? Zero ou uma
        // * Zero ou mais
        // + uma ou mais
        // {n,m} de n até m
        // () agrupamento
        // | o(v|c) ovo | oco
        // $ fim da linha
        
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "12 0x 0X 0xFFABC 0x10G 0x1"; // validando se um numero em hexadecimal é válido
        Pattern pattern = Pattern.compile(regex); //vai compilar a expressao regular e procurar todos os regex no texto
        Matcher matcher = pattern.matcher(texto);//o padrao vai casar com o texto, e vai retonar o matcher
        System.out.println("texto:  " + texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posicoes encontradas: ");
        while(matcher.find()) {
            System.out.print("indice: " + matcher.start() + ", " + matcher.group() + "\n");
        }

        int numeroHex = 0xafd;
        System.out.println(numeroHex);

    }
}
