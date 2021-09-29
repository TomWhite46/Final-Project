import Associate from "./Associate";

const AssociateTable = ({associates, setSearchResults, setSearchId, url}) => {
    return (
        <table className="topHeads">
            <thead>
                <tr>
                    <td>Forename(s)</td>
                    <td>Surname</td>
                    <td>Date of Birth</td>
                    <td></td>
                </tr>
            </thead>
            <tbody>
                {associates.map(({personID, personForenames, personSurname, personDOB})=> <Associate key={personID} id={personID} forenames={personForenames} surname={personSurname} dob={personDOB} setSearchResults={setSearchResults} setSearchId={setSearchId} url={url}/>)}
            </tbody>
        </table>
    )
}

export default AssociateTable;