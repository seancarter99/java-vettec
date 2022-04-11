import styled from "styled-components";
import { Article } from './Article';

// Takes my Article component and wraps the styles specified around it
// Creates a brand new component that I can reuse around my website

export const StyledArticle = styled(Article)`
    background-color: #00FFFF;
    color: green;
    padding: 50px;
`;