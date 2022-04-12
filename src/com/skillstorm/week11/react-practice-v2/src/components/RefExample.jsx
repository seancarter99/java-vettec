import { useState, useRef } from "react";

export const RefExample = () => {
    /**
     * useRef returns a reference (ref) to a value similar to how useState does it
     * 
     * Differences between useRef and useState:
     * 1. useRef returns an individual value rather than useState's array
     * 2. The ref returned is mutable which means I don't need a setter for it
     * 3. Mutating the ref's value does NOT cause a re-render of the component
     * 4. The value is maintained between rerenders
     */
    const [dummyState, setDummyState] = useState(false);

    let count = 0;
    
    const countRef = useRef(0);
    
    return (
        <>
            Current Count: {countRef.current}
            <button onClick={() => { countRef.current++; console.log(countRef.current)}}>+</button>
            <button onClick={() => setDummyState(!dummyState)}>Cause Re-Render</button>
        </>
    );
}