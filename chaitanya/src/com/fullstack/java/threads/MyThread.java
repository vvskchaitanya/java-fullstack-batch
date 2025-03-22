package com.fullstack.java.threads;

/**
 * Demonstrate java program to create a simple thread and show how threads are executed
 */
public class MyThread extends Thread{

    private int start;

    private int end;

    public MyThread(String name, int start, int end){
        super(name);
        this.start =start;
        this.end = end;
        System.out.println("Thread is in new / intialized state: "+this.getName());
    }

    public void run(){
        System.out.println("Thread is in running state: "+this.getName()+" "+this.getState());

        for(int i=start;i<=end;i++){
            System.out.println(this.getName()+" "+i);
        }
    }

    public static void main(String[] args) {
        // Create Thread
        MyThread thread1 = new MyThread("MyThread1",1,5);

        MyThread thread2 = new MyThread("MyThread2",10,15);

        MyThread thread3 = new MyThread("MyThread3",20,25);

        MyThread thread4 = new MyThread("MyThread4",30,35);

        thread1.start();

        thread2.start();

        thread3.start();

        thread4.start();

    }

}
