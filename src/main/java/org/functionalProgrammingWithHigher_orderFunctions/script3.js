/**
 * Filter and map:
 *
 * Functional programming languages typically provide several useful higher-order functions. Two common examples
 * are filter and map.
 *     -- A filter processes a list in some order to produce a new list containing exactly those elements of the original
 *     -- list for which a given predicate (think Boolean expression) returns true.
 *     A map applies a given function to each element of a list, returning a list of results in the same order.
 *
 *     JavaScript supports filtering and mapping functionality via the filter() and map() higher-order functions.
 * */

console.log([1, 2, 3, 4, 5, 6].filter( (num) => { return num % 2 === 0}));
console.log('\n');
console.log([3, 13, 22].map( (num) => { return num * 3 }));
