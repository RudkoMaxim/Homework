package org.example.task_all;

public final class Car2 extends Transport2 {
    private Engine diesel;
    private Radiator radiator;
    private Battery ion;

    private final String type = "auto";

    public Car2() {
        super("BMW", 1000, 1300, 250);
    }

    public Car2(Engine diesel, Radiator radiator, Battery ion) {
        this.diesel = diesel;
        this.radiator = radiator;
        this.ion = ion;
    }

    public final void printType(){
        System.out.println("этот текст " + this.type);
    }
    @Override
    public void gas() {
    }

    @Override
    public void TransportMethod() {
        super.TransportMethod();
    }




}

