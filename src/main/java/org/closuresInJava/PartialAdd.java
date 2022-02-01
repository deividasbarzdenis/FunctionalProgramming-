package org.closuresInJava;
/**
 * Closures in Java
 *
 * An anonymous inner class instance is associated with a closure. Outer scope variables must be declared final
 * or (starting in Java 8) effectively final (meaning unmodified after initialization) in order to be accessible.
 *
 * the Java equivalent of the closure I previously presented in JavaScript (see Part 1, Listing 8). This code declares
 * an add() higher-order function that returns a function for performing partial application of the add() function.
 * The apply() method accesses variable x in the outer scope of add(), which must be declared final prior to Java 8.
 * The code behaves pretty much the same as the JavaScript equivalent.
 *
 * */
public class PartialAdd {
    Function<Integer, Integer> add(final int x) {
        Function<Integer, Integer> partialAdd = new Function<Integer, Integer>(){
            @Override
            public Integer apply(Integer y) {
                return y + x;
            }
        };
        return partialAdd;
    }

    public static void main(String[] args) {
        PartialAdd pa = new PartialAdd();
        Function<Integer, Integer> add10 = pa.add(10);
        Function<Integer, Integer> add20 = pa.add(20);

        System.out.println(add10.apply(5));
        System.out.println(add20.apply(5));
    }
}
