import React from 'react';
import logo from './logo.svg';
import './App.css';
import { Article } from './components/Article/Article';

// npx create-react-app . --template typescript
function App() {
  return (
    <>
      <Article title="TypeScript in React" author="Sean Carter">
        TypeScript is awesome!
      </Article>
    </>
  );
}

export default App;
