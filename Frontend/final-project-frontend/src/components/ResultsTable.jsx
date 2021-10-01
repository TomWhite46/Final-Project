import ResultRow from "./ResultRow";

const ResultsTable = ({showTable, searchResults, setShowTabs, setSearchId}) => {
    
    if (showTable === false) {
        return <></>
    } else if (searchResults === "loading") {
        return <div>Getting results...</div>    
    } else if (searchResults == false) {
        return <div>No matches were found.</div>
    } else if (searchResults === "error") {
        return <div>Error retrieving results.</div>
    } else if (searchResults.length === 500) {
        return <div>Search produced more than 500 results. Please specify.</div>
    } else {
        return (
            <>
                <h4 className="topMargin">Search results: {searchResults.length} matches</h4>
                <div>Please select a person from the matches below:</div>
                <div className="scroll">
                    <table id="resultsTable">
                        <thead>
                            <tr>
                                <th>Forenames</th>
                                <th>Surname</th>
                                <th>Date of Birth</th>
                            </tr>
                        </thead>
                        <tbody>
                            {searchResults.map(({personID, personForenames, personSurname, personDOB}) => <ResultRow key={personID} id={personID} forenames={personForenames} surname={personSurname} dob={personDOB} setShowTabs={setShowTabs} setSearchId={setSearchId}/>)}
                        </tbody>
                    </table>
                </div>    
            </>
        )
    }
}

export default ResultsTable;