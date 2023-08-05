package academy.devdojo.maratonajava.javacore.ZZBcomportamento.teste;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;
import academy.devdojo.maratonajava.javacore.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTeste02 {

    static List<Car> cars = List.of(
            new Car("green", 2015),
            new Car("black", 2022),
            new Car("white", 2010),
            new Car("white", 2005),
            new Car("black", 1994)
    );

    public static void main(String[] args) {

        List<Car> greenCars = filter(cars, new CarPredicate() {
            @Override
            public boolean test(Car car) {
                return car.getColor().equals("green");
            }
        });

        System.out.println("green cars: " + greenCars);
        System.out.println("-----------");

        List<Car> blackCars = filter(cars, new CarPredicate() {
            @Override
            public boolean test(Car car) {
                return car.getColor().equals("black");
            }
        });

        System.out.println("black cars: " + blackCars);
        System.out.println("-----------");

        List<Car> carsBefore2010 = filter(cars, new CarPredicate() {
            @Override
            public boolean test(Car car) {
                return car.getYear() < 2010;
            }
        });

        System.out.println("cars before 2010: " + carsBefore2010);

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
