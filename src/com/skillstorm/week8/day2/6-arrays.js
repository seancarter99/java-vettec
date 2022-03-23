/**
 * Arrays in JavaScript are slightly different from Arrays in Java
 * 
 * JS Arrays:
 * - They behave more like ArrayLists
 * - No fixed size
 * - Come with more out of the box methods on them
 * - push, pop, shift, splice, slice, indexOf
 * - Support functional paradigms with map, forEach, reduce, filter
 * - There is no uniform type for our arrays (does not have to be homogenous in terms of type)
 */

// Define an array
let fruits = ['Apple', 'Banana', 'Pear', 'Plum', 'Mango'];

// Pop removes and returns the element at the back of the array
console.log('Fruit at the back of the array:', fruits.pop());
console.log(fruits);

// Push adds an element to the end of an array
fruits.push('Peach');
console.log(fruits);

// Shift can be used to remove and return the value from the front of an array
console.log('Fruit at the front of the array:', fruits.shift());
console.log(fruits);

// Unshift adds an element to the front of the array
fruits.unshift('Avocado');
console.log(fruits);

// Reading from an array

// Read the 2nd element from an array
console.log(fruits[1]);

// We can also get the index of a specific value using indexOf
let index = fruits.indexOf('Plum');
console.log(index);
console.log(`Value at index ${index} is ${fruits[index]}`);

// Removing an element at a specific index

// splice(index to start at, number of elements to remove starting at index)
let plum = fruits.splice(index, 1);
console.log('Removed values: ', plum);
console.log(fruits);

fruits.splice(0, 1); // removes first element of array
console.log(fruits);

// Slice creates a copy of an array
// They are not the same location in memory, they just have the same values
// I can change the clone without changing the original
let fruitClone = fruits.slice();
// fruitClone = fruits; // This would change the fruitClone and fruits to be the EXACT same array
fruitClone.pop();
fruitClone.pop();

console.log('The value of fruitClone is:', fruitClone);
console.log('The value of the orginal fruits array is:', fruits);