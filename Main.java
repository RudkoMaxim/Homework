package org.example.task_all;

public class Main {

    public static void main(String[] args) {
        Car2 car = new Car2();
        car.TransportMethod();
        Bus2 bus = new Bus2();
        bus.TransportMethod();
        car.printInfo();
        car.printInfo();
        bus.printInfo();
        Engine diesel = new Engine();
        Radiator radiator = new Radiator();
        Battery ion = new Battery();
        Car2 carSuper = new Car2(diesel, radiator, ion);


        System.out.println("Модель: " + car.getModel() + " \nВысота: " + car.getWeight() + " \nДлина: " + car.getHeight() + " \nМаксимальная скорость: " + car.getMaxSpeed());
        System.out.println("\nМодель: " + bus.getModel() + " \nВысота: " + bus.getWeight() + " \nДлина: " + bus.getHeight() + " \nМаксимальная скорость: " + bus.getMaxSpeed());
    }
}