package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTeste01 {
    public static void main(String[] args) {

        Smartphone s1 = new Smartphone("1A23B", "iPhone");
        Smartphone s2 = new Smartphone("SAA23BC", "Samsung");
        Smartphone s3 = new Smartphone("PX124SA", "Pixel");

        List<Smartphone> smartphones = new ArrayList<>();
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(0, s3);
        //smartphones.clear();

        for(Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }

        Smartphone s4 = new Smartphone("PX124SA", "Pixel");
        System.out.println(smartphones.contains(s4));
        System.out.println(smartphones.indexOf(s4));

    }
}
