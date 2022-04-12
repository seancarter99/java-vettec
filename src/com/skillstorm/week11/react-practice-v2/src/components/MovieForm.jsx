import { useRef, useContext } from "react";
import ThemeContext from "../contexts/theme";

export const MovieForm = (props) => {
    // I need 3 inputs for each field and a submit

    /**
     * useRef returns a ref that I can use to reference a DOM element
     * That way, I can get direct DOM access
     * 
     * This will only work for the actual HTML elements
     * You CAN pass it a component, but you'll need to forward that ref to a native HTML element
     */

    const theme = useContext(ThemeContext);

    const titleRef = useRef();
    const directorRef = useRef();
    const yearRef = useRef();

    const handleSubmit = (event) => {
        event.preventDefault();
        props.addMovie({
            title: titleRef.current.value, 
            director: directorRef.current.value,
            year: yearRef.current.value
        });

        titleRef.current.value = null;
        directorRef.current.value = null;
        yearRef.current.value = null;
    }

    return (
        <form style={theme}>
            <input placeholder="Input title" ref={titleRef} />
            <input placeholder="Input director" ref={directorRef} />
            <input placeholder="Input year" ref={yearRef} />
            <button onClick={handleSubmit} type="button">Submit</button>
        </form>
    );
}