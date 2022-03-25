// Function scope
function doSomething() {
    var a = 'alpha';
    if (false) {
        var x = 10;
        
    }
    x = 5;
    firstName = "Joe";
    lastName = "Jerry";
    console.log(x);
    console.log(firstName);
    console.log(lastName);
    console.log(fruit);



    if (true) {
        if (true) {
            if (2 == 2) {
                if (false) {
                    // var is hoisted all the way to the top of the function
                    // regardless of how many if blocks deep it is
                    var firstName;
                    var lastName;
                }
            }
        }
    }

    for (let i = 0; i < 10; i++) {
        var fruit = 'Starfruit'; // Also gets hoisted to the top of the function
    }
}

function doAnotherThing() {
    console.log(a); // can't reference a since a was defined in another function and var is function scoped
}

doSomething();

// Objects

// const prevents variable reassignment

const person = {
    name: 'John',
    age: 56,
    isBlonde: false
}; // This is the first and only assignment

person.age = 43; // I'm not changing person, just the age property ON person
person.gender = 'Male';