/**
 * Functional programming with closures:
 *
 * First-class functions are associated with the concept of a closure, which is a persistent scope that holds
 * onto local variables even after the code execution has left the block in which the local variables were defined.
 *
 * Operationally, a closure is a record that stores a function and its environment. The environment maps each of
 * the function's free variables (variables used locally, but defined in an enclosing scope) with the value or
 * reference to which the variable's name was bound when the closure was created. It lets the function access
 * those captured variables through the closure's copies of their values or references, even when the function
 * is invoked outside their scope.
 * */

/**
 * first-class function named add() with a parameter x and a nested function partialAdd().
 * The nested function partialAdd() has access to x because x is in add()'s lexical scope.
 * Function add() returns a closure that contains a reference to partialAdd() and a copy of
 * the environment around add(), in which x has the value assigned to it in a specific invocation of add().
 *
 * Because add() returns a value of function type, variables add10 and add20 also have function type.
 * The add10(5) invocation returns 15 because the invocation assigns 5 to parameter y in the call to partialAdd(),
 * using the saved environment for partialAdd() where x is 10. The add20(5) invocation returns 25 because,
 * although it also assigns 5 to y in the call to partialAdd(), it's now using another saved environment
 * for partialAdd() where x is 20. Thus, while add10() and add20() use the same function partialAdd(),
 * the associated environments differ and invoking the closures will bind x to two different values
 * in the two invocations, evaluating the function to two different results.
 * */
function add(x){
    function partialAdd(y){
        return x + y;
    }
    return partialAdd;
}

var add10 = add(10);
var add20 = add(20);

console.log(add10(5))
console.log(add20(5))
