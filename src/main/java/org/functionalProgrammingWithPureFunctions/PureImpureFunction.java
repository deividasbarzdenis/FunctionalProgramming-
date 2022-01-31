package org.functionalProgrammingWithPureFunctions;

public class PureImpureFunction {

    // impure bonus calculation

    /**
     * An impure function is a functional programming function that violates either of these requirements.
     * Because pure functions have no interaction with the outside world (apart from calling other pure functions)
     * */
    private double limit = 100;

    public double calculateBonusImpure(double numSales){
        return (numSales > this.limit) ? 0.10 * numSales : 0;
    }

    // pure bonus calculation

    /**
     * A pure function is a functional programming function that depends only on its input arguments
     * and no external state
     *
     * pure function always returns the same result for the same arguments. Pure functions also have
     * no observable side effects.
     *
     * When no data dependency exists between pure functions, they can be evaluated in any order without affecting
     *
     *
     * the outcome, making them suitable for parallel execution. This is one of functional programming's benefits.
     * */
    public double calculateBonusPure(double numSales){
        return (numSales > 100) ? 0.10 * numSales : 0;
    }

    public static void main(String[] args) {
        PureImpureFunction param = new PureImpureFunction();
        System.out.println(param.calculateBonusImpure(174));
        System.out.println();
        System.out.println(param.calculateBonusPure(174));
    }
}
