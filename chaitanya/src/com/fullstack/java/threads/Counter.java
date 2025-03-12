package com.fullstack.java.threads;

/**
 * Demonstrate the use of synchronized keyword when multiple threads are accessing same method
 */
public class Counter {

    private int count;

    public synchronized void increment(){
        this.count++;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    
    
}
