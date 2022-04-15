import React from 'react';
import ReactDOM from 'react-dom';
import { createRoot } from 'react-dom/client';
import { Provider } from 'react-redux';
import './index.css';
import { store } from './reduxStore';
import App from './App';

// React 17 Way
// ReactDOM.render(
//   <React.StrictMode>
//     <App />
//   </React.StrictMode>,
//   document.getElementById('root')
// );

// React 18 Way
const container = document.getElementById('root');
const root = createRoot(container);
root.render(
  <React.StrictMode>
    {/* Gives my entire App component and any child it has access to the store */}
    {/* 
      Provider is a design pattern "Provider Pattern"
      It allows me to "provide" data to a section of the tree
    */}
    <Provider store={store}>
      <App />
    </Provider>
  </React.StrictMode>
);

// Wrapping the global around your App component is a great way to make it available everywhere