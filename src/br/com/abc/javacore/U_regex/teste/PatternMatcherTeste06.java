package br.com.abc.javacore.U_regex.teste;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTeste06 {
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
        // . 1.3 = 123, 133, 1@3, 1A3
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "fulano@gmail.com, ciclan.o123@outlook.com.br.co.gl, beltrano_belt12@email, gabriel.bispo@discente.ufg.br, @#$#@123@, 123, abc, 12aaaa@aaa.com";
        System.out.print("Email valido? ");
        System.out.println("gabriel.bispo@discente.ufg.br".matches(regex));
        System.out.println(Arrays.toString(texto.split(",")));
        System.out.println(texto.split(",")[1].trim()); //remover o espaço em branco
        Pattern pattern = Pattern.compile(regex); //vai compilar a expressao regular e procurar todos os regex no texto
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
