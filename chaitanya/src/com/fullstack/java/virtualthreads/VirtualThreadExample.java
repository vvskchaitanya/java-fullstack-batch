package com.fullstack.java.virtualthreads;

/** Demonstrate program to create java virtual threads */
public class VirtualThreadExample {

    public static void main(String[] args) {
        
        Thread normalThread = new Thread(new MyThread(), "NormalThread");

        Thread virtualThread = Thread.ofVirtual().name("VirtualThread").start(new MyThread());

        normalThread.start();

        
        try {

            normalThread.join();
            virtualThread.join();

        } catch (InterruptedException e) {
            
            e.printStackTrace();
        }
        
        System.out.println("\n Both threads completed");

    }

}
