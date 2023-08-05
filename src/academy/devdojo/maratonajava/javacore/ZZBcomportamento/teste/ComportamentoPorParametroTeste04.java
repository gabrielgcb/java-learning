package academy.devdojo.maratonajava.javacore.ZZBcomportamento.teste;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTeste04 {

    static List<Car> cars = List.of(
            new Car("green", 2015),
            new Car("black", 2022),
            new Car("white", 2010),
            new Car("white", 2005),
            new Car("black", 1994)
    );

    public static void main(String[] args) {

        List<Car> whiteCars = filter(cars, car -> car.getColor().equals("white"));
        System.out.println("white cars: " + whiteCars);

        List<Car> greenCars = filter(cars, car -> car.getColor().equals("green"));
        System.out.println("green cars: " + greenCars);

        List<Car> carBefore2010 = filter(cars, car -> car.getYear() < 2010);
        System.out.println("cars before 2010: " + carBefore2010);

        List<Integer> numbers = List.of(0,1,2,3,4,5,6,7,8,9);
        List<Integer> evenNumbers = filter(numbers, number -> number % 2 == 0);
        System.out.println("even numbers: " + evenNumbers);

    }

    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();
        for (T e : list) {
            if (predicate.test(e)) {
                filteredList.add(e);
            }
        }
        return filteredList;
    }
}
