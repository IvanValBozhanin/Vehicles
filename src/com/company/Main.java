package com.company;

import java.io.*;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<Car> cars = new Stack<>();
        try(Scanner in = new Scanner(new File("src/com/company/data.txt"))){
            while(in.hasNext()){
                int type = Integer.parseInt(in.next());
                String name = in.next();
                int y = Integer.parseInt(in.next());
                double m = Double.parseDouble(in.next());
                double v = Double.parseDouble(in.next());
                if(type == 2){
                    double t = Double.parseDouble(in.next());
                    cars.push(new Truck(name, y, m, v, t));
                }
                else{
                    cars.push(new Car(name, y, m, v));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while(!cars.isEmpty()){
            System.out.println(cars.peek().toString());
            try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/com/company/out.dat"))){
                out.writeObject(cars.peek());
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            cars.pop();
        }
    }
}
