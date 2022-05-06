import React, { useState, useEffect, useRef } from 'react';
import './App.css';
import axios from 'axios';

function App() {
  const [authors, setAuthors] = useState([]);
  const firstNameRef = useRef(null);
  const lastNameRef = useRef(null);

  // When my component first renders, grab all of the authors
  useEffect(() => {
    // Make the http request to grab all the authors
    axios.get(`http://localhost:8080/authors`)
    .then(({data}) => setAuthors(data))
    .catch(err => console.log(err));
  }, []);

  const handleSubmit = async (e) => {
    e.preventDefault();
    // Make a post request to add create a new author
    await axios.post('http://localhost:8080/authors', {
      firstName: firstNameRef.current.value,
      lastName: lastNameRef.current.value
    });
    setAuthors([...authors, {id: -1, firstName: firstNameRef.current.value, lastName: lastNameRef.current.value}])
    firstNameRef.current.value = null;
    lastNameRef.current.value = null;
  }

  return (
    <>
    <form>
      <label htmlFor="first-name">First Name</label>
      <input id="first-name" type="text" ref={firstNameRef} placeholder="First Name" />
      <br />
      <label htmlFor="last-name">Last Name</label>
      <input id="last-name" type="text" ref={lastNameRef} placeholder="Last Name" />
      <br />
      <button type="button" onClick={handleSubmit}>Submit</button>
    </form>
      <div>
        <h1>Authors: </h1>
        <ul>
          {/* Dynamically render all of the authors */}
          {authors.map(author => {
            return <li key={author.id}>{`${author.firstName} ${author.lastName}`}</li>
          })}
        </ul>
      </div>    
    </>
  );
}

export default App;