export {};

/**
 * TypeScript is a super set of JavaScript
 * 
 * Any valid JavaScript file IS a valid TypeScript file
 * Useful for the coding phase of a project due to the strict rules you must follow
 * 
 * Throws type errors at compile time NOT runtime
 * 
 * This is useful, because with plain JS we catch all of our bugs at runtime not compile time
 */

/**
 * Data Types:
 * - boolean
 * - number
 * - string
 * - null
 * - undefined
 * - BigInt
 * - symbol
 * - object
 * - array
 * - tuple [string, number]
 * - enums
 * - unknown
 * - any
 * - void
 */

const l = 1;

let one = 1; // Assigns the value of 1 to my variable called 1 AND assigns the type of number to one
one = 2;

// If I'd like, I can ignore what type a variable should by assinging any as the type
let wildcard: any = 2;
wildcard = 'a';
wildcard = null;
wildcard = [null, 1, 2];

// Using any in TypeScript is discouraged, because you're losing the benefits of TypeScript with it

// Union types
// If I want a variable to hold either a boolean OR a string, I can use union types
let num: string | boolean = '2';

// Define a function with types

function plainOldFunction(x: number, y: number): number {
    return x + y
}

// num = plainOldFunction(2, 3); // Won't work due to us returning a number
plainOldFunction(1, 2);


// I can use 
// y?: number
// y: number = 3
// y: number | undefined // Same as y?: number
function optionalParameters(x: number, y: number = 3): number {
    return x + y;
}

optionalParameters(2);

// Tuples are just arrays, but they're a handy way to return 2 different entities
const createTuple = (): [string, number] => {
    return ['a', 2];
}

const [letter, num2] = createTuple();

console.log(letter, num2);

// TypeScript Arrays
const numbers: (number | string)[] = [1, 2, 3]; // I know my array will only have numbers in it
const fruits: Array<string | number> = ['Apple', 'Mango', 2];

// Interfaces
// Interfaces are GREAT at defining properties for JS objects

interface Vehicle {
    make: string;
    model: string;
    year: number | string;
    numberOfCupholders?: number | string;
}

const pinto: Vehicle = {
    make: 'Ford',
    model: 'Pinto',
    year: 1971,
    numberOfCupholders: 0
}

// I can extend interfaces just like I can in Java
interface OwnedVehicle extends Vehicle {
    owner: string;
}

const richardsPinto: OwnedVehicle = {
    make: 'Ford',
    model: 'Pinto',
    year: 1971,
    numberOfCupholders: 0,
    owner: 'Richard'
}

class Pinto implements Vehicle {
    make: string;
    model: string;
    year: number | string;
    numberOfCupholders?: string | number | undefined;

    constructor(make: string, model: string, year: number | string) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
}

