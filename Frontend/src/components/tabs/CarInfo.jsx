import Car from "./elements/Car";

const CarInfo = () => {
    return (
        <>
            <div className="dataDisplay">Vehicles associated with individual:
                <Car/>
                <Car/>
            </div>
        </>
    )
}

export default CarInfo;