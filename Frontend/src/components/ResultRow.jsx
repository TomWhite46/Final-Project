const ResultRow = ({forenames, surname, dob}) => {
    
    const highlightRow = ({target}) => {
        document.querySelectorAll("table > tbody > tr").forEach(row => {
            row.className = "";
            console.log(row);
        });
        target.parentElement.className = "selected";
    }
    
    return(
        <tr onClick={(e)=>highlightRow(e)}>
            <td>{forenames}</td>
            <td>{surname}</td>
            <td>{dob}</td>
        </tr>
    );
}

export default ResultRow;