package com.List;

import java.util.ArrayList;
import java.util.Objects;

public class Car implements CarInt {
    String brand;
    String name;
    int year;

    public Car() {
    }

    public Car(String brand, String name, int year) {
        this.brand = brand;
        this.name = name;
        this.year = year;
    }


    @Override
    public void CarList(ArrayList<Car> List) {
        for (Car car : List) {
            System.out.println(car.brand + " " + car.name + " " + car.year);

        }
        System.out.println("----------------------");


    }

        public void Carbrand(ArrayList<Car>Brand) {
            for (Car car : Brand) {
                System.out.println(car.brand + " " + car.name + " " + car.year);
            }
            System.out.println("-----------------");
        }
        public void carSearch(String nameSearch,ArrayList<Car>listSearch) {
        boolean isHave = false;
        for (Car car: listSearch) {
            if (Objects.equals(nameSearch, car.name)) {
                isHave = true;
                break;
            }
        }
        if (isHave) {
            System.out.println("Yes Car");
        }else {
            System.out.println("Car no");
            }
            System.out.println("--------------------");
        }
        }



