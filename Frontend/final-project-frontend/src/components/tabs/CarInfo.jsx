import Car from "./elements/Car";
import { useEffect, useState } from "react";
import axios from "axios";

const CarInfo = ({searchId, url}) => {

const [cars, setCars] = useState([]);

useEffect(() => {
    axios.get(`${url}/getVehicleByPersonId/${searchId}`) 
    .then(({data}) => {        
        
        setCars(data);
    })
    .catch (err => console.log(err));
}, [searchId]);

    return (
        <>
            <div className="dataDisplay"><strong>Vehicles associated with individual:</strong>
            {cars.map(({vehicleId, vehicleColour, vehicleModel, vehicleRegistrationNumber, vehicleMake}) => <Car key={vehicleId} colour={vehicleColour} model={vehicleModel} vehicleRegistrationNumber={vehicleRegistrationNumber} make={vehicleMake}/>)}
            </div>
        </>
    )
}

export default CarInfo;