package org.writingLambdasInJavaCode.lambdasWithFunctionalInterfaces;

/**
 * Runnable, FileFilter, and Comparator are examples of functional interfaces, which describe functions.
 * Java 8 formalized this concept by requiring a functional interface to be annotated with the
 * java.lang.FunctionalInterface annotation type, as in @FunctionalInterface. An interface that
 * is annotated with this type must declare exactly one abstract method.
 * ADVERTISEMENT
 *
 * You can use Java's pre-defined functional interfaces (discussed later), or you can easily specify your
 * own, as follows:
 * */
@FunctionalInterface
public interface Function<T, R> {
    R apply(T t);
}
