console.log('Hello World!');

let count = 0;
let countdown = 10;
let countdownId;

let counter;
let countdownDiv;

function incrementCount() {
    count++;
    counter.innerText = count;
    // setTimeout(incrementCount, 1000); // This works, but I really should just be using setInterval
}

function decrementCount() {
    console.log('Inside the decrementCount function');
    countdown--;
    countdownDiv.innerText = countdown;

    if (countdown <= 0) {
        // kills the setInterval once countdown <= 0
        clearInterval(countdownId);
        countdownDiv.innerText += '... Happy New Year!';
    }
    
    // This wouldn't work since countdownDiv doesn't have any event listeners. setInterval is independent
    // if (countdown <= 0) {
    //     countdownDiv.removeEventListener();
    // }
}

window.addEventListener('DOMContentLoaded', () => {
    // setInterval
    // setInterval works similarly to setTimeout, but it runs the function every time the provided time elapses
    // If they passed in a function and 5000 ms, the setInterval would call function once every 5 seconds
    // setTimeout(incrementCount, 1000);
    counter = document.getElementById('counter');
    countdownDiv = document.getElementById('countdown');
    
    setInterval(incrementCount, 1000);
    countdownId = setInterval(decrementCount, 1000); // setInterval returns an id that we can use in clearInterval
});