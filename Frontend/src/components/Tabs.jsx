import {BrowserRouter as Router, Route, Switch} from 'react-router-dom';
import Biographical from './tabs/Biographical';
import FinancialTransactions from './tabs/FinancialTransactions';
import Nav from './Nav';
import CarInfo from './tabs/CarInfo';
import Telephone from './tabs/Telephone';
import Associates from './tabs/Associates';

const Tabs = ({showTabs, personData}) => {
    if (showTabs === false) {
        return <></>
    } else {
        return (
            <div className="tabs">
                <Router>
                    <Nav/>
                    <Switch>
                        <Route exact path="/">
                            <Biographical/>
                        </Route>
                        <Route path="/financialTransactions">
                            <FinancialTransactions/>
                        </Route>
                        <Route path="/carInfo">
                            <CarInfo/>
                        </Route>
                        <Route path="/telephone">
                            <Telephone/>
                        </Route>
                        <Route path="/associates">
                            <Associates/>
                        </Route>
                    </Switch>
                </Router>
            </div>

        );
    }
}

export default Tabs;