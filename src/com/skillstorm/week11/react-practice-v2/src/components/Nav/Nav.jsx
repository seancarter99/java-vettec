import styled from 'styled-components';

const NavContainer = styled.nav`
    background-color: #E5679B;
    color: white;
    padding: 1.5em 1em;
    font-size: 20px;
    display: flex;
    justify-content: flex-start;
`;

// This is a reusable Nav component as it is not aware of what it is being passed as children
// It does not determine the order, the amount, or anything about its children
// The spreading of props allows for additional "tweaking" of the Nav's behavior

// Extract from props the children and condense the rest into a variable called props
export const Nav = ({children, ...props}) => {
    return (
        // Spread all of the properties that were condensed onto the NavContainer
        <NavContainer {...props}>
            {children}
        </NavContainer>
    );
}