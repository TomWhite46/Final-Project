const Car = ({colour, model, vehicleRegistrationNumber, make}) => {
    return (
        <>
            <table className="dataTable">
                <tbody>
                    <tr>
                        <td>Registration number</td>
                        <td>{vehicleRegistrationNumber}</td>
                    </tr>
                    <tr>
                        <td>Make</td>
                        <td>{make}</td>
                    </tr>
                    <tr>
                        <td>Model</td>
                        <td>{model}</td>
                    </tr>
                    <tr>
                        <td>Colour</td>
                        <td>{colour}</td>
                    </tr>
                </tbody>
            </table>
        </>

    )
}

export default Car;