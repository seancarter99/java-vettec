import styled from 'styled-components';

interface NavProps {
    jc?: string;
    gap?: string;
    flexWrap?: string;
}

export const Nav = styled.nav<NavProps>`
    display: flex;
    justify-content: ${(props: NavProps) => props.jc ?? 'flex-start'};
    gap: ${({gap}) => gap}
`;