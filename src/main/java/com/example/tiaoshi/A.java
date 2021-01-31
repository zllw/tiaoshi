package com.example.tiaoshi;

public class A implements Runnable {
    @Override
    public void run() {
        System.out.println("线程："+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new A());
        thread.start();
        thread.run();
    }
}
