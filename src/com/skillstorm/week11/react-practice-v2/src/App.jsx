import { useState } from 'react';
import { Table } from './components/Table';
import { MovieForm } from './components/MovieForm';
import { RefExample } from './components/RefExample';
import { Navigation } from './components/Navigation';
import ThemeContext, { themes } from './contexts/theme';

function App() {
  const [movieList, setMovieList] = useState([]);
  const [theme, setTheme] = useState(themes.light);

  // Changing the theme here will update any component using that context
  const toggleTheme = () => {
    if (theme === themes.light) {
      setTheme(themes.dark)
    } else {
      setTheme(themes.light)
    }
  }

  const addMovie = (movie) => {
    // Creates a new array with the contents of the old one PLUS the movie to be added
    // Then, set the movieList to be that brand new array
    setMovieList([...movieList, movie]);
    
    // Non-Spread equivalent
    // const moviesCopy = movieList.slice();
    // moviesCopy.push(movie);
    // setMovieList(moviesCopy);
  }

  return (
    <ThemeContext.Provider value={theme}>
      <Navigation />
      <Navigation />
      <MovieForm addMovie={addMovie} />
      <Table items={movieList} />
      <RefExample />
      <button onClick={toggleTheme}>Change Theme!</button>
    </ThemeContext.Provider>
  );
}

export default App;
