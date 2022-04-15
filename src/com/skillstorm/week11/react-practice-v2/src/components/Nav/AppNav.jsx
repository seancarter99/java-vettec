import { useNavigate } from 'react-router-dom';
import { Nav, NavItem, NavLink } from './index';

// This AppNav is non-reusable, otherwise known as "specialized components"
// It's not necessarily a bad thing since NavBars are extremely focused in what they do
export const AppNav = () => {
    // useNavigate returns a navigate function
    // using the navigate function allows me to manually navigate a user to another page
    const navigate = useNavigate();
    
    const navigateToRedux = () => {
        navigate('/redux');
    }

    return (
        <Nav style={{backgroundColor: 'blue'}} onClick={() => console.log('Hello World!')}>
            <NavItem>
               <NavLink to="/">Home</NavLink>
            </NavItem>
            <NavItem>
                <NavLink to="/day2">Day2</NavLink>
            </NavItem>
            <NavItem>
                <NavLink to="/useReducer">useReducer</NavLink>
            </NavItem>
            <NavItem>
                <NavLink to="/redux">Redux</NavLink>
            </NavItem>
            <NavItem>
                <button onClick={navigateToRedux} type="button">Redux</button>
            </NavItem>
        </Nav>
    );
}