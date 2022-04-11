import { Header } from "./Header";
import { Footer } from "./Footer";
// import { ArticleBody } from "./ArticleBody";

export const Article = (props) => {
    console.log('Article Props:', props);

    return (
        <article className={props.className} id={props.id}>
            <Header title={props.title} author={props.author}/>
            <p>
                {props.children}
            </p>
            {/* <ArticleBody></ArticleBody> */}
            <Footer datePublished={props.datePublished} />
        </article>
    );
}