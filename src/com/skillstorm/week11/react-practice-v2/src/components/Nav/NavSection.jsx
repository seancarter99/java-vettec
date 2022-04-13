import styled from "styled-components";

/**
 * Styled-Components has a function called styled
 * 
 * styled is a higher-order-component in that it takes a component and returns a new component
 * 
 * It's primary use is taking an existing component and wrapping in some styles, and then
 * returns the styled version of the component
 * 
 */

// NavSection is a normal HTML section tag just with the CSS styles we write
export const NavSection = styled.section`
    display: flex;
    justify-content: ${(props) => props.jc ?? 'flex-start'};
    width: 100%;
`;