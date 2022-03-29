// Closures

/**
 * When an inner function has access to the surrounding state of the outer function (lexical environment)
 */

function outer(x, y, z) {
    // let x = 10;
    // let y = 20;
    // let z = 30;

    return function() {
        console.log(`x: ${x}`);
        console.log(`y: ${y}`);
        console.log(`z: ${z}`);
    }
}

const inner = outer(10, 20, 30);

inner();
inner();
inner();

const inner2 = outer(1, 2, 3);
inner2();
inner(); // Doesn't change the original values for inner()