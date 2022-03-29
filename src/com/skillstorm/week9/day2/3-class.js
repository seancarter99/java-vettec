/**
 * In 2015, EcmaScript 6 was released and with it, a whole host of changes were added to the JavaScript language
 * 
 * Among these was the beloved class syntax
 * 
 * Important to note:
 * - Classes in JavaScript are just "syntactic sugar" for constructor functions
 * - As such, I still can use prototype and __proto__ on class objects
 * - Classes are just constructor functions "under the hood"
 */

// Defines a class called bird
class Bird {

    // Up here we can define properties of a bird
    // Using # we indicate that this is a private field
    #color;
    wingSpan; // Assign default value to wingSpan

    // Constructor for Bird
    // In JavaScript, we can only have one constructor since overloading doesn't exist
    constructor(color, wingSpan) {
        // If not written, the first line of a constructor is super()
        this.#color = color;
        // this.wingSpan = wingSpan || 20; // This works at preventing falsy values, but prevents me from using 0
        
        // Nullish coallescing operator
        this.wingSpan = wingSpan ?? 20; // Sets the value to 20 if wingSpan is either null or undefined, otherwise wingSpan
    }

    // Method
    sing() {
        console.log('Tweet tweet');
    }

    // Getters/Setters are super easy with classes
    get color() {
        console.log('Inside getter');
        return this.#color;
    }

    set color(color) {
        console.log('Inside setter');
        this.#color = color;
    }

    get hello() {
        return 'Hello';
    }

    // static field
    static feet = 2;

    // static method
    static eat(food) {
        console.log('The bird is eating ' + food);
    }
}

const bird = new Bird('blue');
console.log(bird.wingSpan);

bird.sing();
console.log(bird);

console.log(bird.color); // bird.color calls the getter since I defined one
console.log(bird.hello); // bird.hello calls the getter of hello

// Call setter by setting the value of color
bird.color = 'Red';
console.log(bird.color);

console.log(Bird.feet); // References the static property, feet on Bird
Bird.eat('Worms');
Bird.eat('Pizza'); // Calls the static method

// Inheritance with class syntax
class Raven extends Bird {
    constructor(color, wingSpan) {
        // How do I call Bird's constructor
        super(color, wingSpan); // super calls the parent constructor
    }

    // Overriding sing from Bird
    sing() {
        console.log('Caw caw');
    }
}

const raven = new Raven('Black', 10);
console.log(raven); // color doesn't show up due to it being private
console.log(raven.color); // I can still retrieve it using getter since I found it on the prototype chain

console.log(raven.__proto__ === Raven.prototype); // Still the same since that's how inheritance works in JS
console.log(Raven.prototype.__proto__ === Bird.prototype);
console.log(Bird.prototype.__proto__ === Object.prototype);

// You can use prototypes to add additional functionality to in built JS Objects
// String.prototype.title = function () {
//     // Capitalizes the first letter of the string callled with
// }

const obj = {
    name: 'Joe',
    age: 20,
    gender: 'Male'
};

console.log(obj);
Object.defineProperty(obj, 'name', {enumerable: false});
console.log(obj); // Not visible due to enumerable being false

Object.defineProperty(obj, 'name', {writable: false});
obj.name = 'Gary';
console.log(obj.name); // Still Joe since writable has been set to false

Object.defineProperty(obj, 'name', {configurable: false}); // Sets it in stone
Object.freeze(obj);

obj.spouse = {
    name: 'Mary',
    age: 23,
    gender: 'Female'
}

console.log(obj);