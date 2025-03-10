package com.fullstack.java.threads;

public class CopyFilesUsingThreadsExample {

    public static void main(String[] args) {
        String src1 = "helloworld1.txt";

        String src2 = "helloworld2.txt";

        String dest1 = "helloworld3.txt";

        String dest2 = "helloworld4.txt";

        CopyFileThread c1 = new CopyFileThread(src1, dest1);

        CopyFileThread c2 = new CopyFileThread(src2, dest2);

        c1.start();

        c2.start();
    }

}
