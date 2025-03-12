package com.fullstack.java.virtualthreads;

public class MyThread implements Runnable{

    @Override
    public void run() {
       System.out.println("Running Thread : "+Thread.currentThread().getName());
       for(var i =1;i<10;i++){
        System.out.println(Thread.currentThread().getName()+" : " +i+" ");
       }
    }

}
