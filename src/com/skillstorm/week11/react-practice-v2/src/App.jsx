import { BrowserRouter, Routes, Route } from 'react-router-dom';
import { Home, Day2, UseReducerExample, NotFound } from './pages';
import { AppNav, AppNav2 } from './components/Nav';

function App() {

  return (
    // BrowserRouter allows my React application to switch between pages or views
    <BrowserRouter>
      <AppNav /> {/* This Nav component will always render regardless of the page we're at */}
      <AppNav2 />
      <Routes>
        {/* Home will render whenever the website url is visited
          ex. www.google.com
        */}
        <Route path="/" element={<Home />} />
        <Route path="/day2" element={<Day2 />} />
        <Route path="/useReducer" element={<UseReducerExample />} />
        <Route path="*" element={<NotFound />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;
