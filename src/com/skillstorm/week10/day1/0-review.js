/**
 * An object's prototype refers to the prototype of the constructor function it was created with
 * 
 * Object Prototype: __proto__
 * 
 * Function Prototype: prototype
 */

function Food(name, calories) {
    this.name = name;
    this.calories = calories;
}

Food.prototype.toString = function() {
    return `Name=${this.name}, Calories=${this.calories}`;
}

const pizza = new Food('Pizza', 500);

console.log(pizza.__proto__ === Food.prototype); // true

console.log(pizza.__proto__);

console.log(pizza.toString()); // Overriding the toString inherited from Object.prototype

// This works because Food extends Object
console.log(Food.prototype.__proto__ === Object.prototype); // true

class Dairy extends Food {

    constructor(name, calories) {
        super(name, calories);
    }

    isHealthy() {
        return this.calories < 300;
    }

    static group = 'DAIRY';

    static hello() {
        console.log('Hello!');
    }
}

const milk = new Dairy('Milk', 400);

console.log(milk.isHealthy());

console.log(Dairy.group); // Belongs to the class/function
console.log(milk.group) // undefined because it doesn't belong to the object

Dairy.hello(); // Works because hello() belongs to the class/function
// milk.hello(); // Throws an error because I'm calling a function that doesn't exist on the milk object

/////////////////////// HOF /////////////////////////////

/**
 * A higher order function is a function that takes another function as an argument OR returns a function
 */

// Callbacks are functions that are passed to another function as a parameter

function sayHi() {
    console.log('Hi');
}

setTimeout(sayHi, 2000);

// Pseudo Code. Does not work
function mySetTimeOut(callback, waitTime) {
    sleep(waitTime); // Waits this amount of milliseconds
    callback(); // Invokes the function you passed in after
}

const obj = {}; // obj.__proto__ === Object.prototype


// I'm searching for the name property
// 1. I try obj.name
// 2. If that's undefined, I try obj.__proto__.name
// 3. If that's undefined, I try obj.__proto__.__proto__.name
// 4. Keep going until __proto__ is null. Once this occurs, return undefined

obj.name = 'Sean';

class Person {

}

class Juh extends Person {

}

Juh.prototype.toString = function() {
    return 'My name is Juh!';
}

const juh = new Juh();

// juh
// juh.__proto__ -> Juh.prototype
// juh.__proto__.__proto__ -> Person.prototype
// juh.__proto__.__proto__.__proto__ -> Object.prototype
// juh.__proto__.__proto__.__proto__.__proto__ -> null

console.log(juh.toString());

const num = 0;

// Making sure the number is valid, if it is, print Hello World
console.log(num || 'Hello World');

function print(...msg) {
    console.log(msg);
}

print('Hey', 'There', 2);

const myFn = () => {};

const strArr = [...'Hello World'];
console.log(strArr);

Promise.resolve(1)
.then(() => console.log('Success'))
.catch(() => console.log('Error')); 

const obj2 = {name: 'Joe', age: 26, favoriteColor: 'purple'};
for (prop in obj2) {
//   console.log(prop); // Prints the key
  console.log(obj2[prop]); // Prints the value for that key
}

const helloWorld = (msg='Hello World!') => {
    console.log(msg);
}

helloWorld();

class Animal {

    makeNoise() {
        console.log('Animal noises');
    }
}

class Cat extends Animal {
    // The function got rewritten
    makeNoise() {
        // super.makeNoise();
        console.log('Meow');
    }

    makeNoise(name) {
        console.log('Meow and my name is ' + name);
    }
}

// function Cat() { // Constructor function equivalent

//     this.makeNoise = function() {
//         console.log('Meow');
//     }

//     this.makeNoise = function(name) {
//         console.log('Meow and my name is ' + name);
//     }
// }

const cat = new Cat();

cat.makeNoise('Tom');

const myObj = {};

myObj.name = 'Sean';
myObj.name = 'John';

console.log(myObj.name);