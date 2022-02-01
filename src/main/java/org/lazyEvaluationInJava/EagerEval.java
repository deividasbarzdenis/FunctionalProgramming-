package org.lazyEvaluationInJava;

/**
 * Lazy evaluation in Java
 *
 * Lazy evaluation is another functional programming technique that is not new to Java 8. This technique
 * delays the evaluation of an expression until its value is needed. In most cases, Java eagerly evaluates
 * an expression that is bound to a variable. Java supports lazy evaluation for the following specific syntax:
 *
 *     The Boolean && and || operators, which will not evaluate their right operand when the left operand is false
 *     (&&) or true (||).
 *     The ?: operator, which evaluates a Boolean expression and subsequently evaluates only one of two alternative
 *     expressions (of compatible type) based on the Boolean expression's true/false value.
 *
 * Functional programming encourages expression-oriented programming, so you'll want to avoid using statements as
 * much as possible. For example, suppose you want to replace Java's if-else statement with an ifThenElse() method.
 * Listing 3 shows a first attempt.
 * */
public class EagerEval {
    public static void main(String[] args) {
        System.out.printf("%d%n", ifThenElse(true, square(4), cube(4)));
        System.out.printf("%d%n", ifThenElse(false, square(4), cube(4)));
    }
    static int cube(int x){
        System.out.println("In cube");
        return x * x * x;
    }
    /**
     * ifThenElse() method that takes a Boolean predicate and a pair of integers, returning the onTrue integer
     * when the predicate is true and the onFalse integer otherwise.
     * */
    static  int ifThenElse(boolean predicate, int onTrue, int onFalse){
        return (predicate) ? onTrue : onFalse;
    }
    static int square(int x){
        System.out.println("In square");
        return x * x;
    }

    /**
     * The output shows that each ifThenElse() call results in both methods executing, irrespective of the
     * Boolean expression. We cannot leverage the ?: operator's laziness because Java eagerly evaluates
     * the method's arguments.
     *
     * Although there's no way to avoid eager evaluation of method arguments, we can still take advantage of ?:'s
     * lazy evaluation to ensure that only square() or cube() is called. Listing 4 shows how.
     * */
}
