import ResultRow from "./ResultRow";

const ResultsTable = ({showTable, searchResults, setpersonId}) => {
    
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
                        {searchResults.map(({personForenames, personSurname, personDOB}) => <ResultRow key={personForenames + personSurname + personDOB} forenames={personForenames} surname={personSurname} dob={personDOB} setpersonId={setpersonId}/>)}
                    </tbody>
                </table>
            </>
        )
    }
}

export default ResultsTable;