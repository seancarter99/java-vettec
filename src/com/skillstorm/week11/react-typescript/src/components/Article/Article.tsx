import { ReactComponent } from "../../interfaces/ReactComponent";

interface ArticleProps extends ReactComponent{
    title: string;
    author: string;
    timeStamp?: string | number;
}

export const Article: React.FC<ArticleProps> = ({title, author, timeStamp, children}) => {
    return (
        <>
            <h1>{title} by: {author}</h1>
            <p>
                {children}
            </p>
            {timeStamp && <h3>Date Published: {timeStamp}</h3>}
        </>
    );
}