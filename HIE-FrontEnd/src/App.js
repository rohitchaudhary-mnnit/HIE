import React from "react";
import "./App.css";
import HIEComponent from "./components/HIEComponent";

function App() {
  return (
    <>
      <div className="sticky-lg-top">
        <div className="p-3 mb-2 bg-success text-white">
          <h1 className="display-4">HIE there! </h1>
          <p className="display-6">
            This application provides you with all the necessary life saving
            emergency health Services.
          </p>
        </div>
      </div>
      <div>
        <HIEComponent />
      </div>
    </>
  );
}

export default App;
