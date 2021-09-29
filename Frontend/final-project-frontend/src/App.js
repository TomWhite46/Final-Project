import './App.css';
import SearchForm from './components/SearchForm.jsx';
import ResultsTable from './components/ResultsTable.jsx';
import Tabs from './components/Tabs';
import {useState, useEffect} from "react";

function App() {

  const url = "http://localhost:8081";

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
      if (window.pageYOffset > 0) {
        setShowButton(true);
      } else {
        setShowButton(false);
      }
    });
  }, []);
  const scrollToTop = () => {
    window.scrollTo(0, 0);
  };
  

  return (
    <div className="App" data-theme={darkMode ? "dark" : "light"}>
      <h2>Redshift application</h2>
      <button onClick={toggleDarkMode} className="dark-mode-btn">
        {darkMode ? "Light Mode" : "Dark Mode"}
        </button>
        {showButton && (
          <button onClick={scrollToTop} className="back-to-top">
            &#8679;
            </button>
)}
      <SearchForm setShowTable={setShowTable} setShowTabs={setShowTabs} setSearchResults={setSearchResults} searchResults={searchResults} url={url}/>
      <ResultsTable showTable={showTable} searchResults={searchResults} setShowTabs={setShowTabs} setSearchId={setSearchId}/>
      <Tabs showTabs={showTabs} setSearchResults={setSearchResults} searchId={searchId} setSearchId={setSearchId} url={url}/>
    </div>


  );
}

export default App;
