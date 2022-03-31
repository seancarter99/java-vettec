// Callbacks are the old school way of handling ansynchronous code in JS

// Instead of twiddling our thumbs waiting for a request that we sent off to comeback, we do other things
// and await for a specific event to occur before coming back to handle it

// We do this in the form of a callback

// setTimeout utilizes a callback function to come back after a given period of time
setTimeout(() => console.log('Hello World'), 0);

console.log('Doing other things while waiting'); // Prints before Hello World

console.log(5 / 0);

/**
 * Hypothetical Example:
 * 
 * We want to request some data from a web server to load up onto our page
 * 
 * 1. We must make the request to the web server
 * 2. We must wait for the response from the web server with our data
 * 3a. If it's a successful response (we got our data), parse the data and display to the page
 * 3b. If it was not successful, display an error message to the user
 * 4. With the successful data, create a button element with a click event that sends the data to another server
 * 5. Wait for this to finish
 * 6a. If successful, display success on the screen since the data was saved
 * 6b. If unsuccesful, display an error message on the screen
 */


// To simulate the wait time (latency) of a request to a webserver, I will use setTimeout

function fetchData() {
    return [{name: 'Sam', age: 26}, {name: 'Sydney', age: 37}, {name: 'Joe', age: 14}];
}

function displayData(data) {
    for (datum of data) {
        const personRow = document.createElement('tr');
        const nameCol = document.createElement('td');
        const ageCol = document.createElement('td');

        nameCol.innerText = datum.name;
        ageCol.innerText = datum.age;

        personRow.appendChild(nameCol);
        personRow.appendChild(ageCol);

        document.getElementById('person-table').appendChild(personRow);
    }
}

function didSave() {
    return true;
}

// Callback pyramid of doom
// Callback hell
setTimeout(() => {
    const data = fetchData();
    if (data) {
        displayData(data);
        const button = document.createElement('button');
        button.addEventListener('click', () => {
            setTimeout(() => {
                let success = didSave();
                if (success) {
                    document.getElementById('main').innerText = 'Data saved successfully!';
                }
                else {
                    document.getElementById('main').innerText = 'An error has occured. Unable to save data.';
                }
            }, 5000);
        });
    } else {
        document.getElementById('main').innerText = 'An error has occured. Unable to fetch data.';
    }
}, 3000);