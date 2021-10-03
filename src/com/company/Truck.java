package com.company;

public class Truck extends Car{
    private double Tonnage;

    public Truck(String brand, int year, double mileage, double value, double tonnage) {
        super(brand, year, mileage, value);
        Tonnage = tonnage;
    }

    @Override
    public double Price() {
        if(Year <= 5){
            return Value;
        }
        if(Tonnage <= 5){
            return 0.3 * Value;
        }
        if(Tonnage <= 10){
            return 0.6 * Value;
        }
        return 0.8* Value;
    }
}
