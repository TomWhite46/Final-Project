const Biographical = () => {

    const forenames = "test";
    const surname = "test";
    const dob = "test";
    const placeOfBirth = "test";
    const sex ="test";
    const nationality = "test";
    const homeAddress = "test";

    return (
        <>
        <div className="dataDisplay">Biographical details:
            <table className="dataTable">
                <tbody>
                    <tr>
                        <td>Forenames</td>
                        <td>{forenames}</td>
                    </tr>
                    <tr>
                        <td>Surname</td>
                        <td>{surname}</td>
                    </tr>
                    <tr>
                        <td>Date of Birth</td>
                        <td>{dob}</td>
                    </tr>
                    <tr>
                        <td>Place of Birth</td>
                        <td>{placeOfBirth}</td>
                    </tr>
                    <tr>
                        <td>Sex</td>
                        <td>{sex}</td>
                    </tr>
                    <tr>
                        <td>Nationality</td>
                        <td>{nationality}</td>
                    </tr>
                    <tr>
                        <td>Home Address</td>
                        <td>{homeAddress}</td>
                    </tr>
                    <tr>
                        <td>Business Address</td>
                        <td>Business address</td>
                    </tr>

                </tbody>
            </table>
        </div>
        </>
    )
}
export default Biographical;