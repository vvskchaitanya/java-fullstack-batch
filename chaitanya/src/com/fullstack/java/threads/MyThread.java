package com.fullstack.java.threads;

/**
 * Demonstrate java program to create a simple thread and show how threads are executed
 */
public class MyThread extends Thread{

    public MyThread(String name){
        super(name);
        System.out.println("Thread is in new / intialized state: "+this.getName());
    }

    public void run(){
        System.out.println("Thread is in running state: "+this.getName());
    }

    public static void main(String[] args) {
        // Create Thread
        MyThread thread1 = new MyThread("MyThread1");

        MyThread thread2 = new MyThread("MyThread2");

        MyThread thread3 = new MyThread("MyThread3");

        MyThread thread4 = new MyThread("MyThread4");

        thread1.start();

        thread2.start();

        thread3.start();

        thread4.start();

    }

}
