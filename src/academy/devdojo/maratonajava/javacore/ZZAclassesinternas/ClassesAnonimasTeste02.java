package academy.devdojo.maratonajava.javacore.ZZAclassesinternas;

public class ClassesAnonimasTeste02 {
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
