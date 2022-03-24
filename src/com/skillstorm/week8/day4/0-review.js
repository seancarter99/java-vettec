/**
 * public static int calcSum(int x, int y) {
 *    return x + y;
 * }
 */

// calcSum in JS
function calcSum(x, y) {
    return x + y;
}

// int[] numbers = new int[10];
// int[] numbers = {1, 2, 3, 4, 5};

const numbers = [1, 2, 3, 4, 5];
numbers[0] = 100; // individual numbers are not const, just the variable holding the array
console.log(numbers);

// JS arrays behave more like ArrayList<Object>
numbers.push('apple');
numbers.push(null);
numbers.push(true);
numbers.push(calcSum);
console.log(numbers);
