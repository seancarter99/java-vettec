class Person {
    #firstName;
    #lastName;
    #age;
    
    constructor(firstName, lastName, age) {
        this.#firstName = firstName;
        this.#lastName = lastName;
        this.#age = age;
    }

    set lastName(lastName) {
        if ( (typeof lastName) !== 'string') {
            throw new Error('Last Name must be a string'); // Gives us more control over the data we allow
        }
        this.#lastName = lastName;
    }

    get fullName() {
        return `${this.#firstName} ${this.#lastName}`;
    }
}

/**
 * 1. Creates a brand new object
 * 2. Sets that object's __proto__ value to be Person's prototype property
 * 3. Changes all references of 'this' to refer to the newly created object
 * 4. Returns 'this'
 */
const abe = new Person('Abe', 'Lincoln', 56);

console.log(abe.fullName);

// abe.lastName = 3423214;
console.log(abe.fullName);


/**
 * In JS there are two types of prototypes:
 * 
 * 1. Function prototype
 * - Indicated by the prototype property
 * - It is the prototype that will be inherited by all inheriting objects
 * 
 * 2. Object prototype
 * - Indicated by the __proto__ property
 * - It is a pointer to the prototype property that it inherits from
 */

// abe <- Person <- Object

console.log(abe.__proto__ ===  Person.prototype);
console.log(Person.prototype.__proto__ === Object.prototype);