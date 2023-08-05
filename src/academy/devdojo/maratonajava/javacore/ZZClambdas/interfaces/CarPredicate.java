package academy.devdojo.maratonajava.javacore.ZZClambdas.interfaces;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;

@FunctionalInterface // É uma interface que possui apenas um método abstrato. Se tiverem outros, serão default
public interface CarPredicate {

    // são: anônimas, funções, concisas
    boolean test(Car car);
    // (parâmetro -> <expressão>
    // (Car car) -> car.getColor().equals("green"!");
}
