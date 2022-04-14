import { useState, useRef, useReducer } from "react";

export const Counter = () => {
    // const useDummyState = (state) => {
    //     const setState = (newValue) => {
    //         state = newValue;
    //         /**
    //          * React then triggers a rerender
    //          */
    //     }
    //     //        0       1
    //     return [state, setState];
    // }
    // setter doesn't work though due to no rerender
    // const [dummyCount, dummySetCount] = useDummyState(0); 

    const [count, setCount] = useState(0);
    const numberRef = useRef();

    // useReducer
    /**
     * useReducer is similar to useState, but gives even more control over the state
     * useReducer is a type of state, useRef is NOT
     * 
     * A "reducer" is simply a function that takes the previous state and an "action",
     * then it returns the next version of the state based on that action
     * 
     * An "action" is a basically a string or key where we map the "action" to its corresponding
     * reducer
     */

    // Before saying useReducer, I first need a reducer for it to use
    const reducer = (state, action) => {
        // I want to run a different reducer based off the type of action
        switch(action.type) {
            case 'INCREMENT':
                // Create a new object using all of the 
                return {...state, count: state.count + 1};
            case 'DECREMENT':
                return {...state, count: state.count - 1};
            case 'SET_COUNT':
                // payload contains any data being passed to the reducer
                // in this case, it's the value the user input
                return {...state, count: Number(action.payload)};
            case 'CLEAR_COUNT':
                return {...state, count: 0};
            default:
                return state;
        }
    }

    // dispatch is used to "dispatch an action"
    // useReducer
    const [state, dispatch] = useReducer(reducer, {count: 0});
    // const counter = useReducer(reducer, {count: 0});
    // const state = counter[0];
    // const dispatch = counter[1];

    // const str = `Hello, my name is ${firstName}! And I like ${weather}!`;

    // const handleSubmit = (e) => {
    //     e.preventDefault();
    //     // Since inputs store text, I cast the value to a number
    //     setCount(Number(numberRef.current.value));
    //     numberRef.current.value = null;
    // }

    const handleSubmit = (e) => {
        e.preventDefault();
        const action = {
            type: 'SET_COUNT', 
            payload: Number(numberRef.current.value)
        }
        dispatch(action);
        numberRef.current.value = null;
    }

    return (
        <>
            <h1>Counter Component</h1>
            
            {/* Using the state */}
            {/* <h2>Count: {count}</h2> */}
            <h2>Count: {state.count}</h2>
            
            {/* INCREMENT */}
            {/* <button onClick={() => setCount(count + 1)}>+</button> */}
            <button onClick={() => dispatch({type: 'INCREMENT'})}>+</button>
            
            {/* DECREMENT */}
            {/* <button onClick={() => setCount(count - 1)}>-</button> */}
            <button onClick={() => dispatch({type: 'DECREMENT'})}>-</button>
            
            {/* SET_COUNT */}
            <input type="number" ref={numberRef} />
            {/* <button type="button" onClick={handleSubmit}>Set Count</button> */}
            <button type="button" onClick={handleSubmit}>Set Count</button>

            {/* CLEAR_COUNT */}
            <button type="button" onClick={() => dispatch({type: 'CLEAR_COUNT'})}>Clear</button>


            {/* Conditional render a component based on whether they're logged in or not */}
            {/* {isLoggedIn ? <Logout /> : <Login />} */}
        </>
    );
}