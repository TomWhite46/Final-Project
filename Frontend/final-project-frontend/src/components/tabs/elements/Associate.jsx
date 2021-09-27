const Associate = ({type, forenames, surname, dob}) => {
    return (
        <>
            <table className="dataTable">
                <tbody>
                    <tr>
                        <td>Association type</td>
                        <td>{type}</td>
                    </tr>
                    <tr>
                        <td>Forenames</td>
                        <td>{forenames}</td>
                    </tr>
                    <tr>
                        <td>Surnames</td>
                        <td>{surname}</td>
                    </tr>
                    <tr>
                        <td>Date of birth</td>
                        <td>{dob.substring(0,10)}</td>
                    </tr>
                </tbody>
            </table>
        </>

    )
}

export default Associate;