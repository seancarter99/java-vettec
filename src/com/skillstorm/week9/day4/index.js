setTimeout(() => console.log('1'), 0); // This goes last due to not having priority

Promise.resolve().then(() => console.log('2')); // Promises get priority in the event queue

console.log('3'); // Not part of the event queue, so it goes first