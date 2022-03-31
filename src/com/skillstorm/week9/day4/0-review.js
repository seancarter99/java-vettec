/**
 * prototype - Belongs to the constructor function and it is the properties to be inherited
 * 
 * __proto__ - Belongs to the object created by the constructor function and it is a pointer to the function's prototype
 */

function Dog() {

}



const dog = new Dog(); // __proto__ -> Dog.prototype


/**
 * The check for legs property goes like this:
 * 
 * 1. Does the current dog object have a property called legs? (If so, use that skip the other steps)
 * 2. If not, check the dog.__proto__ property for a property called legs (If found, use that and skip the rest)
 * 3. If still not there, continue step 2 recursively until the __proto__ property is null
 * 4. If null is found, return undefined
 */

// dog.legs = 3;

// Dog.prototype.legs = 4;

Object.prototype.legs = 5; // I can add properties to object so that all things inherit it

console.log(`Number of legs on dog: ${dog.legs}`);

function Shape() {

}

Shape.prototype.Square = function() {

}

Shape.prototype.Square.prototype.hello = 'world';

const shape = new Shape();

const square = new shape.Square();

console.log(square.__proto__ === Shape.prototype.Square.prototype);
console.log(Shape.prototype.Square.prototype.__proto__ === Object.prototype);

console.log(Shape.prototype);
console.log(Shape.prototype.Square.prototype);

// class Car {
//     #engine;

//     constructor(engine) {
//         this.#engine = engine;
//     }

//     get engine() {
//         return this.#engine;
//     }
// }

// class Engine {
//     name;

//     constructor(name) {
//         this.name = name;
//     }
// }

function Car(engine) {
    this.engine = engine;
}

function Engine(type) {
    this.type = type;
}

const engine = new Engine('6 Cylinder');

const car = new Car(engine);

console.log(car.engine);