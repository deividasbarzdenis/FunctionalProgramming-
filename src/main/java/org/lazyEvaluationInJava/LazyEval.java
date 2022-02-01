package org.lazyEvaluationInJava;

/**
 * we can still take advantage of ?:'s lazy evaluation to ensure that only square() or cube() is called.
 * */
public class LazyEval {
    public static void main(String[] args) {
        Function<Integer, Integer> square = new Function<Integer, Integer>(){
            {
                System.out.println("SQUARE");
            }
            @Override
            public Integer apply(Integer integer) {
                System.out.println("In Square");
                return integer * integer;
            }
        };
        Function<Integer, Integer> cube = new Function<Integer, Integer>(){
            {
                System.out.println("CUBE");
            }
            @Override
            public Integer apply(Integer integer) {
                System.out.println("In Cube");
                return integer * integer * integer;
            }
        };

        System.out.printf("%d%n", ifThenElse(true, square, cube, 4));
        System.out.printf("%d%n", ifThenElse(false, square, cube, 4));
    }

    /**
     * ifThenElse() into a higher-order function by declaring this method to receive a pair of Function arguments.
     * Although these arguments are eagerly evaluated when passed to ifThenElse(), the ?: operator causes only
     * one of these functions to execute (via apply()). You can see both eager and lazy evaluation at work when you compile and run the application.
     * */
    static <T, R> R ifThenElse(boolean predicate, Function<T, R> onTrue, Function<T, R> onFalse, T t){
        return (predicate ? onTrue.apply(t) : onFalse.apply(t));
    }
}
