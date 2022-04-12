import { useState } from 'react';

/**
 * I want my list to render an infinite number of elements
 */
export const Table = (props) => {
    const [dummyState, setDummyState] = useState(false); 

    // I want a state called items
    // const [movieList, setMovieList] = useState([{
    //     title: 'Star Wars',
    //     director: 'George Lucas',
    //     year: 1977
    // }, {
    //     title: 'The Godfather',
    //     director: 'Francis Ford Coppola',
    //     year: 1972
    // }, {
    //     title: 'Finding Nemo',
    //     director: 'Andrew Stanton',
    //     year: 2003
    // }, {
    //     title: 'The Matrix Reloaded',
    //     director: 'Wachowskis',
    //     year: 2003
    // }]);

    // const swapMatrixAndNemo = () => {
    //     const movieListCopy = [...movieList];
    //     const matrix = movieListCopy[3];
    //     movieListCopy[3] = movieListCopy[2];
    //     movieListCopy[2] = matrix;
    //     console.log(movieListCopy);
    //     setMovieList(movieListCopy);
    // }

    return (
        <>
        <table>
            {/* New array is ['Star Wars', 'The Godfather', 'Nemo'] */}
            {/* Now it's an array of LI tags containing the movie title */}
            {/* {movieList.map(movie => <li>{movie.title}</li>)} */}
            <thead>
                <tr>
                    <th>Title</th>
                    <th>Director</th>
                    <th>Year</th>
                </tr>
            </thead>
            <tbody>
                {props.items.map((movie, index) => {
                    return (
                        /**
                         * Keys are used by React in order to optimize working with large
                         * swathes of data
                         * 
                         * Whenever the list is rerendered, it uses the key to check if it needs
                         * to rerender the individual element
                         */
                        // {value: 2} ---> "{"value": "2"}"

                        /**
                         * Using index as the key is discouraged
                         * 
                         * It's the default behavior of React if you don't provide a key
                         * 
                         * We can use index as the key if and only if
                         * 1. List won't grow or shrink in size
                         * 2. List won't be reordered at all
                         * 
                         * The best key to use is something already unique
                         * The database id given to the data
                         */
                        <tr key={index}>
                            <td>{movie.title}</td>
                            <td>{movie.director}</td>
                            <td>{movie.year}</td>
                        </tr>
                    );
                })}
                {/* <td>Star Wars</td>
                <td>George Lucas</td>
                <td>1977</td> */}
            </tbody>
        </table>
        {/* <button onClick={swapMatrixAndNemo}>Swap Nemo and Matrix</button> */}
        </>
    );
}