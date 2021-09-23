import './App.css';
import SearchForm from './components/SearchForm.jsx';
import ResultsTable from './components/ResultsTable.jsx';
import Tabs from './components/Tabs';
import {useState} from "react";

function App() {

  const [showTable, setShowTable] = useState(false);
  const [showTabs, setShowTabs] = useState(false);

  return (
    <div>
      <h2>Redshift application</h2>
      <SearchForm setShowTable={setShowTable} setShowTabs={setShowTabs}/>
      <ResultsTable showTable={showTable}/>
      <Tabs showTabs={showTabs}/>

    </div>
  );
}

export default App;
