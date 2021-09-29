import Waypoint from "./elements/Waypoint";
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
    }

    const [waypoints, setWaypoints] = useState([]);

    useEffect(() => {

        axios.get(`${url}/getWaypointRecordByPersonId/${searchId}`) 
        .then(({data}) => {        
            setWaypoints(data);
        })
        .catch (err => console.log(err));

    }, [searchId]);

    
    return (
        <div className="dataDisplay"><strong>Known locations visited by individual:</strong>
            <div id="known locations" className="dropDownButton" onClick={(e)=>showHide(e)}>Show known locations &#x25BC;</div>
            <div className="hide">
                <table className="topHeads">
                    <thead>
                        <tr>
                            <th>Time</th>
                            <th>Latitude</th>
                            <th>Longitude</th>
                        </tr>
                    </thead>
                    <tbody>
                        {waypoints.map(({id, timestamp, latitude, longitude}) => <Waypoint key={id} timestamp={timestamp.substring(0,19).replace('T', ' ')} latitude={latitude} longitude={longitude}/>)}
                    </tbody>
                </table>
            </div>
        </div>

    )
}

export default FinancialTransactions;