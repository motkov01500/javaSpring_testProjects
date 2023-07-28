package org.example;

public class Car {

    private String model;
    private String name;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car(String model, String name) {
        this.model = model;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if(getClass() != obj.getClass()) {
            return false;
        }
        Car car = (Car) obj;
        return car.name.equals(this.name) && car.model.equals(this.model);
    }
}
