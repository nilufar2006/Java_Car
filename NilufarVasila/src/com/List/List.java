package com.List;

import java.util.ArrayList;
import java.util.Scanner;

public class List {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car car = new Car();

        ArrayList<Car> carArrayList = new ArrayList<>();


        carArrayList.add(new Car("BMW", "X7", 2022));
        carArrayList.add(new Car("LADA", "X4", 2019));
        carArrayList.add(new Car("TRACKER", "X6", 2021));
        carArrayList.add(new Car("SANATA", "X5", 2020));

        System.out.println("Car Shop");


        while (true) {
            System.out.println("Car List ->[1] ");
            System.out.println("Car name search ->[2] ");
            System.out.println("Car Brand search ->[3] ");
            System.out.println("= ");
            int n = scanner.nextInt();

            switch (n) {
                case 1 -> {
                    car.CarList(carArrayList);

                }
                case 2 -> {
                    System.out.println("Search Car");
                    System.out.println("Car name write: ");
                    scanner = new Scanner(System.in);
                    String carName = scanner.nextLine();
                    car.carSearch(carName, carArrayList);
                }
                default -> System.out.println("write error");
            }
        }
    }
}
