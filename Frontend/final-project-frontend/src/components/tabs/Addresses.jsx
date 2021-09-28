import { useEffect, useState } from "react";
import axios from "axios";
import BusinessAddress from "./elements/BusinessAddress";

const Addresses = (searchId) => {

            const [businessAddresses, setBusinessAddresses] = useState([]);
            
            useEffect(() => {
                axios.get(`http://localhost:8080/getBusinessAddressPersonId/${searchId.searchId}`) 
                .then(({data}) => {        
                    
                    setBusinessAddresses(data);
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
            }

    return (
        <>
            <div className="dataDisplay">Addresses associated with individual:
                <div id="business address(es)" className="dropDownButton" onClick={(e)=>showHide(e)}>Show business address(es) &#x25BC;</div>
                <div className="hide">
                    <table className="dataTable">
                        <thead>
                            <tr>
                                <th>Business name</th>
                                <th>Business type</th>
                                <th>House</th>
                                <th>Street</th>
                                <th>Town</th>
                                <th>Postcode</th>
                            </tr>
                        </thead>
                        <tbody>
                            {businessAddresses.map(({businessAddressId, businessName, businessAddressStreetName, businessAddressTypeOfBusiness, businessAddressPostcode, businessAddressTown, businessAddressHouseNumber}) => <BusinessAddress name={businessName} type={businessAddressTypeOfBusiness} house={businessAddressHouseNumber} street={businessAddressStreetName} town={businessAddressTown} postcode={businessAddressPostcode}/>)}
    
                        </tbody>
                    </table>
                </div>
            </div>
        </>
    )
}

export default Addresses;