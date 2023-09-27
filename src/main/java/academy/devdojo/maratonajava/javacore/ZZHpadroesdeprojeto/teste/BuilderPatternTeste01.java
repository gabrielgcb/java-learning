package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.teste;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.Person;

public class BuilderPatternTeste01 {
    public static void main(String[] args) {

        Person person = new Person.PersonBuilder()
                .firstName("Gabriel")
                .lastName("Bispo")
                .username("gabriel")
                .email("gabriel@email.com")
                .build();

        System.out.println(person);

    }
}
