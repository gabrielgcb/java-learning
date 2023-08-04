package br.com.abc.javacore.ZZAclassesinternas;

class Animal {
    public void walk() {
        System.out.println("Animal walking...");
    }
}
public class ClassesAnonimasTeste01 {
    public static void main(String[] args) {
        Animal animal = new Animal() {
            @Override
            public void walk() {
                System.out.println("Dog walking...");
            }
        };
        animal.walk();

    }
}
