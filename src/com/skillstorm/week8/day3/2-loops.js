
// While loops
let i = 0;
while (i < 5) {
    console.log(i);
    i++;
}

// For loops
for (let i = 0; i < 10; i++) {
    console.log(`Hello for loop: ${i * 100}`);
}

// Do While loops
do {
    console.log('This loop always runs at least once!');
} while (false);

while (false) {
    console.log('This never runs!');
}

let artists = ['Picasso', 'Leonardo DaVinci', 'Donatello', 'Michaelangelo', 'Raphael'];

// For each loop in java
// for (String artist : artists) {
//     console.log(artist);
// }

/**
 * For in loop
 * - Iterates over enumerable properties
 * - Enumerables don't have to have a specific order to them
 * - Objects (HashMaps) do NOT have a specific order, but we can enumerate over all the properties
 * 
 * For of loop
 * - Iterates over iterable properties
 * - The order must be known so that we can iterate over it one item after the next
 * 
 * Iterables:
 * - Array
 * - Iterators
 * 
 * Enumerables:
 * - Indices
 * - Objects
 */

// For of iterates over the iterable values (actual artists)
for (artist of artists) {
    console.log(artist);
}

// For in iterates over the enumerables (the indices of an array)
for (index in artists) {
    console.log(index);
}

const school = {
    name: 'Lincoln High School',
    numStudents: 561,
    mascot: 'Bobcats',
    principal: 'Abrham Lincoln'
};

// We can use loops to iterate over objects too

for (key in school) {
    // We can use the keys to dynamically access the value associated with them
    // console.log(key);

    // console.log(school.key); // This doesn't work since we're trying to access a property called key
                                // not the value of the variable key

    // We can use bracket notation to get our values dynamically
    console.log(`Key: ${key}\nValue: ${ school[key] }\n`); // \n is a newline character
}

// This throws an error since objects are NOT iterable
// for (key of school) {
//     console.log(key);
// }

let str = 'Sean\'s Classroom'; // Use the escape character to avoid the ' collisions

// I can also use for of loops to iterate over our strings
for (let char of str) {
    console.log(char);
}

// For in loop for a string works the same as arrays
// Works by enumerating over the indices of our array
for (let index in str) {
    console.log(index);
} 