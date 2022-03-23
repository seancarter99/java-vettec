/**
 * Objects in JavaScript are a bit more lightweight than they are in Java
 * 
 * They are created using the {}
 * 
 * Think of these as a HashMap of sorts
 * 
 * We add a key and a value for that key
 * 
 * The syntax is:
 * {
 *  key: value,
 *  key: value
 * }
 */

const person = {
    name: 'Gary', 
    age: 32,
    isBlonde: false
};

// Prints the entire person object
console.log(person);

// I can print individual properties of a person using the . operator
console.log(person.name);
console.log(person.age);

// What if I print a property that isn't on the person?
console.log(person.sister); // undefined since the person object does not have a property of 'sister'

// const DOES prevent me from doing something like this
// const = {};

// const does NOT prevent me from changing properties of an object
person.age = 33;

console.log(`Person's age after changing: ${person.age}`);

// Add a property to person object of 'sister'
person.sister = 'Mary';
console.log('Person\'s new sister:', person.sister);


// I want an object to store student data


const student = {
    name: {
        first: 'John',
        last: 'Doe'
    },
    age: 21,
    classes: ['Calculus', 'Computer Science', 'History', 'Geography']
};

console.log(student);

// Print the student's first name
console.log(student.name.first);
