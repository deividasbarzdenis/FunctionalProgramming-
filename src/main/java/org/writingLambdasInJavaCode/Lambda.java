package org.writingLambdasInJavaCode;

import java.io.File;

public class Lambda {
    public static void main(String[] args) {
        /**
         * A lambda is an expression that describes a function by denoting an implementation of a functional
         * interface. Here's an example:
         *
         * From left to right, () identifies the lambda's formal parameter list (there are no parameters),
         * -> signifies a lambda expression, and System.out.println("my first lambda")
         * is the lambda's body (the code to be executed).
         * */
        Runnable my_first_lambda = () -> System.out.println("my first lambda");

        /**
         * A lambda has a type, which is any functional interface for which the lambda is an implementation.
         * One such type is java.lang.Runnable, because Runnable's void run() method also has an empty
         * formal parameter list:
         * */
        Runnable r = () -> System.out.println("my first lambda");

        /**
         * You can pass the lambda anywhere that a Runnable argument is required; for example, the Thread(Runnable r)
         * constructor. Assuming that the previous assignment has occurred, you could pass r to this constructor,
         * as follows:
         * */
        new Thread(() -> System.out.println("my first lambda"));

        // A lambda-based file filter
        File[] txtFiles = new File(".").listFiles(p -> p.getAbsolutePath().endsWith("txt"));

        // Return statements in lambda expressions
        /**
         * for multi-statement lambdas, you'll still need the return statement. In these cases you must place
         * the lambda's body between braces as follows (don't forget the semicolon to terminate the statement):
         * */
        File[] txtFiles1 = new File(".").listFiles(p -> { return p.getAbsolutePath().endsWith("txt"); });
    }
}
