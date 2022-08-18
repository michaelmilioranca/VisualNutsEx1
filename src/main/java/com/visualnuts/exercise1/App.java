package com.visualnuts.exercise1;

import com.visualnuts.exercise1.usecase.CustomPrinter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CustomPrinter customPrinter = new CustomPrinter();
        customPrinter.printUntil(100);
    }
}
