import Phone from "./elements/Phone";
import { useEffect, useState } from "react";
import axios from "axios";

const Telephone = ({searchId, url}) => {

    const [phones, setPhones] = useState([]);

    useEffect(() => {
        axios.get(`${url}/getPhoneByPersonId/${searchId}`) 
        .then(({data}) => {        
            setPhones(data);
        })
        .catch (err => console.log(err));
    }, [searchId]);

    return (
        <>
            <div className="dataDisplay"><strong>Telephones associated with individual:</strong>
            {phones.map(({mobilePhoneId, mobilePhoneNumber, mobilePhoneOperator}) => <Phone key={mobilePhoneId} number={mobilePhoneNumber} operator={mobilePhoneOperator}/>)}
            </div>
        </>
    )
}

export default Telephone;