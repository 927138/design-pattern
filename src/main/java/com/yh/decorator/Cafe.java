package com.yh.decorator;

public class Cafe {

    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        espresso = new Mocha(espresso);
        print(espresso); 

        Beverage b1 = new DarkRoast();
        b1 = new Mocha(b1);
        b1 = new Mocha(b1);
        b1 = new Whip(b1);
        print(b1);

    }

    public static void print(Beverage beverage){
        System.out.println(beverage.getDescription() + ", $" + beverage.cost());
    }
}
