import ResultRow from "./ResultRow";

const ResultsTable = ({showTable, searchResults, setSearchId}) => {
    
    // console.log("test:" + searchResults);

    if (showTable === false) {
        return <></>
    } else if (searchResults == false) {
        return <div>No matches were found.</div>
    } else {
        return (
            <>
                <div>Please select a person from the matches below:</div>    
                <table id="resultsTable">
                    <thead>
                        <tr>
                            <th>Forenames</th>
                            <th>Surname</th>
                            <th>Date of Birth</th>
                        </tr>
                    </thead>
                    <tbody>
                        {searchResults.map(({personID, personForenames, personSurname, personDOB}) => <ResultRow key={personID} id={personID} forenames={personForenames} surname={personSurname} dob={personDOB} setSearchId={setSearchId}/>)}
                    </tbody>
                </table>
            </>
        )
    }
}

export default ResultsTable;