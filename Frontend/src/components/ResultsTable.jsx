import ResultRow from "./ResultRow";

const ResultsTable = ({showTable, searchResults, setPersonData}) => {
    
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
                        {searchResults.map(({forenames, surname, dob}) => <ResultRow forenames={forenames} surname={surname} dob={dob} setPersonData={setPersonData}/>)}
                    </tbody>
                </table>
            </>
        )
    }
}

export default ResultsTable;