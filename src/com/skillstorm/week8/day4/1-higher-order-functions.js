/**
 * Higher Order Function:
 * 
 * A Higher Order Function (HOF) is a function that either takes a function as an argument OR
 * returns a function
 */

function timesX(x) {


    // Anonymous Function
    // It has no name because it needs no name
    return function(number) {
        /**
         *  Closure:
         * 
         * Occurs when you have a function inside of another function referring to some variable higher up in
         * the chain
         * 
         * A function that contains encapsulated references to its surround "Lexical environment"
         * 
         * AKA an inner function that can access the properties of its surrounding parent function
         */
        return number * x;
    }
}

// In JS, Functions are "first-class citizens" meaning that they can be stored in variables, put in arrays,
// and in general be treated as a normal data type
const times2 = timesX(2);

let doubled = times2(33);
console.log(doubled);

const times10 = timesX(10);
console.log(times10(20));

/**
 * This allows me to make functions at runtime
 */

function greet(name, age) {

    function sayNameAndAge() {
        console.log(`Hello! My name is ${name} and I am ${age} years old!`);
    }

    /**
     * If I want to return a named function, I return it WITHOUT opening the parentheses.
     * 
     * Opening them would invoke the function, not doing so simply returns the functions definition
     */
    return sayNameAndAge;
}

const maryGreet = greet('Mary', 25);
maryGreet();
maryGreet();
maryGreet();
maryGreet();

const mikeGreet = greet('Mike', 36);
mikeGreet();

// maryGreet still behaves as intended even after creating a new function with greet();
maryGreet();


function forX(x) {
    // action is a function
    return function(action) {
        for(let i = 0; i < x; i++) {
            // Since action is a function, I will perform this action on each index
            action(i);
        }
    }
}

/**
 * This is what for8 looks like as a function definition
 * 
 * function for8(action) {
        for(let i = 0; i < 8; i++) {
            // Since action is a function, I will perform this action on each index
            action(i);
        }
    }
 */

const for8 = forX(8);

for8(function(num) {
    console.log(num);
});

// Arrow functions are a easier way of passing anonymous functions
// JS uses => instead of ->

// Same rules apply for these arrow functions
for8((num) => console.log(num * 2));

/**
 * Arrow function syntax review
 * 
 * Valid:
 * num => num;
 * 
 * Invalid:
 * (num1, num2) => return num1 + num2;
 * 
 * Valid:
 * () => {}; // Function that does nothing
 * 
 * // To return an empty object
 * () => ({});
 * // OR
 * () => { return {}; };
 * 
 */


// Defining a named arrow function that simply returns an empty object
const myArrowFunction = () => ({});

const answer = myArrowFunction();
console.log(answer);

// Write calcSum as a arrow function
// Using arrow functions to write functions is VERY popular in JavaScript development
const calcSum = (x, y) => x + y;

const factorial = num => {
    if (num < 0) {
        return 0;
    }
    if (num == 0) {
        return 1;
    }
    return num * factorial(num - 1); // This isn't returning a function, it's returning the answer to the function
}

console.log(factorial(5));

// This is a higher order function because it returns the entire method definition
const hof = () => {
    return () => console.log('Hello World!');
}

const newFunction = hof();
newFunction();

// 4 Common HOFs

/**
 * forEach
 * map
 * filter
 * reduce
 */

const planets = ['Mercury', 'Venus', 'Earth', 'Mars', 'Jupiter', 'Saturn', 'Uranus', 'Neptune', 'Pluto'];

// In JS I don't need a stream to use these methods

// forEach does NOT return a new array or alter the original array
planets.forEach((planet) => {
    console.log(planet);
    planet = 'Mars'; // Changes the local variable to Mars
});

console.log(planets); // Still the origninal array

// Map "maps" the original array value to a new value.
// It returns a new array (without altering the original), the value returned is what goes in the new array
const alteredPlanets = planets.map((planet) => {
    return planet.toUpperCase(); // Creates a new array consisting of the upper cased form of the old array
});

console.log(alteredPlanets);

// Filter "filters" the original array by only adding select elements the new array
// Anything that returns a truthy value will be added to the new array 
const filteredPlanets = planets.filter((planet) => {
    // const firstChar = planet.charAt(0);
    // return firstChar === 'm' || firstChar === 'M';
    return planet.length <= 5;
});

console.log(filteredPlanets);

// Reduce "reduces" an array to a singular value
// Main difference from Java's is that to specify an intial value it comes after the function definition
const nums = [4, 2, 3, 1, -6, 2];
const sum = nums.reduce((acc, num) => {
    return acc + num;
}, 10);

const max = nums.reduce((max, num) => {
    return num > max ? num : max;
});

console.log(`The sum of the nums array is ${sum}`);
console.log(`The max of the nums array is ${max}`);