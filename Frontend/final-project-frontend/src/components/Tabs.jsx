import {BrowserRouter as Router, Route, Switch} from 'react-router-dom';
import Biographical from './tabs/Biographical';
import FinancialTransactions from './tabs/FinancialTransactions';
import Nav from './Nav';
import CarInfo from './tabs/CarInfo';
import Telephone from './tabs/Telephone';
import Associates from './tabs/Associates';
import Addresses from './tabs/Addresses';
import Locations from './tabs/Locations';

const Tabs = ({showTabs, setSearchResults, searchId, setSearchId, url}) => {



    if (showTabs === false) {
        return <></>
    } else {
        return (
            <div className="tabs">
                <Router>
                    <Nav/>
                    <Switch>
                        <Route exact path="/">
                            <Biographical searchId = {searchId} url={url}/>
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
                            <Locations searchId = {searchId} url={url}/>
                        </Route>
                    </Switch>
                </Router>
            </div>

        );
    }
}

export default Tabs;