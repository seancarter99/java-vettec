import { Nav, NavItem, NavLink } from './index';


// This AppNav is non-reusable, otherwise known as "specialized components"
// It's not necessarily a bad thing since NavBars are extremely focused in what they do
export const AppNav = () => {
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
        </Nav>
    );
}