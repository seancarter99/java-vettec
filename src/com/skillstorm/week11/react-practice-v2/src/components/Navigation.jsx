import { useContext } from "react";
import ThemeContext from "../contexts/theme";

export const Navigation = () => {
    /**
     * useContext allows me to read from the Context.Provider parent somewhere up the tree
     * 
     * I need to provide a specific context to read from since there might be multiple
     */

    const styles = {
        display: 'flex',
        justifyContent: 'flex-start',
        marginBottom: '10px',
        padding: '5px',
        fontSize: '32px',
        gap: '10px'
    }
    const theme = useContext(ThemeContext);

    return (
        <nav style={{...styles, ...theme}}>
            <div>Home</div>
            <div>About Me</div>
            <div>Contact Me</div>
        </nav>
    );
}