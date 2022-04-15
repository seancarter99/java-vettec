import { useRef } from 'react';
import { useDispatch } from 'react-redux';
import { increment, decrement, setCount, clearCount } from '../../actions/counter';

export const CounterController = () => {
    
    // useDispatch returns a dispatch function to send off actions to the reducer the store's using
    const dispatch = useDispatch();
    const inputRef = useRef();

    return (
        <>
            {/* <button onClick={() => dispatch({type: 'INCREMENT'})}>+</button> */}
            <button onClick={() => dispatch(increment())}>+</button>
            <button onClick={() => dispatch(decrement())}>-</button>
            <input type="number" placeholder="Please enter a number" ref={inputRef} />
            <button onClick={() => dispatch(setCount(inputRef.current.value))}>Set Count</button>
            <button onClick={() => dispatch(clearCount())}>Clear Count</button>
        </>
    );
}