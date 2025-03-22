package com.fullstack.java.threads;

public class SynchronizedThreadExample {

    public static void main(String[] args) {
        
        Counter counter = new Counter();

        Thread t1 = new Thread(()->{
            for(var i=1;i<=1000;i++){
                counter.increment();
            }
        });

        Thread t2 = new Thread(()->{
            for(var i=1;i<=1000;i++){
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        try {

            t1.join();
            t2.join();

            System.out.println("\n Count : "+counter.getCount());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       
        

    }

}
