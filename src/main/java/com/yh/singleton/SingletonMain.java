package com.yh.singleton;

public class SingletonMain {
    public static void main(String[] args) throws InterruptedException {
        ThreadingTest t1 = new ThreadingTest();
        ThreadingTest t2 = new ThreadingTest();

        t1.start();

        t2.start();
    }
}
