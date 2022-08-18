package com.visualnuts.exercise1.usecase;


import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class CustomPrinterTest {

    public CustomPrinter customPrinter = new CustomPrinter();
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @Test
    void shouldPrint12Visual(){
        System.setOut(new PrintStream(outputStreamCaptor));

        customPrinter.printUntil(3);
        assertEquals("12Visual", outputStreamCaptor.toString().trim());

        System.setOut(standardOut);
    }

    @Test
    void shouldPrintVisual(){
        final String expected = "Visual";
        assertEquals(expected, customPrinter.printWordByNumber(3));
    }

    @Test
    void shouldPrintVisualNuts(){
        final String expected = "Visual Nuts";
        assertEquals(expected, customPrinter.printWordByNumber(15));
    }

    @Test
    void shouldPrintNuts(){
        final String expected = "Nuts";
        assertEquals(expected, customPrinter.printWordByNumber(5));
    }

    @Test
    void shouldPrintNumber(){
        final String expected = "7";
        assertEquals(expected, customPrinter.printWordByNumber(7));
    }

    @Test
    void shouldReturnTrueWhenNumberIsDivided(){
        assertTrue(customPrinter.checkDivisors(9, 3));
    }

    @Test
    void shouldReturnFalseWhenNumberIsNotDivided(){
        assertFalse(customPrinter.checkDivisors(9, 5));
    }

    @Test
    void shouldReturnTrueWhenNumberIsDividedByMoreThanOneDivisor(){
        assertTrue(customPrinter.checkDivisors(15, 5,3));
    }

    @Test
    void shouldReturnFalseWhenNumberIsNotDividedByAllDivisors(){
        assertFalse(customPrinter.checkDivisors(9, 3, 5));
    }
}