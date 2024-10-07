package com.yh.decorator;

public class HouseBlend extends Beverage {

    public HouseBlend(){
        this.description = "houseBlend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }

}
