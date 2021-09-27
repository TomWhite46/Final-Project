import Associate from "./elements/Associate";
import { useEffect, useState } from "react";
import axios from "axios";

const Associates = (searchId) => {

    const [friends, setFriends] = useState([]);
    const [partners, setPartners] = useState([]);

useEffect(() => {
    axios.get(`http://localhost:8080/getFriendsByPersonId/${searchId.searchId}`) 
    .then(({data}) => {        
        setFriends(data);
        console.log(data);
    })
    .catch (err => console.log(err));

    axios.get(`http://localhost:8080/getPartnersByPersonId/${searchId.searchId}`) 
    .then(({data}) => {        
        setPartners(data);
    })
    .catch (err => console.log(err));

}, [searchId]);

    return (
        <div className="dataDisplay">Known associates of individual:
            <div>
                {partners.map(({personID, personForenames, personSurname, personDOB})=> <Associate key={personID} type="Partner" forenames={personForenames} surname={personSurname} dob={personDOB}/>)}
            </div>
            <div>
                {friends.map(({personID, personForenames, personSurname, personDOB})=> <Associate key={personID} type="Friend" forenames={personForenames} surname={personSurname} dob={personDOB}/>)}
            </div>
        </div>
    )
}
export default Associates;