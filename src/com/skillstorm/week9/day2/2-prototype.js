function Dog(name, owner, breed) {
    this.name = name;
    this.owner = owner;
    this.breed = breed;

    // I could add a method in here using this
    // Adds a function to all objects created using new
    // this.toString = function() {
    //     return `[Name= ${this.name}], [Owner= ${this.owner}], [Breed= ${this.breed}]`;
    // }
}

// I prefer adding methods to the Dog function's prototype itself
Dog.prototype.value = 22;

Dog.prototype.toString = function() {
    return `[Name= ${this.name}], [Owner= ${this.owner}], [Breed= ${this.breed}]`;
}

// This is a static function as it belongs to the 'class' itself
Dog.bark = function() {
    console.log('Bark!');
}

Dog.NUM_LEGS = 4;

const dog = new Dog();
const dog2 = new Dog();

dog.__proto__.value = 64;

console.log(dog);
console.log(dog2.value); // Uses Dog.prototype.value since dog2 itself doesn't have a property called value


const str = '';

// Write a brand new method on the String prototype
// This is 'prototype pollution' and is generally frowned upon
String.prototype.helloWorld = function() {
    console.log('Hello World!');
}

str.helloWorld();

const folly = new Dog('Folly', 'Sean', 'Golden Retriever');

// In Java, this would work for a static function, however it would give a warning. In JS, it is simply not allowed
// folly.bark(); 

// Instead, we invoke static function like so
Dog.bark();
console.log(Dog.NUM_LEGS); // Similar to Java's Integer.MAX_VALUE syntax



/**
 * Inheritance via constructor functions
 */

// Step 1: Define another constructor function
function Poodle(name, owner) {
    // Step 2: Call the constructor for Dog and pass it this as a reference
    Dog.call(this, name, owner, 'Poodle');
}

// Step 3: Inherit from Dog by changing Poodle's prototype
Poodle.prototype = Object.create(Dog.prototype); // Creates the __proto__ property on Poodle and links it to Dog
// Similar way to write it
// Poodle.prototype.__proto__ = Dog.prototype; // Also works

// "Optional" in the sense that it seldom matters
// Step 4: Changing the constructor so that objects created
// using Poodle.constructor() are considered instances of Poodle
Poodle.prototype.constructor = Poodle;
Poodle.prototype.value = 30;

console.log(Poodle.prototype.__proto__ === Dog.prototype);

const puddles = new Poodle('Puddles', 'Mary');
console.log(Poodle.prototype);

console.log(puddles.value);

Poodle.prototype.toString = function() {
    return 'Poodle toString()';
}

console.log(puddles.toString());