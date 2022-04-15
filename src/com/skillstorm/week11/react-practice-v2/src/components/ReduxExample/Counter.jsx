import { useSelector } from 'react-redux';

export const Counter = () => {
    // This returns to me the entire store, right now, counter is the entirity of the store

    // useSelector takes a function, the parameter is the entire store, what is returned should
    // be the specific state we want out of it and that is stored in the variable counter
    const counter = useSelector(state => state);

    return (
        <>
            <h1>Counter</h1>
            <h2>Current Count: {counter}</h2>
        </>
    );
}