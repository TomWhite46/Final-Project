const ResultRow = ({id, forenames, surname, dob, setShowTabs, setSearchId}) => {
    
    const selectRow = ({target}) => {
        document.querySelectorAll("#resultsTable > tbody > tr").forEach(row => {
            row.className = "";
        });
        target.parentElement.className = "selected";
        setShowTabs("true");
        setSearchId(target.parentElement.id);
    }

    return(
        <tr id={id} onClick={(e)=>selectRow(e)}>
            <td>{forenames}</td>
            <td>{surname}</td>
            <td>{dob}</td>
        </tr>
    );
}

export default ResultRow;