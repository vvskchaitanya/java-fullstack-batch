package com.fullstack.java.threads;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CopyFilesUsingThreadsExample2 {

    public static void main(String[] args) {
        String src = "sourceDir/";

        String dest = "targetDir/";

        try {
            Files.walk(Paths.get(src)).forEach(f->{

                CopyFileThread copyFileThread = new CopyFileThread(f.toString(), f.toString().replace(src, dest));

                copyFileThread.start();
            });

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
