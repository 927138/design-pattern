package com.yh.singleton;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private volatile static ChocolateBoiler boilerInstance;

    private ChocolateBoiler(){}

    public static ChocolateBoiler getInstance(){
        if(boilerInstance == null){
            synchronized(ChocolateBoiler.class){
                if(boilerInstance == null){
                    boilerInstance = new ChocolateBoiler();
                    System.out.println(Thread.currentThread().getName() + "  boiler create instance");
                }
            }
        }System.out.println(Thread.currentThread().getName() + " return instance");
        return boilerInstance;
    }

    public void fill(){
        if(isEmpty()){
            empty = false;
            boiled = false;
        }
    }

    public void drain(){
        if(!isEmpty() && isBoiled()) empty = true;
    }

    public void boil(){
        if(!isEmpty() && !isBoiled()) boiled = true;
    }

    public boolean isBoiled() {
        return boiled;
    }

    public boolean isEmpty() {
        return empty;
    }
}
