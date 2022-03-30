// In JS there are a few different ways to assign functions

// Comparable to Java
function function1() {

}

// function2 is a variable that houses the anonymous function
const function2 = function() {

}

// We can also pass functions inline
const arr = [1, 2, 3];
arr.forEach(function(num) {
    console.log(num);
});

console.log('------------------');
// We can also pass arrow functions inline
// Arrow functions came out in ES6 (2015)
arr.forEach((num) => console.log(num * 2));

// This is the preferred way today

const function4 = () => console.log('Hello World!');

function4();

// 'this' refers to a different context when used in an arrow vs a function function
console.log('-------------------');
function Turtle() {
    console.log(this);
}

// Turtle(); // Called without new, 'this' refers to Object
// new Turtle(); // Called with new, 'this' refers to the Turtle object being created

const Frog = () => {
    console.log(this); // This 'this' refers to the outer scope version of 'this'
}

Frog();
// new Frog(); // This one throws an error since arrow functions cannot be constructor functions

console.log(this); // Same thing as the 'this' in the arrow function

// If you're aim is to use 'this' inside a function, use the function keyword to define the function

function Dog(name) {
    this.name = name;

    this.sayName = () => {
        console.log(`My name is ${this.name}`);
    }
}

Dog.prototype.bark = function() {
    console.log(`My name is ${this.name}`);
}

Dog.prototype.barkArrow = () => {
    console.log(`My name is ${this.name}`); // This one does not work as intended
    // Instead, it uses the 'this' of the global field
}

const dog = new Dog('Spot');
dog.bark();
dog.barkArrow(); // Prints undefined

const Cat = Dog;
new Cat();

newArr = arr.map((num) => num * 10);

console.log(newArr);

console.log(dog);
console.log(dog.__proto__);

console.log(Object.prototype.__proto__); // End of the line for the prototype chain

console.log(dog.__proto__.hasOwnProperty('bark'));







// Use let whenever you want to constantly change the value of a variable
// Examples: max of an array, i in a loop, current selected HTML element, etc.

// Use const whenever the value is set in stone and will never be reassigned to a different value
// Examples: an array representing a car lot

let max = 0;
const nums = [5, 2, 3, 6, 1, 5, 6, 8, 2, 4];

for (let i = 0; i < nums.length; i++) {
    if (max < nums[i]) {
        max = nums[i];
    }
}

console.log(max);

// nums = [5, 2, 3, 6, 1, 5, 6, 8, 2]; // Not allowed because nums is const