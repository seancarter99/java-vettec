import { useSelector } from 'react-redux';
import { Nav, NavItem, NavLink, NavSection } from './index';

export const AppNav2 = () => {
    const count = useSelector(state => state);

    return (
        <Nav>
            <NavSection>
                <NavItem>
                    <NavLink to="/">Home</NavLink>
                </NavItem>
                <NavItem>
                    Hello
                </NavItem>
            </NavSection>
            <NavSection jc="flex-end">
                <NavItem>
                    Goodbye
                </NavItem>
                <NavItem>
                    {count}
                </NavItem>
                <NavItem>
                    <NavLink to="/day2">Day 2</NavLink>
                </NavItem>
            </NavSection>
        </Nav>
    );
}