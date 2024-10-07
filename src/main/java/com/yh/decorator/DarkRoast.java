package com.yh.decorator;

public class DarkRoast extends Beverage {

    public DarkRoast(){
        this.description = "darkLoast Coffee";
    }

    @Override
    public double cost() {
        return .99;
    }

    
}
