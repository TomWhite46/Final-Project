import './App.css';
import SearchForm from './components/SearchForm.jsx';
import ResultsTable from './components/ResultsTable.jsx';
import Tabs from './components/Tabs';
import {useState} from "react";

function App() {

  const url = "http://localhost:8081";

  const [showTable, setShowTable] = useState(false);
  const [showTabs, setShowTabs] = useState(false);

  const [searchResults, setSearchResults] = useState([]);
  const [searchId, setSearchId] = useState("");
  

  return (
    <div>
      <h2>Redshift application</h2>
      <SearchForm setShowTable={setShowTable} setShowTabs={setShowTabs} setSearchResults={setSearchResults} searchResults={searchResults} url={url}/>
      <ResultsTable showTable={showTable} searchResults={searchResults} setShowTabs={setShowTabs} setSearchId={setSearchId}/>
      <Tabs showTabs={showTabs} setSearchResults={setSearchResults} searchId={searchId} setSearchId={setSearchId} url={url}/>
    </div>
  );
}

export default App;
