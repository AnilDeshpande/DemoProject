package com.demo.coroutinesdemo.javathreaddemo;

class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("Worker Thread Started");
        System.out.println("Thread name: "+Thread.currentThread().getName()+", Thread id: "+Thread.currentThread().getId());
        for(int i=0;i<10;i++){
            try {
                Thread.sleep(1000);
                System.out.println("Remaining time left: "+(10-i));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Worker Thread ended");
    }
}

public class SimpleJavaThreadDemo {
    public static void main(String[] args) {
        System.out.println("Main started");
        System.out.println("Thread name: "+Thread.currentThread().getName()+", Thread id: "+Thread.currentThread().getId());
        new MyThread().start();
        System.out.println("Main ended");
    }
}
