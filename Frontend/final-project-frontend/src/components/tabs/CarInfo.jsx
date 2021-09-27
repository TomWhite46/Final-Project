import Car from "./elements/Car";
import { useEffect, useState } from "react";
import axios from "axios";

const CarInfo = (searchId) => {

const [cars, setCars] = useState([]);

useEffect(() => {
    axios.get(`http://localhost:8080/getVehicleByPersonId/${searchId.searchId}`) 
    .then(({data}) => {        
        
        setCars(data);
    })
    .catch (err => console.log(err));
}, [searchId]);

    return (
        <>
            <div className="dataDisplay">Vehicles associated with individual:
            {cars.map(({vehicleId, vehicleColour, vehicleModel, vehicleRegistrationNumber, vehicleMake}) => <Car key={vehicleId} colour={vehicleColour} model={vehicleModel} vehicleRegistrationNumber={vehicleRegistrationNumber} make={vehicleMake}/>)}
            </div>
        </>
    )
}

export default CarInfo;