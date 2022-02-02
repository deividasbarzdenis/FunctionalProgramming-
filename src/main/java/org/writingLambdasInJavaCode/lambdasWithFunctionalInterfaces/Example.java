package org.writingLambdasInJavaCode.lambdasWithFunctionalInterfaces;

/**
 * You can use Java's pre-defined functional interfaces (discussed later), or you can easily specify your own, as follows:
 * */
public class Example {
    public static void main(String[] args) {
        System.out.println(getValue(t -> (int) (Math.random() * t), 10));
        System.out.println(getValue(x -> x * x, 20));
    }
    static Integer getValue(Function<Integer, Integer> f, int x){
        return f.apply(x);
    }
}
