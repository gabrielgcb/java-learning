package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

public class EqualsTeste02 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1A23B", "iPhone");
        Smartphone s2 = new Smartphone("1A23BC", "iPhone");
        // Serial Number é igual, logo eu quero que seja retornado um boolean a partir do serial number
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode() + " " + s2.hashCode());
    }
}
