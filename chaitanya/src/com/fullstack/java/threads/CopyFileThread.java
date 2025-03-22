package com.fullstack.java.threads;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Copy File using simple thread to use that in multithreaded main program later
 */

public class CopyFileThread extends Thread{

    private String source;

    private String destination;

    public CopyFileThread(String source, String destination){
        this.source = source;
        this.destination = destination;
    }

    public void run(){
        System.out.println("Running "+this);

        Path sourcePath = Paths.get(this.source);

        Path destPath = Paths.get(this.destination);

        try{
            Files.copy(sourcePath, destPath);
        }catch(IOException ioe){
            System.out.println("Unable to copy "+sourcePath+" "+ioe.getMessage());
        }

        System.out.println("Completed "+this);
    }

    @Override
    public String toString() {
        return "CopyFileThread [source=" + source + ", destination=" + destination + "]";
    }

    

}
