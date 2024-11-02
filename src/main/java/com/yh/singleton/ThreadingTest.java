package com.yh.singleton;

public class ThreadingTest extends Thread {
    @Override
    public void run() {
        ChocolateBoiler.getInstance();
    }   
}
