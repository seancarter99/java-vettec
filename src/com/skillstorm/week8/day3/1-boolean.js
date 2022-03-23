// if statements
// Exact same as Java

if (true) {
    console.log('This code runs!');
}

if (false) {
    console.log('This code never runs!');
}

if (2 * 9 == 18) {
    console.log('2 times 9 DOES equal 18');
}

// == vs ===

/**
 * ==
 * Equality operator
 * Compares the values of an object with one another to determine equality
 * 
 * To compare objects of different types, JS implicitly coerces one value to the other
 */

if (2 == '2') {
    console.log('2 and \'2\' are equal!');
}

if (3 != false) {
    console.log('3 and false are not equal');
}

/**
 * To remove the unexpected behavior from ==, === was added
 * 
 * ===
 * Strict Equality Operator
 * 
 * To determine equality, it takes both the type AND the value into consideration
 */

// === does an additional step first of:
// typeof 2 == typeof '2'
// 'number' == 'string'

if (2 === '2') {
    console.log(`2 and '2' are equal!`);
} else {
    console.log("2 and '2' are NOT equal using ===!");
}

// Using Not Strict Equals
if (true !== '1') {
    console.log("true and '1' are NOT equal");
}

// I recommend to only ever use ===
// The only scenario to use == is comparing null and undefined

let x = undefined;
// This if statement protects me against null AND undefined values
if (x == null) {
    console.log('X is null!');
}

if (10) {
    console.log('10 is true!');
}

if (0) {
    console.log('0 is true!');
} else {
    console.log('0 is false!');
}
/**
 * Truthy and Falsy values
 * 
 * Falsy values:
 * - false
 * - 0
 * - ''
 * - -0
 * - 0.0
 * - null
 * - undefined
 * - NaN
 * 
 * Truthy values:
 * - true
 * - {}
 * - []
 * - 42
 * - '0'
 * - 'false'
 */

let zero = Number('0'); // You can use Number(), Boolean(), String(), etc, to explicitly cast
console.log(typeof zero);
console.log(typeof '0');

/**
 * Casting a value a boolean
 * 
 * 1. Using Boolean(value)
 * 
 * 2. !!value
 *    - We use the first ! to cast value into a boolean (specifically its inverse)
 *    - We use the second ! to invert back to its logical boolean value (if truthy then true, if falsy then false)
 */

console.log(Boolean(0));
console.log(!!0);

const obj = {
    name: 'Mary'
};

// If the left side is false, JS does not evaluate the right hand side since there's no point.
// Since the left is false, there's no way to satisfy the &&
if (obj != null && obj.name === 'Mary') {

}

let someString = '';

// Assign firstName with 'John' if someString is falsy, otherwise, assign it with the value of someString
let firstName = (someString || 'John');

console.log(firstName);

// Assign lastName with 'Doe' if someString is truthy, otherwise, assign it with the value of someString
let lastName = someString && 'Doe';
console.log(lastName);


function helloName(name) {
    name = name || 'John';
    console.log(`Hello ${name}`);
}

helloName('John');
helloName('Sean');
helloName();
helloName(false);
helloName(null);

function printArray(arr) {
    arr = arr || []; // if the arr provided is falsy, use an empty array instead
    for (let i = 0; i < arr.length; i++) {
        console.log(arr[i]);
    }
}

printArray([1, 2, 3]);
printArray();
printArray(null);
printArray(0);

// Using || and && for assignment is similar to a ternary operator

let personsName = 0 || 'John';
// Cast num to a boolean, if it's true, return num, if it's false, return 'John'
let num = 0;
personsName = ( Boolean(num) ) ? num : 'John';