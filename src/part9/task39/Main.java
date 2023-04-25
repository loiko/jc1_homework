package part9.task39;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Garage<Car> carGarage = new Garage<>();
        Garage<Motorcycle> motorcycleGarage = new Garage<>();

        System.out.print("Enter car name: ");
        String carName = scanner.nextLine();
        carGarage.park(new Car(carName));

        System.out.print("Enter motorcycle name: ");
        String motorcycleName = scanner.nextLine();
        motorcycleGarage.park(new Motorcycle(motorcycleName));

        System.out.println("Car garage: " + carGarage.getVehicle().getName());
        System.out.println("Motorcycle garage: " + motorcycleGarage.getVehicle().getName());

    }
}

