/**
 * Before 2015, there was no support for the standard Java class syntax, HOWEVER
 * OOP support was still present in the language through something known as prototypal inheritance
 * 
 * In JS, there's no such thing as a class marker, just functions that happen to be constructors for objects
 */

function Dog() {
    console.log('Hello World!');
}

let ret = Dog(); // This does not return anything, it is simply a normal function call
console.log(`Value returned when calling Dog normally: ${ret}`);

// Instead of simply calling the function, we will invoke it using the new keyword
ret = new Dog();
console.log(`Value returned when calling Dog with new: ${ret}`);

// We can add parameters to the Shape function as we would pass parameters to our constructors
function Shape(color) {
    // Using this binds the value to the object being created
    this.color = color;
}

let redShape = new Shape('red');
console.log('New Shape:', redShape);

// I can add/remove/modify properties from this instance
redShape.color = 'blue';
redShape.name = 'Polly';
console.log(redShape);

// Remove the property name off of the redShape object using delete keyword
delete redShape.name;
delete redShape.color;
console.log('redShape after deleting name:', redShape);

/**
 * JavaScript does not use the classical form of inheritance, instead, it uses prototypal inheritance
 * 
 * In JS, functions have prototypes and objects have prototypes
 * 
 * Function Prototype:
 * - Known as prototype and is referenced by referencing the constructor function's prototype property
 * - Shape.prototype
 * - Any method/instance field on the function's prototype you can think of as a non-static property of the object
 * - Official Definition:
 *   - Prototype belongs to the function and represents the prototype that will be inherited by ANY object
 *     that is created using the function as its constructor
 * 
 * Object Prototype:
 * - Known as __proto__ ([[Prototype]] in the web browser)
 * - myObj.__proto__
 * - Official Definition:
 *   - __proto__ is added to all objects that are created using new, and points to the constructor function
 *     it was created with's prototype property
 * 
 */

const shape = new Shape();
console.log(shape); // has a propert of color that is undefined since I called the constructor with no params
console.log(Shape.prototype === shape.__proto__); // true because shape.__proto__ IS Shape.prototype

// constructor function
function Cat(name, breed) {
    this.name = name;
    this.breed = breed;
}

// I can add things to the prototype whenever I want
Cat.prototype.speak = function() {
    // I can refer to this inside methods on the prototype
    // 'this' refers to the object that we're calling the function with
    console.log(`Meow! (My name is ${this.name})`);   
}

const cat = new Cat('Tom', 'Tabby');
cat.speak = function() {
    console.log('Inside cat\s speak method!');
}

cat.speak(); // cat object has the speak property since it inherits it from Cat.prototype

/**
 * new keyword:
 * 1. Creates a brand new JavaScript object {}
 * 2. Adds the __proto__ property to the object that points to the current constructor function's prototype
 * 3. Binds all references of 'this' in the function to the newly created object
 * 4. Returns the newly created object, 'this' if nothing else is returned
 */
