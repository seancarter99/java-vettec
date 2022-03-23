console.log('Top of file values of fName and x:', fName, x);

/**
 * Global Scope - Accessible anywhere in the file
 * Function Scope - Accessible anywhere within a function
 * Block Scope - Accessible anywhere within a code block {}
 */

// Global Scoped Variable
var x; // Variable declaration
x = 5; // Variable Initialization

console.log('The value of x is:', x);

var x = 10; // var allows for redeclaration

console.log('The value of x is now:', x);

function changeX() {
    // Function scoped x
    // Does not share a value with the global x
    var x = 'xylophone';
    console.log('"Changed" the value of x to:', x);
}

changeX();

console.log(x);

/**
 * Var Cons:
 *
 * Variables defined with var have their references "hoisted" to the top of a scope (global/function)
 *  
 * 1. Being function scoped leads to very weird interactions. Block scoped is typically preferred
 * 2. Being able to redeclare the same variable is not allowed in other languages and can lead to you
 *    overwriting a previous value of some variable
 */

// Hoisting example

console.log(fName);
var fName = 'Sean';

/**
 * Alternatives to var
 * 
 * In general, in 2022, you shouldn't ever use var. Instead, prefer let and const
 * 
 * let
 * - let is similar to var in that I can redefine variables with new values
 * - It is block scoped, not function scoped
 * - I can NOT redeclare a let variable (let x = 5; let x = 10;)
 * 
 * const
 * - const is the same as let, however, once the variable has been assigned a value, it cannot be reassigned
 * - Same as final in Java
 */

let a = 'a';
// let a = 'alpha'; // Not allowed
a = 'alpha'; // This is the proper way

/**
 * How it's done in Java
 * 
 * int x = 5;
 * x = 10;
 * 
 * // We CANNOT do
 * int x = 5;
 * int x = 10;
 */

const b = 'b';
// const b = 'beta'; // Doesn't work the same as let
// b = 'beta'; // Cannot reassign b due to const

function variableHoisting() {
    // Function scope in action
    if (false) {
        var firstName = 'Joe';
        let lastName = 'Allen';
    }
    console.log('The value of firstName is:', firstName);
    console.log('Pulling the value of b from the global scope:', b);
    // console.log('The value of lastName is:', lastName); // Throws an error due to let's block scoping
}

variableHoisting();

/**
 * Var can be global or function scoped
 * Let can be global or block scoped
 * Const can be global or block scoped
 */