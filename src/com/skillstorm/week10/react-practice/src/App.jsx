import { Header } from './components/Header.jsx'; // .js/.jsx is OPTIONAL
import { Counter } from './components/Counter.jsx';

// This works the same
// function App() {

// }

// I prefer the arrow function
const App = () => {
    // In a "function component" we return all of the JSX that we need to render to the page
    return (
        // In React, you can only return 1 JSX element at a time

        // This is a fragment and it does not render to the page
        // It's useful for returning 2+ JSX elements
        <>
            {/* <Header /> */}
            <Counter />
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