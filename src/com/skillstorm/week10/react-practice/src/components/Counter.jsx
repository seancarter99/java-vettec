import { useState, useEffect } from 'react';
/**
 * useState is a "hook"
 * 
 * A "hook" is a way to "hook" into some facet of a component
 * 
 * useState - hooks into a component's state
 * useEffect - hooks into a component's lifecyle
 */

// Function Component
export const Counter = () => {
    
    // let count = 0; // This doesn't work since React doesn't know it is 'state'

    // useState returns an array, we're destructuring and removing the first element
    // The first element is the state variable. This variable is immutable
    // To change it, we use the function in the second spot in the array
    let [count, setCount] = useState(0);

    // I can have another useEffect
    useEffect(() => {
        console.log('I am born!');
        // If useEffect returns a function, it will be used whenever the component unmounts
        return () => {
            console.log('Goodbye!');
        }
    }, []); // Runs ONLY once as soon as the component is first rendered to the page

    useEffect(() => {
        console.log('Count changed!');
    }, [count]); // Run the callback whenever count changes

    const increment = () => {
        if (count + 1 >= 0) { // To avoid overflow
            setCount(count + 1);
        }
        // setCount(count + 1);
        // console.log(count);
    }

    const decrement = () => {
        if (count - 1 >= 0) {
            setCount(count - 1);
        }
    }

    return (
        <>
            {/* This is an expression. Everything between the {} is JS code 
                Think of it like the template string syntax, just with no ${}
            */}
            <h1>This is my Counter Component</h1>
            <h2 id="counter">Count: {count}</h2> 
            <button onClick={increment}>Increment</button>
            <button onClick={decrement}>Decrement</button>
        </>
    );
}