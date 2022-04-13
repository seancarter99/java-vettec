import styled from "styled-components";

export const NavItem = styled.div`
    margin: ${(props) => props.margin ?? '0px 0.5em'};

    &:first-child {
        margin-left: 0px;
    }

    &:last-child {
        margin-right: 0px;
    }
`;