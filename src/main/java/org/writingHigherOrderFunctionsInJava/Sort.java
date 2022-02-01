package org.writingHigherOrderFunctionsInJava;

import java.util.Comparator;

/**
 * way to work with higher-order functions in Java. In this case, the code passes a comparator function to
 * a sort() higher-order function for an ascending-order sort, and a second comparator function to sort()
 * for a descending-order sort.
 *
 * Two significant parts of this code are the sort() method (which implements the Bubble Sort algorithm)
 * and the sort() invocations in the main() method. Although sort() is far from being functional,
 * it demonstrates a higher-order function that receives a function--the comparator--as an argument.
 * It executes this function by invoking its compare() method. Two instances of this function are passed
 * in two sort() calls in main().
 * */
public class Sort {
    public static void main(String[] args) {

        String[] innerplanets = { "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn" };
        dump(innerplanets);
        sort(innerplanets, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        dump(innerplanets);
        sort(innerplanets, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

    }
    static <T> void dump(T[] array){
        for (T element:array){
            System.out.println(element);
        }
        System.out.println();
    }
    static <T> void sort(T[] array, Comparator<T> cmp){
        for(int pass = 0; pass < array.length - 1; pass++){
            for(int i = array.length-1; i > pass; i--){
                if(cmp.compare(array[i], array[pass]) < 0){
                    swap(array, i, pass);
                }
            }
        }
    }

    static <T> void swap(T[] array, int i, int j){
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
