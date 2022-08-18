package com.visualnuts.exercise1.usecase;

public class CustomPrinter {

    private static final String VISUAL_NUTS = "Visual Nuts";
    private static final String VISUAL = "Visual";
    private static final String NUTS = "Nuts";

    public void printUntil(final int until){
        int counter = 1;
        while(counter <= until){
            System.out.print(printWordByNumber(counter));
            counter++;
        }

    }

    public String printWordByNumber(final int number) {
        if(checkDivisors(number, 3, 5)){
            return VISUAL_NUTS;
        }else if (checkDivisors(number, 3)){
            return VISUAL;
        }else if(checkDivisors(number, 5)){
            return NUTS;
        }else{
            return String.valueOf(number);
        }
    }

    public boolean checkDivisors(final int divided, final int... dividers){
        for(int divider : dividers){
            if(isDividedBy(divided, divider)){
                return false;
            }
        }
        return true;
    }

    private boolean isDividedBy(int divided, int divider) {
        return divided % divider != 0;
    }
}
