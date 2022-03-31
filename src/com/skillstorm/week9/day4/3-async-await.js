/**
 * Async/Await was added to JavaScript to further expand on Promises and make them even more readable
 * 
 * The problem with promises is that the .then/.catch chaining got a little hard to read in complex scenarios
 * 
 * With async/await, we can write our asynchronous code like we normally would with synchronous code
 * 
 * Async/Await was added in ES7
 */

// Synchronous -> Line by line (Java)
// Asynchronous -> Callback at a later point in time (using event loop) (JavaScript)

/**
 * In order to create an asynchronous function, we need to add the async keyword to it
 * 
 * Async functions return promises
 */

async function myAsyncFunction() {
    return 'Hello Async!'; // Wraps 'Hello Async!' into a fulfilled Promise
}

const myPromise = myAsyncFunction();

// We can unwrap it using .then for handling promises
// myPromise.then(data => console.log(data));

// I can also unwrap the promises using the await keyword

// The await keyword can only be used inside of an async function
const workWithPromise = async () => {
    const data = await myAsyncFunction(); // Only assigns the value to data once the promise returned becomes fulfilled
    // None of this code occurs until the Promise is resolved
    const data2 = await myAsyncFunction();
    console.log(data);
    console.log(data2);
}

// workWithPromise();

const validateNumber = async (num, msg) => {
    if (num < 0) {
        // return Promise.reject('Number cannot be less than 0!');
        throw 'Number cannot be less than 0!'; // Returns a rejected Promise with the thrown data
    }
    return msg;
}

// Async functions can only call other async functions
const asyncWithTryCatch = async () => {
    try {
        const data1 = await validateNumber(2, 'Hello!');
        console.log(data1);
        const data2 = await validateNumber(-2, 'Goodbye!');
        console.log(data2);
    } catch (err) { // Handles all rejected Promises
        console.log('ERROR THROWN: INSIDE CATCH BLOCK');
        console.log(err);
    }
}

asyncWithTryCatch();