/**
 * Reduce
 *
 * Another common higher-order function is reduce, which is more commonly known as a fold.
 * This function reduces a list to a single value.
 *
 * reduce() higher-order function to reduce an array of numbers to a single number,
 * which is then divided by the array's length to obtain an average.
 * */
let numbers = [22, 30, 43];
console.log(numbers.reduce((acc, curval) => {return acc + curval}) / numbers.length);

/**
 * You might think that the filter, map, and reduce higher-order functions obviate the need for if-else and various
 * looping statements, and you would be right. Their internal implementations take care of decisions and iteration.
 * */
