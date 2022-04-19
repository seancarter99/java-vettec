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

    const handleSubmit = (event, shouldAddToFront=false) => {
        event.preventDefault();
        props.addMovie({
            title: titleRef.current.value, 
            director: directorRef.current.value,
            year: yearRef.current.value
        }, shouldAddToFront);

        titleRef.current.value = null;
        directorRef.current.value = null;
        yearRef.current.value = null;
    }

    /**
     * <div id="myDiv" className="container">Hello World!</div>
     * 
     * React.createElement('div', { id="myDiv", class="container" }, "Hello World!");
     * 
     * const el = document.createElement('div');
     * el.id = "myDiv"
     * el.class = "container"
     * el.innerText = "Hello World!"
     * 
     * <div id="myDiv" class="container">Hello World!</div>
     */
    return (
        <form style={theme}>
            <input placeholder="Input title" ref={titleRef} />
            <input placeholder="Input director" ref={directorRef} />
            <input placeholder="Input year" ref={yearRef} />
            {/* Known as Currying a function
                This is nice when you want to call a function with parameters, but don't want
                it to immediately execute
            */}
            <button onClick={(e) => handleSubmit(e)} type="button">Add to End</button>
            <button onClick={(e) => handleSubmit(e, true)} type="button">Add to Beginning</button>
        </form>
    );
}