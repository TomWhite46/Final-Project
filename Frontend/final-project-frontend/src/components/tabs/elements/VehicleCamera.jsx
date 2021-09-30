import axios from "axios";

const VehicleCamera = ({timestamp, latitude, longitude, street, reg, setSearchResults, url, setShowTabs}) => {

    const address = `https://www.google.com/maps/place/${latitude},${longitude}/@${latitude},${longitude},12z`
    const navToPerson = ({target}) => {
        
        const time = target.parentElement.querySelector("td:nth-child(1)").innerText;
        const lat = target.parentElement.querySelector("td:nth-child(2)").innerText;
        const long =target.parentElement.querySelector("td:nth-child(3)").innerText;

        setShowTabs(false);
        setSearchResults("loading");

        axios.get(`${url}/findPersonByLocation/${time}/${lat}/${long}`) 
        .then(({data}) => {        
            setSearchResults(data);           
        })
        .catch (err => console.log(err));
    }

    return (
                    <tr>    
                        <td>{timestamp}</td>
                        <td>{latitude}</td>
                        <td>{longitude}</td>
                        <td>{street}</td>
                        <td>{reg}</td>
                        <td><a href={address} target="_blank" rel="noreferrer">Map</a></td>
                        <td className="findLocPeople" onClick={(e)=>navToPerson(e)}>Find people in area</td>
                    </tr>
    )
}

export default VehicleCamera;