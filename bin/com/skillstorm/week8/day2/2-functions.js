// Function overloading

/**
 * In JavaScript, there is no such thing as function overloading
 * 
 * We can "overload" (not actually overloading) by adding default values for our parameters
 */

// X is the value value passed in
// Y is the value passed in, or, if nothing is passed in, y takes on the value of x
function calcSum(x=0, y=x) {
    return x + y;
}

function calcArea(length, width=length) {
    return length * width;
}

console.log(calcSum(2, 3)); // x=2, y=3
console.log(calcSum(2)); // x=2, y=2
console.log(calcSum()); // x=0, y=0
console.log(calcSum(undefined, 5)); // x=0, y=5