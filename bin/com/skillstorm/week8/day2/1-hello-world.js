/**
 * History of JavaScript:
 * - JavaScript was written in 1995 by Brendan Eich
 * - Famously made in 10 days
 * - Originally called Mocha, but renamed to JavaScript to piggy back of Java's success
 * - Made specifically for the web browser
 * - Possesses Java-like syntax and is a "scripting version of Java"
 * - It was made to be both an OOP and functional language
 * - JavaScript is NOT a strongly typed language
 */

// Java is to JavaScript as a "car" is to a "carpet"

console.log('Hello World!');

// Create a function
// JS functions are defined with the function keyword and do NOT specify a return type
function helloWorld() {
    console.log('Hello World inside function!');
}

helloWorld();
helloWorld();

// Create a function with parameters
function helloName(name) {
    // console.log('Hello ' + name); // Unnessecary concatenation with +
    console.log('Hello', name);

    // Template string
    // Template literal
    // Must be used in a string using the `` backticks
    console.log(`Hello ${name}. How are you today?`);
}

helloName('Sean');
helloName('Mike');
helloName(); // helloName(undefined);