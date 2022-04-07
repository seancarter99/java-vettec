// props are the properties passed in by the parent
// I can destructure the props object and pull out what I need

export const Header = (props) => {
    console.log(props);
    return (
        <header>
            <h1>{props.title}</h1>
            <h2>Made by: {props.author}</h2>
        </header>
    );
}