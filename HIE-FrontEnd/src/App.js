import React from 'react';
import './App.css';
import HIEComponent from './components/HIEComponent';


function App() {
  return (
    <>
    <nav className="navbar navbar-expand-lg navbar-light bg-light">
    <div className="container-fluid">
      <h4 className="navbar-brand">HIE there! </h4>
      <div className="collapse navbar-collapse" id="navbarSupportedContent">
        <form className="d-flex">
          <input className="form-control me-2" type="search" placeholder="Search" aria-label="Search"/>
          <button className="btn btn-outline-success" type="submit">Search</button>
        </form>
      </div>
    </div>
    </nav>
    <div >
      <HIEComponent />
    </div>
    </>
  );
}

export default App;
