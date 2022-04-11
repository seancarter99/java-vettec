/**
 * Inline styling in React makes it easy to inject styles on a certain element in the same
 * way that you might do it in HTML.
 * 
 * It's slightly better here, since it's more reusable since I can store the styles in a variable 
 */

const styles = {
    // Since this is JS, we use camel-case for our CSS properties
    backgroundColor: 'rgb(0, 255, 0)',
    padding: '10px 20px',
    marginTop: '30px',
    color: 'white'
}

export const InlineStyling = () => {
    return (
        <>
            <div style={styles}>
                Hello World!
            </div>
            {/* I can reuse that style object for the div */}
            <div style={styles}>
                Hola Mundo!
            </div>
        </>
    );
}