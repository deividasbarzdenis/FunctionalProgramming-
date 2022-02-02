package org.curryingInJava;

/**
 * You might be confused by my use of the phrase "partial application," especially because I stated in
 * Part 1 that currying isn't the same as partial application, which is the process of fixing a number
 * of arguments to a function, producing another function of smaller arity. With partial application,
 * you can produce functions with more than one argument, but with currying, each function must
 * have exactly one argument.
 * */
public class CurriedCalc {
        public static void main(String[] args) {
            System.out.println(calc(1).apply(2).apply(3).apply(4));
        }

        /**
         *  currying to evaluate the function f(a, b, c, d) = (a + b) * (c + d). Given expression
         *  calc(1).apply(2).apply(3).apply(4), this function is curried as follows:
         *
         *     f(1, b, c, d) = g(b, c, d) = (1 + b) * (c + d)
         *     g(2, c, d) = h(c, d) = (1 + 2) * (c + d)
         *     h(3, d) = i(d) = (1 + 2) * (3 + d)
         *     i(4) = (1 + 2) * (3 + 4)
         * */
        static Function<Integer, Function<Integer, Function<Integer, Integer>>>
        calc(final Integer a) {
            return new Function<Integer,
                    Function<Integer, Function<Integer, Integer>>>() {
                @Override
                public Function<Integer, Function<Integer, Integer>>
                apply(final Integer b) {
                    return new Function<Integer, Function<Integer, Integer>>() {
                        @Override
                        public Function<Integer, Integer>
                        apply(final Integer c) {
                            return new Function<Integer, Integer>() {
                                @Override
                                public Integer apply(Integer d) {
                                    return (a + b) * (c + d);
                                }
                            };
                        }
                    };
                }
            };
        }
        /**
         * Because currying is about performing partial application of a function, it doesn't matter in what
         * order the arguments are applied. For example, instead of passing a to calc() and d to the most-nested
         * apply() method (which performs the calculation), we could reverse these parameter names. This would
         * result in d c b a instead of a b c d, but it would still achieve the same result of 21.
         * */

        // Update with lambda:
    /**
     * static Function<Integer, Function<Integer, Function<Integer, Integer>>>
     *    calc(Integer a)
     * {
     *    return b -> c -> d -> (a + b) * (c + d);
     * }
     * */
    }
