package org.writingPureFunctionsInJava;

/**
 * The generic Function interface in Listing 1 describes a function with a single parameter of type T and a return
 * type of type R. The Function interface declares an R apply(T t) method that applies this function to the given argument.
 * */
public interface Function <T, R>{

    R apply(T t);
}

