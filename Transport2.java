package org.example.task_all;

public abstract class Transport2 {
    public abstract void gas();
    public void TransportMethod() {
    }
    public void printInfo(){
        System.out.println("Метод не принимает параметры");
    }
    public void printInfo(String nazvanie){
        System.out.println("Метод принимает String");
    }
    public void printInfo(int speed){
        System.out.println("Метод принимает int");
    }
    private String model;
    int height;
    protected int weight;
    public int maxSpeed;
    public Transport2(){
    }
    public Transport2 (String model, int height, int weight, int maxSpeed) {
        this.model = model;
        this.height = height;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
    }
    public Transport2(String model) {

        this.model = model;
    }

    public java.lang.String getModel() {
        return model;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setModel(java.lang.String model) {
        this.model = model;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
