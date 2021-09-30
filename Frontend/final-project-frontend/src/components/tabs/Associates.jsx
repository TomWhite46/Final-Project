import AssociateTable from "./elements/AssociateTable";
import { useEffect, useState } from "react";
import axios from "axios";

const Associates = ({searchId, url, setSearchId, setSearchResults}) => {

    const [friends, setFriends] = useState([]);
    const [partners, setPartners] = useState([]);
    const [contacts, setContacts] = useState([]);
    const [colleagues, setColleagues] = useState([]);
    useEffect(() => {
        
        axios.get(`${url}/getFriendsByPersonId/${searchId}`) 
        .then(({data}) => {        
            setFriends(data);
        })
        .catch (err => console.log(err));

        axios.get(`${url}/getPartnersByPersonId/${searchId}`) 
        .then(({data}) => {        
            setPartners(data);
        })
        .catch (err => console.log(err));

        axios.get(`${url}/getPhoneContactsByPersonId/${searchId}`) 
        .then(({data}) => {        
            setContacts(data);
        })
        .catch (err => console.log(err));

        axios.get(`${url}/getColleaguesByPersonId/${searchId}`) 
        .then(({data}) => {        
            setColleagues(data);
        })
        .catch (err => console.log(err));

    }, [searchId]);

    

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

    return (
        <div  className="dataDisplay"><strong>Known associates of individual:</strong>
            <div id="partner(s)" className="dropDownButton" onClick={(e)=>showHide(e)}>Show partner(s) &#x25BC;</div>
            <div className="hide">
                        <AssociateTable associates={partners} setSearchResults={setSearchResults} setSearchId={setSearchId} url={url}/>
            </div>
            <div id="friend(s)" className="dropDownButton" onClick={(e)=>showHide(e)}>Show friend(s) &#x25BC;</div>
            <div className="hide">
                        <AssociateTable associates={friends} setSearchResults={setSearchResults} setSearchId={setSearchId} url={url}/>
            </div>
            <div id="phone contact(s)" className="dropDownButton" onClick={(e)=>showHide(e)}>Show phone contact(s) &#x25BC;</div>
            <div className="hide">
                        <AssociateTable associates={contacts} setSearchResults={setSearchResults} setSearchId={setSearchId} url={url}/>
            </div>
            <div id="colleague(s)" className="dropDownButton" onClick={(e)=>showHide(e)}>Show colleague(s) &#x25BC;</div>
            <div className="hide">
                        <AssociateTable associates={colleagues} setSearchResults={setSearchResults} setSearchId={setSearchId} url={url}/>
            </div>
        </div>
    )
}
export default Associates;