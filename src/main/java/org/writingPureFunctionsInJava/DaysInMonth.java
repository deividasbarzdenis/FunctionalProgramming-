package org.writingPureFunctionsInJava;

/**
 * The main() method instantiates an anonymous inner class that implements the Function interface. The apply()
 * method unboxes month and uses it to index an array of days-in-month integers. The integer
 * at this index is returned. (I'm ignoring leap years for simplicity.)
 *
 * main() next executes this function twice by invoking apply() to return the day counts for the months
 * of April and August. These counts are subsequently printed.
 *
 * We've managed to create a function, and a pure function at that! Recall that a pure function depends only
 * on its arguments and no external state. There are no side effects.
 * */
public class DaysInMonth {
    public static void main(String[] args) {
        Function<Integer, Integer> dim = new Function<Integer, Integer>(){
            @Override
            public Integer apply(Integer month) {
                return new Integer[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}[month];
            }
        };
        System.out.printf("April: %d%n", dim.apply(3));
        System.out.printf("August: %d%n", dim.apply(7));
    }
}
