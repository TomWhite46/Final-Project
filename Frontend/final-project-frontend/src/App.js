import './App.css';
import SearchForm from './components/SearchForm.jsx';
import SearchFormReg from './components/SearchFormReg';
import SearchFormLoc from './components/SearchFormLoc';
import ResultsTable from './components/ResultsTable.jsx';
import Tabs from './components/Tabs';
import {useState, useEffect} from "react";

function App() {

  const url = "http://54.247.130.198:8081";

  const [showTable, setShowTable] = useState(false);
  const [showTabs, setShowTabs] = useState(false);

  const [searchResults, setSearchResults] = useState([]);
  const [searchId, setSearchId] = useState("");

  const storedDarkMode = localStorage.getItem("DARK_MODE");
  const [darkMode, setDarkMode] = useState(storedDarkMode);
  const toggleDarkMode = () => setDarkMode(darkMode ? false : true);
  useEffect(() => {
  localStorage.setItem("DARK_MODE", darkMode);
  }, [darkMode]);

  const [showButton, setShowButton] = useState(false);
  useEffect(() => {
    window.addEventListener("scroll", () => {
      if (window.pageYOffset > 10) {
        setShowButton(true);
      } else {
        setShowButton(false);
      }
    });
  }, []);
  const scrollToTop = () => {
    window.scrollTo(0, 0);
  };
  
  const showHide = ({target}, str) => {
    const subData = target.nextSibling;
    str= target.id;
    if (subData.className==="hide") {
        subData.className = "show";
        target.innerText = `${str} \u25B2`
    } else {
        subData.className = "hide";
        target.innerText = `${str} \u25BC`
    }
}

  return (
    <div className="App" data-theme={darkMode ? "dark" : "light"}>
    <h2>Person Search Tool</h2>
    <button onClick={toggleDarkMode} className="dark-mode-btn">
      {darkMode ? "Light Mode" : "Dark Mode"}
      </button>
      {showButton && (
        <button onClick={scrollToTop} className="back-to-top">
          &#8679;
          </button>
      )}
      
      <h4>Search by names and/or date of birth</h4>
      <SearchForm setShowTable={setShowTable} setShowTabs={setShowTabs} setSearchResults={setSearchResults} searchResults={searchResults} url={url}/>
      <h4 id="Search by car registration" className="dropDownButton" onClick={(e)=>showHide(e)}>Search by car registration &#x25BC;</h4>
      <div className="hide">
        <SearchFormReg setShowTable={setShowTable} setShowTabs={setShowTabs} setSearchResults={setSearchResults} searchResults={searchResults} url={url}/>
      </div>
      <h4 id="Search by time and location" className="dropDownButton" onClick={(e)=>showHide(e)}>Search by time and location &#x25BC;</h4>
      <div className="hide">
        <SearchFormLoc setShowTable={setShowTable} setShowTabs={setShowTabs} setSearchResults={setSearchResults} searchResults={searchResults} url={url}/>
      </div>
      <ResultsTable showTable={showTable} searchResults={searchResults} setShowTabs={setShowTabs} setSearchId={setSearchId}/>
      <Tabs showTabs={showTabs} setShowTabs={setShowTabs} setSearchResults={setSearchResults} searchId={searchId} setSearchId={setSearchId} url={url}/>
      <div className="whitespace"></div>
    </div>
  );
}

export default App;
