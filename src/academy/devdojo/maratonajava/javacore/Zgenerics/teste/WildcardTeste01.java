package academy.devdojo.maratonajava.javacore.Zgenerics.teste;

import java.util.List;

abstract class Animal {
    public abstract void consultar();
}

class Cachorro extends Animal {
    @Override
    public void consultar() {
        System.out.println("Consultando o cachorro...");
    }
}

class Gato extends Animal {
    @Override
    public void consultar() {
        System.out.println("Consultando o gato...");
    }
}

public class WildcardTeste01 {
    public static void main(String[] args) {
//        Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
//        Gato[] gatos = {new Gato(), new Gato()};
//        Animal[] animais = new Animal[]{new Cachorro(), new Gato()};
//        printConsultaArray(cachorros);
//        printConsultaArray(gatos);
//        printConsultaArray(animais);

        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());
        printConsultaList(cachorros);
        printConsultaList(gatos);

    }

    private static void printConsultaArray(Animal[] animais) {
        for (Animal animal : animais) {
            animal.consultar();
        }
    }

    private static void printConsultaList(List<? extends Animal> animalList) {
        for(Animal animal : animalList) {
            animal.consultar();
        }
    }

}
