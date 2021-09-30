import Waypoint from "./elements/Waypoint";
import VehicleCamera from "./elements/VehicleCamera";
import { useEffect, useState } from "react";
import axios from "axios";

const Locations = ({setShowTabs, setSearchResults, searchId, url}) => {
    
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

    const [waypoints, setWaypoints] = useState([]);
    const [vehicleCamera, setVehicleCamera] = useState([]);

    useEffect(() => {

        axios.get(`${url}/getWaypointRecordByPersonId/${searchId}`) 
        .then(({data}) => {        
            setWaypoints(data);
            document.querySelector("#currentPerson").scrollIntoView({behavior: "smooth"}); 
        })
        .catch (err => console.log(err));

        setVehicleCamera("loading");
        axios.get(`${url}/getVehicleCameraByPersonId/${searchId}`) 
        .then(({data}) => {        
            setVehicleCamera(data);
            document.querySelector("#currentPerson").scrollIntoView({behavior: "smooth"}); 
        })
        .catch (err => console.log(err));

    }, [searchId]);

    
    return (
        <div className="dataDisplay"><strong>Known locations visited by individual:</strong>
            <div id="vehicle camera sightings" className="dropDownButton" onClick={(e)=>showHide(e)}>Show known vehicle camera sightings &#x25BC;</div>
            <div className="hide">
                <table className="topHeads">
                    <thead>
                        <tr>
                            <th>Time</th>
                            <th>Latitude</th>
                            <th>Longitude</th>
                            <th>Street name</th>
                            <th>Vehicle registration</th>
                            <th></th>
                            <th></th>
                        </tr>
                    </thead>
                    <tbody>
                        {(vehicleCamera === "loading" ? <tr><td colspan="5">Loading data...</td></tr> : vehicleCamera.map(({id, timestamp, latitude, longitude, vehicleRegistrationNumber, streetName}) => <VehicleCamera key={id} timestamp={timestamp.substring(0,19).replace('T', ' ')} latitude={latitude} longitude={longitude} street={streetName} reg={vehicleRegistrationNumber} setSearchResults={setSearchResults} url={url} setShowTabs={setShowTabs}/>))}
                    </tbody>
                </table>
            </div>
            <div id="known locations" className="dropDownButton" onClick={(e)=>showHide(e)}>Show known locations &#x25BC;</div>
            <div className="hide">
                <table className="topHeads">
                    <thead>
                        <tr>
                            <th>Time</th>
                            <th>Latitude</th>
                            <th>Longitude</th>
                            <th></th>
                            <th></th>
                        </tr>
                    </thead>
                    <tbody>
                        {waypoints.map(({id, timestamp, latitude, longitude}) => <Waypoint key={id} timestamp={timestamp.substring(0,19).replace('T', ' ')} latitude={latitude} longitude={longitude} setSearchResults={setSearchResults} url={url} setShowTabs={setShowTabs}/>)}
                    </tbody>
                </table>
            </div>
        </div>

    )
}

export default Locations;