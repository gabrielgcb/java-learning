package br.com.abc.javacore.P_wrapper;

//Wrappers são tipos objetos que irão encapsular os tipos primitivos transformando-os em objetos,
//possibilitando que seja feita a passagem dos valores numércos por referência e nao por valor.

public class WrapperTeste01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        char charP = 'W';
        int intP = 1;
        long longP = 10L;
        float floatP = 10f;
        double doubleP = 10d;
        boolean booleanP = false;

        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1; // boxing ou autoboxing
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = false;

        int i = intW; // unboxing
        Integer intW2 = Integer.parseInt("1");
        System.out.println(intW2);
        boolean verdadeiro = Boolean.parseBoolean("TruE");
        System.out.println(verdadeiro);

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('2'));
        System.out.println(Character.isLetterOrDigit('+'));
        System.out.println(Character.isUpperCase('g'));
        System.out.println(Character.isLowerCase('!'));
        System.out.println(Character.toLowerCase('G'));
        System.out.println(Character.toUpperCase('a'));

    }
}