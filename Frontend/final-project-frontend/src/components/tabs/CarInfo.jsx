import Car from "./elements/Car";

const CarInfo = () => {
    return (
        <>
            <div className="dataDisplay">Vehicles associated with individual:
                <Car colour={1} model={1} vehicleRegistrationNumber={1} make={1} />
            </div>
        </>
    )
}

export default CarInfo;