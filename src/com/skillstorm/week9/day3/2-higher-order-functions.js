/**
 * A higher order function is a function either takes a function as an argument/parameter OR
 * a function that returns another function
 * 
 * Working in tandem with HOF's are closures and callbacks
 * 
 * A closure is when an inner function maintains the references to the variables and properties defined in
 * the outer function
 * 
 * A callback is a function passed to another function that will be executed at a later point in time
 */

// HOF example
function performActionOnArray(arr, action) {
    // Java equivalent of for (String item : arr)
    let newArr = [];
    for (item of arr) {
        newArr.push(action(item)); // works the same as map
    }
    return newArr;
}

const alteredNums = performActionOnArray([1, 2, 3], (num) => num * 2);
console.log(alteredNums);

// Callback example

// Creates a variable called sayHello and gives it the value of the arrow function
// Essentially, this creates a function called sayHello
const sayHello = () => {
    console.log('Hello!');
}

setTimeout(sayHello, 3000);


let black;

let pink = {
    color: 'pink',
    next: black
}
let green = {
    color: 'green',
    next: pink
}
let blue = {
    color: 'blue',
    next: green
}
black = {
    color: 'black',
    next: blue
}

let currColor = black;

const toggleColor = () => {
    currColor = currColor.next;
    document.getElementById('header').style.backgroundColor = currColor;
    // One liner version
    // document.getElementById('header').style.backgroundColor = currColor === 'Black' ? 'Blue' : 'Black';
}

// setInterval(toggleColor, 5000);


// Closure example

function createCounter(initialCount) {
    // count is going to represent the current count of my counter
    // count uses closures to keep track of the interal count
    let count = typeof initialCount === 'number' ? initialCount : 0;
    
    const increment = () => {
        count++;
    }
    
    const decrement = () => {
        count--;
    }

    const getCount = () => count;

    function setCount(newCount) {
        count = isNumber(newCount) ? newCount : count;
    }

    // Since this wasn't returned, it is essentially "private"
    const isNumber = number => typeof number === 'number';

    // Everything returned on this object are properties we're allowing the user to use
    return {
        increment,
        decrement,
        getCount,
        setCount
    };
}

createCounter(2); // 2
createCounter(''); // 0
createCounter('2'); // 0
createCounter([1, 2, 3]); // 0

const counter = createCounter(20);
console.log(counter.getCount());
counter.increment();
console.log(counter.getCount());

counter.decrement();
counter.decrement();
console.log(counter.getCount());

counter.setCount(234);
console.log(counter.getCount());

// I can have multiple counters
const counter1 = createCounter();
const counter2 = createCounter();
const counter3 = createCounter(10);

console.log(counter2.getCount());


// Juh's Question
function buttonClick() {
    if (counter1.getCount() >= 10) {
        /**
         * Create a XMLHttpRequest to redirect the user to another page
         * 
         */
        const xhr = new XMLHttpRequest();

        xhr.open('GET', 'https://www.google.com');
        xhr.send();
    }
}

const button = document.createElement('button');
button.counter = createCounter(10);
button.addEventListener('click', function() {
    button.counter.increment();
    button.innerText = button.counter.getCount();
});