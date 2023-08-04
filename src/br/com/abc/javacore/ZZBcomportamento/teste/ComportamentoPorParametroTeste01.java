package br.com.abc.javacore.ZZBcomportamento.teste;

import br.com.abc.javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTeste01 {

    static List<Car> cars = List.of(
            new Car("green", 2015),
            new Car("black", 2022),
            new Car("white", 2010),
            new Car("white", 2005),
            new Car("black", 1994)
    );

    public static void main(String[] args) {
        System.out.println("Black cars: " + filterByColor(cars, "black"));
        System.out.println("Cars before 2010: " + filterByAgeBefore(cars, 2010));
    }

    public static List<Car> filterByColor(List<Car> carList, String color) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : carList) {
            if (car.getColor().equals(color)) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }

    public static List<Car> filterByAgeBefore(List<Car> carList, int year) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : carList) {
            if (car.getYear() < year) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }
}
