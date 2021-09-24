import './App.css';
import SearchForm from './components/SearchForm.jsx';
import ResultsTable from './components/ResultsTable.jsx';
import Tabs from './components/Tabs';
import {useState} from "react";

function App() {


  const [showTable, setShowTable] = useState(false);
  const [showTabs, setShowTabs] = useState(false);

  const [searchResults, setSearchResults] = useState([{"forenames": "Jordan", "surname":"Harrison", "dob":"1/1/1970"},
  {"forenames": "Luke", "surname":"Benson", "dob":"2/1/1970"}]);
  const [personData, setPersonData] = useState([
    {
      "forenames": "Jordan",
      "surname": "Harrison",
      "dob": "1/1/1970",
      "placeOfBirth": "Antarctica",	
      "sex": "male",
      "nationality": "Antarctican",
      "citizen": [{
        "homeAddress": "123 Fake Street, Fakesford, Fakesfordshire",
      }],
      "vehicles": [{
        "colour":"red",
        "model":"Z-95",
        "vehicleRegistrationNumber":"C4RC4R",
        "make": "Boeing"
      },
      {
        "colour":"black",
        "model":"Y-wing",
        "vehicleRegistrationNumber":"MYC4R",
        "make": "Mercedes"
      }
      ]
    }
  ]);
  
  console.log(personData);

  return (
    <div>
      <h2>Redshift application</h2>
      <SearchForm setShowTable={setShowTable} setShowTabs={setShowTabs} setSearchResults={setSearchResults}/>
      <ResultsTable showTable={showTable} searchResults={searchResults} setPersonData={setPersonData}/>
      <Tabs showTabs={showTabs} personData={personData}/>

    </div>
  );
}

export default App;
