import styled from "styled-components";

const StyledAnchor = styled.a`
    text-decoration: none;
    color: inherit;
`;

export const NavLink = (props) => {
    return (
        <StyledAnchor href={props.href}>
            {props.children}
        </StyledAnchor>
    );
}