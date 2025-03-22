package com.vvsk.fullstack;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name");

        String name = sc.next();

        
        System.out.println( "Hello "+name+", Welcome to java maven project" );
    }
}
