import Phone from "./elements/Phone";
import { useEffect, useState } from "react";
import axios from "axios";

const Telephone = (searchId) => {

    const [phones, setPhones] = useState([]);

    useEffect(() => {
        axios.get(`http://localhost:8080/getPhoneByPersonId/${searchId.searchId}`) 
        .then(({data}) => {        
            console.log(data);
            setPhones(data);
        })
        .catch (err => console.log(err));
    }, [searchId]);

    return (
        <>
            <div className="dataDisplay">Telephones associated with individual:
            {phones.map(({mobilePhoneId, mobilePhoneNumber, mobilePhoneOperator}) => <Phone key={mobilePhoneId} number={mobilePhoneNumber} operator={mobilePhoneOperator}/>)}
            </div>
        </>
    )
}

export default Telephone;