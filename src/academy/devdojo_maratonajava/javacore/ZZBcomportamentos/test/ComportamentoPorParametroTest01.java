package academy.devdojo_maratonajava.javacore.ZZBcomportamentos.test;

import academy.devdojo_maratonajava.javacore.ZZBcomportamentos.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Car> cars = List.of(new Car("green",2011), new Car("black",2010), new Car("red", 2019));

    public static void main(String[] args) {
        System.out.println(filterGreenCar(cars));

    }

    private static List<Car> filterGreenCar(List<Car> cars){
        List<Car> greenCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("green")){
                greenCars.add(car);
            }
        }
        return greenCars;
    }

    private static List<Car> filterCarByColor(List<Car> cars, String cor){
        List<Car> greenCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(cor)){
                greenCars.add(car);
            }
        }
        return greenCars;
    }


}
