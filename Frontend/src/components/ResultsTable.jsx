import ResultRow from "./ResultRow";

const ResultsTable = ({showTable, searchResults}) => {
    
    console.log(showTable);

    if (showTable === false) {
        return <></>
    } else {
    
    return (
        <table>
            <thead>
                <th>Forenames</th>
                <th>Surname</th>
                <th>Date of Birth</th>
            </thead>
            <tbody>
                {searchResults.map(({forenames, surname, dob}) => <ResultRow forenames={forenames} surname={surname} dob={dob}/>)}
            </tbody>
        </table>
    )
    }
}

export default ResultsTable;