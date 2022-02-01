/**
 * Functional programming with currying
 *
 * Currying is a way to translate the evaluation of a multi-argument function into the evaluation of an
 * equivalent sequence of single-argument functions. For example, a function takes two arguments: x and y.
 * Currying transforms the function into taking only x and returning a function that takes only y.
 * Currying is related to but is not the same as partial application, which is the process of fixing a number
 * of arguments to a function, producing another function of smaller arity.
 * */

/**
 * The script presents a noncurried two-argument multiply() function, followed by a first-class curried_multiply()
 * function that receives multiplicand argument x and returns a closure containing a reference to an anonymous
 * function (that receives multiplier argument y) and a copy of the environment around curried_multiply(),
 * in which x has the value assigned to it in an invocation of curried_multiply().
 *
 * The rest of the script first invokes multiply() with two arguments and prints the result.
 * It then invokes curried_multiply() in two ways:
 *
 *     - curried_multiply(6)(7) results in curried_multiply(6) executing first. The returned closure executes
 *     the anonymous function with the closure's saved x value 6 being multiplied by 7.
 *     - var mul_by_4 = curried_multiply(4) executes curried_multiply(4) and assigns the closure to mul_by_4.
 *     mul_by_4(2) executes the anonymous function with the closure's 4 value and the passed argument 2.
 * */
function multiply(x, y){
    return x * y;
}

function curried_multiply(x){
    return function(y){
        return x * y;
    }
}

console.log(multiply(6, 7));
console.log(curried_multiply(6)(7))
const mul_by_4 = curried_multiply(4);
console.log(mul_by_4(2));
