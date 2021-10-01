import Bankcard from "./elements/Bankcard";
import AtmTransaction from "./elements/AtmTransaction";
import EposTransaction from "./elements/EposTransaction";
import { useEffect, useState } from "react";
import axios from "axios";

const FinancialTransactions = ({searchId, url}) => {

    
    const showHide = ({target}, str) => {
        const subData = target.nextSibling;
        str= target.id;
        if (subData.className==="hide") {
            subData.className = "show";
            target.innerText = `Hide ${str} \u25B2`
        } else {
            subData.className = "hide";
            target.innerText = `Show ${str} \u25BC`
        }
        document.querySelector("#currentPerson").scrollIntoView({behavior: "smooth"}); 
    }

    const [bankcards, setBankcards] = useState([]);
    const [atmTransactions, setAtmTransactions] = useState([]);
    const [eposTransactions, setEposTransactions] = useState([]);

    useEffect(() => {

        axios.get(`${url}/getBankcardByPersonId/${searchId}`) 
        .then(({data}) => {        
            setBankcards(data);
        })
        .catch (err => console.log(err));

        axios.get(`${url}/getAtmTransactionByPersonId/${searchId}`) 
        .then(({data}) => {        
            setAtmTransactions(data);
        })
        .catch (err => console.log(err));

        axios.get(`${url}/getEposTransactionByPersonId/${searchId}`) 
        .then(({data}) => {        
            setEposTransactions(data);
        })
        .catch (err => console.log(err));

    }, [searchId]);

    
    return (
        <div className="dataDisplay"><strong>Bank cards associated with individual:</strong>
            <div id="bankcards" className="dropDownButton" onClick={(e)=>showHide(e)}>Show bankcards &#x25BC;</div>
            <div className="hide">
                <table className="topHeads">
                    <thead>
                        <tr>
                            <th>Card number</th>
                            <th>Sort code</th>
                        </tr>
                    </thead>
                    <tbody>
                        {bankcards.map(({cardNumber, bankcardSortcode}) => <Bankcard key={cardNumber} cardNumber={cardNumber} sortCode={bankcardSortcode}/>)}
                    </tbody>
                </table>
            </div>
            <div id="ATM transactions" className="dropDownButton" onClick={(e)=>showHide(e)}>Show ATM transactions &#x25BC;</div>
            <div className="hide">
                <table className="topHeads">
                    <thead>
                        <tr>
                            <th>Time</th>
                            <th>Type</th>
                            <th>Amount</th>
                            <th>ATM no.</th>
                        </tr>
                    </thead>
                    <tbody>
                        {atmTransactions.map(({timestamp, type, amount, atmId}) => <AtmTransaction key={timestamp+atmId} timestamp={timestamp} type={type} amount={amount} atmId={atmId}/>)}
                    </tbody>
                </table>
            </div>
            <div id="EPOS transactions" className="dropDownButton" onClick={(e)=>showHide(e)}>Show EPOS transactions &#x25BC;</div>
            <div className="hide">
                <table className="topHeads">
                    <thead>
                        <tr>
                            <th>Time</th>
                            <th>Amount</th>
                            <th>Payee account no.</th>
                        </tr>
                    </thead>
                    <tbody>
                        {eposTransactions.map(({eposTimestamp, eposAmount, payeeAccount}) => <EposTransaction key={eposTimestamp+payeeAccount} timestamp={eposTimestamp} amount={eposAmount} payee={payeeAccount}/>)}
                    </tbody>
                </table>
            </div>
        </div>

    )
}

export default FinancialTransactions;