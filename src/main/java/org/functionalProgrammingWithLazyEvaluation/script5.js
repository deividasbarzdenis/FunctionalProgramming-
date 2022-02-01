/**
 * Functional programming with lazy evaluation:
 *
 * Another important functional programming feature is lazy evaluation (also known as nonstrict evaluation),
 * which is the deferral of expression evaluation for as long as possible. Lazy evaluation offers several benefits,
 * including these two:
 *
 *     - Expensive (timewise) calculations can be deferred until they're absolutely necessary.
 *     - Unbounded collections are possible. They'll keep delivering elements for as long as they're requested to do so.
 *
 * Lazy evaluation is integral to Haskell. It won't calculate anything (including a function's arguments before
 * the function is called) unless it's strictly necessary to do so.
 *
 * Java's Streams API capitalizes on lazy evaluation. A stream's intermediate operations (e.g., filter())
 * are always lazy; they don't do anything until a terminal operation (e.g., forEach()) is executed.
 *
 * Although lazy evaluation is an important part of functional languages, even many imperative languages provide
 * builtin support for some forms of laziness. For example, most programming languages support short-circuit
 * evaluation in the context of the Boolean AND and OR operators. These operators are lazy, refusing to evaluate
 * their right-hand operands when the left-hand operand is false (AND) or true (OR).
 *
 * Lazy evaluation is often combined with memoization, an optimization technique used primarily to speed
 * up computer programs by storing the results of expensive function calls and returning the cached
 * result when the same inputs reoccur.
 *
 * Because lazy evaluation doesn't work with side effects (such as code that produces exceptions and I/O),
 * imperative languages mainly use eager evaluation (also known as strict evaluation), where an expression
 * is evaluated as soon as it's bound to a variable.
 *
 * */
var a = false && expensiveFunction("1");
var b = true && expensiveFunction("2");
var c = false || expensiveFunction("3");
var d = true || expensiveFunction("4");

function expensiveFunction(id){
    console.log("expensiveFunction() called with " + id)
}
