package br.com.abc.javacore.ZZBcomportamento.teste;

import br.com.abc.javacore.ZZBcomportamento.dominio.Car;
import br.com.abc.javacore.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTeste03 {

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

    }

    public static List<Car> filter(List<Car> carList, CarPredicate carPredicate) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : carList) {
            if (carPredicate.test(car)) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }
}
