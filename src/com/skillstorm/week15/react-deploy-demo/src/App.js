import logo from './logo.svg';
import './App.css';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          To make API requests, please use the following URL: <h2>{process.env.REACT_APP_API_URL}</h2>
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          {/* {axios.get(`${process.env.REACT_APP_API_URL}/authors`)} */}
          Learn React With Me
        </a>
      </header>
    </div>
  );
}

export default App;
