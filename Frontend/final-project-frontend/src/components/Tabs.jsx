import {BrowserRouter as Router, Route, Switch} from 'react-router-dom';
import Biographical from './tabs/Biographical';
import FinancialTransactions from './tabs/FinancialTransactions';
import Nav from './Nav';
import CarInfo from './tabs/CarInfo';
import Telephone from './tabs/Telephone';
import Associates from './tabs/Associates';
import Addresses from './tabs/Addresses';
import Locations from './tabs/Locations';
import { useEffect, useState } from "react";
import axios from "axios";

const Tabs = ({showTabs, setShowTabs, setSearchResults, searchId, setSearchId, url}) => {

    const [person, setPerson] = useState([]);
    
    useEffect(() => {
        axios.get(`${url}/getByID/${searchId}`) 
        .then(({data}) => {        
            setPerson(data);
            document.querySelector("#currentPerson").scrollIntoView({behavior: "smooth"}); 
        })
        .catch (err => console.log(err));
    }, [searchId]);

    if (showTabs === false) {
        return <></>
    } else {
        return (
            <div className="tabs">
                <div id="currentPerson">Data pertaining to <strong>{person.personForenames} {person.personSurname}</strong>, born {person.personDOB}</div>
                <Router>
                    <Nav/>
                    <Switch>
                        <Route exact path="/">
                            <Biographical person = {person} url={url}/>
                        </Route>
                        <Route path="/addresses">
                            <Addresses searchId = {searchId} url={url}/>
                        </Route>
                        <Route path="/financialTransactions">
                            <FinancialTransactions searchId = {searchId} url={url}/>
                        </Route>
                        <Route path="/carInfo">
                            <CarInfo searchId = {searchId} url={url}/>
                        </Route>
                        <Route path="/telephone">
                            <Telephone searchId = {searchId} url={url}/>
                        </Route>
                        <Route path="/associates">
                            <Associates setSearchResults={setSearchResults} searchId = {searchId} setSearchId={setSearchId} url={url}/>
                        </Route>
                        <Route path="/locations">
                            <Locations setShowTabs={setShowTabs} setSearchResults={setSearchResults} searchId = {searchId} url={url}/>
                        </Route>
                    </Switch>
                </Router>
            </div>

        );
    }
}

export default Tabs;