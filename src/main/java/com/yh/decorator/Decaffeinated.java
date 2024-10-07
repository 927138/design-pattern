package com.yh.decorator;

public class Decaffeinated extends Beverage {

    public Decaffeinated(){
        this.description = "Decaffeinated Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }

    
}
