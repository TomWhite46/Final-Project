import ResultRow from "./ResultRow";

const ResultsTable = ({showTable}) => {
    
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
                <ResultRow/>
                <ResultRow/>
                <ResultRow/>
            </tbody>
        </table>
    )
    }
}

export default ResultsTable;