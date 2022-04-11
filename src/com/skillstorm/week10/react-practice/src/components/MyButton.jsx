import styled from 'styled-components';

/**
 * Styled Components acts a higher order function that takes a component and returns a 
 * new component wrapped in the styles I provide it
 * 
 * This is known in React as a "higher order component"
 * 
 * It is a function that either takes a component as a parameter or returns a new component 
 */

// styled is our higher order component

// MyButton is a React component so I can export it
const Button = styled.button`
    border: none;
    border-radius: 10px;
    background-color: #36CA94;
    color: white;
    padding: 0.75rem 0.5rem;
    width: 25%;
    /* Transitions the background-color over the course of
       0.5 seconds with a 0ms delay
    */
    transition: background-color 0.25s ease 0ms;

    &:hover {
        background-color: #2cb381;
    }
`;

export const MyButton = (props) => {
    return (
        <Button>
            {props.children}
        </Button>
    );
}