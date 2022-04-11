import { useState } from 'react';
import { Counter } from './components/Counter.jsx'; // .js/.jsx is OPTIONAL
import { ClassCounter } from './components/ClassCounter.jsx';
import { Header } from './components/Header.jsx';
import { Footer } from './components/Footer';
import { Article } from './components/Article.jsx';
import { InlineStyling } from './components/InlineStyling.jsx';
import { MyButton } from './components/MyButton.jsx';
import { StyledArticle } from './components/StyledArticle.jsx';
import { NavBar } from './components/NavBar/NavBar.jsx';
import './App.css'; // This overrides the previous styles, because I defined it lower in the tree

// This works the same
// function App() {

// }

// I prefer the arrow function
const App = () => {
    const [shouldRender, toggleShouldRender] = useState(false);

    // In a "function component" we return all of the JSX that we need to render to the page
    return (
        // In React, you can only return 1 JSX element at a time

        // This is a fragment and it does not render to the page
        // It's useful for returning 2+ JSX elements
        <>


            <NavBar />
            <StyledArticle 
                className="blog-article"
                title="React is Awesome!" 
                author="Sean Carter" 
                datePublished="04/07/2022"
            >
                This is my Article
            </StyledArticle>








            <br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br />



        {/* By using the Article component, we've made a "reusable component" that makes
            the creation of future articles much easier. I just need to follow this template
        */}
        {/* You can't style a component directly, you must instead pass its style
            on through to an HTML element like <div> or <article>
        */}
            <MyButton>Submit</MyButton>
            <InlineStyling />
            <Article className="blog-article" title="React is Awesome!" author="Sean Carter" datePublished="04/07/2022">
                React is so cool!
                <div>Hey!</div>
            </Article>
            <br />
            <Article 
                className="blog-article"
                id="feature"
                title="React is so Confusing"
                author="Juhyun Shin"
                datePublished="01/01/2022"
            >
                React is so so confusing.
            </Article>
            <br />
            <Article title="Something" author="Somebody" datePublished="Someday">
                Some Text
            </Article>
            <br />

            {/* Alternative is typing this up */}
            <article>
                <header>
                    <h1>Title</h1>
                    <h2>Author</h2>
                </header>
                <p>Text</p>
                <footer>
                    <h4>Date Published</h4>
                </footer>
            </article>
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            <button onClick={() => toggleShouldRender(!shouldRender)}>Render Class Component</button>
            {/* <Header /> */}
            {/* <Counter /> */}
            {/* null does not render to the page.
                Here I'm only rendering class counter if shouldRender is true */}
                {/* Conditional rendering */}
            {shouldRender ? <ClassCounter /> : null}
            
            {/* I can utilize props to make my article more specific */}
            {/* <Article title="React is so Confusing" author="Juhyun" publishDate="04/07/2022" /> */}
            {/* <Article  */}
                {/* title="Why I Love React" */}
                {/* author="Sean" */}
                {/* publishDate="04/06/2022" */}
                {/* // text="" I would not put this here, add it using children */}
            {/* > */}
                {/* This is passed as props.children */}
                {/* I love React because it's cool. */}
            {/* </Article> */}
            {/* <Counter /> */}
            {/* <p>
                Today we are practicing React. React is a cool UI library.
            </p> */}
            

        </>
    );
}

export default App;

// export
// export default

// You can only have one default export per file

// Any regular export (no default) will be all bundled into one JS object
// As such, importing them you'll use destructure syntax