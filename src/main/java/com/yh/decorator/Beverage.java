package com.yh.decorator;

public abstract class Beverage {
    String description = "none";    
    
    public String getDescription(){
        return this.description;
    }

    public abstract double cost();
}
