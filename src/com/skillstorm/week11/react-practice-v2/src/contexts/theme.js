import { createContext } from "react";

// In order to use a context we first need to create one

export const themes = {
    light: {
        backgroundColor: '#EEEEEE',
        color: 'black'
    },
    dark: {
        backgroundColor: '#212121',
        color: 'white'
    }
}

const ThemeContext = createContext(themes.light);

/**
 * There can only be one default export per file
 * 
 * It allows whoever imports it to call it whatever they want as well as drop the curly
 * brace syntax when importing
 */
export default ThemeContext;