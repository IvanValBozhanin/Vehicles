package com.company;

import java.io.Serializable;

public class Car implements Serializable {
    protected String Brand;
    protected int Year;
    protected double Mileage, Value;

    public Car(String brand, int year, double mileage, double value) {
        Brand = brand;
        Year = 2021 - year;
        Mileage = mileage;
        Value = value;
    }

    public double Price(){
        if(Year <= 3){
            return 0.8*Value;
        }
        else if(Year <= 6){
            return 0.6*Value;
        }
        return 0.3 * Value;
    }

    @Override
    public String toString() {
        return Brand + ':' +
                " " + Mileage +
                " km, " + String.format("%.2f" , Price());
    }
}
