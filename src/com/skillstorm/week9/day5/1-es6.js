/**
 * 2015 was an important year for JavaScript, as the tech world started rolling out consistent, annual 
 * improvements to the JavaScript language
 * 
 * 2015 was the release of ECMAScript6 AKA ES6
 * The previous release was in 2009 for ES5
 * 
 * Before that, ES4, there were a lot of proposed changes such as adding classes to JavaScript, but those got
 * pulled due to Microsoft saying no
 */

// I'll show off 2015+ syntax

// Spread operator ...

let person = {
    name: 'John',
    age: 42,
    favColor: 'red'
}

// This makes expandedPerson and person the exact same data in memory
// const expandedPerson = person;
// expandedPerson.favBook = 'Brave New World';
// expandedPerson.favFood = 'Lasagna';

// I can use the spread object to "spread" the contents of the old person object into a new object
// Allows me to easily create a copy of the person object. Not the same point in memory
const expandedPerson = {...person, favBook: 'Brave New World', favFood: 'Lasagna'};

console.log(expandedPerson);
console.log(person);

// I can use spread to fan out a string
const str = 'Hello World!';

// Creates an empty array, then spreads the string contents into the array
const strArr = [...str];

console.log(strArr);

// Rest operator ...
// Same syntax as spread, but it does opposite. It condenses values into one spot

// Everything beyond the first three parameters gets added to the array
// As such, there should only be one rest operator per function parameter list AND it should be at the end
// This allows me to have a function with infinite number of parameters
function rest(a, b, c, ...others) {
    console.log('a', a);
    console.log('b', b);
    console.log('c', c);
    console.log('Others:', others); // Everything else gets stuffed into this array
}

function order(name, age, address, ...orderDetails) {}

order('Bob', 33, '', 'coke', '18in pizza', 'cheesesticks');
rest(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);

// Object destructuring
const obj = {
    letter: 'a',
    number: 2,
    arr: [1, 2, 3]
}

// Destructure the object and pull out letter and arr from the object
// This is nice when you only want to use certain fields from an object and want 
// to avoid using obj.property everywhere
const { letter, arr } = obj; // defines two const variables: letter and arr

/**
 * Equivalent
 * const letter = obj.letter;
 * const arr = obj.arr;
 */

console.log(letter, arr);

// I can also pair object destructuring with a function
// If an object is passed at that spot in the parameter list, we will destructure it and pull out properties
// of that object

// The order of the destructured arguments does not matter
// Renames favColor to color in the function
const printProperties = ({favColor: color, favFood, name, empty}) => {
    console.log('Name:', name);
    console.log('Favorite Color:', color);
    console.log('Favorite Food:', favFood);
    console.log(empty); // Properties that aren't on the object are undefined
}

/**
 * public static void printProperties(Person person) {
 *     System.out.prinln("Name: " + person.getName());
 *     System.out.prinln("Favorite Color: " + person.getFavoriteColor());
 *     System.out.prinln("Favorite Food: " + person.getFavoriteFood());
 * }
 */

printProperties(expandedPerson);

// Array Destructuring
const getArray = () => {
    return [1, 2, 3];
}

const array = getArray(); // Normal behavior
console.log(array);

// If I only want the first two elements of the array I can use array destructuring

// d is undefined because it was out of bounds
const [a, b, c, d] = getArray();

console.log(a, b);

console.log(c);

console.log(d);

// I want to get a new array of just the array minus the first element
const [one, ...restOfArray] = getArray();

console.log(one);
console.log(restOfArray);

const {name, age, ...restOfProps} = expandedPerson;
console.log(name);
console.log(age);
console.log(restOfProps); // The rest of the properties that I didn't ask for by name

const fruits = ['Apple', 'Orange', 'Lemon', 'Blueberry', 'Cherry', 'Strawberry', 'Canteloupe'];

// The commas indicate to JS to skip the first two elements
const [oneFruit, twoFruit ,thirdFruit, ...restOfFruits] = fruits;

restOfFruits.unshift(twoFruit);
restOfFruits.unshift(oneFruit);
console.log(thirdFruit);
console.log(restOfFruits);

console.log('Original fruits array:', fruits);

const fruitsCopy = fruits.slice();
fruitsCopy.splice(fruits.indexOf('Lemon'), 1);
console.log(fruitsCopy);
console.log(fruits);