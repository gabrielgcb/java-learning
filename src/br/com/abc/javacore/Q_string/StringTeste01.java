package br.com.abc.javacore.Q_string;

public class StringTeste01 {
    public static void main(String[] args) {
        String nome = "Gabriel"; //String constant pool ou Pool de strings
        String nome2 = "Gabriel";
        String nome3 = new String("Gabriel");
        //nome = nome.concat(" Bispo"); //String no java são imutáveis, pois nao se pode trocar o valor que já existe
        System.out.println(nome == nome2);
        System.out.println(nome == nome3);
        System.out.println(nome2 == nome3.intern());


    }
}
