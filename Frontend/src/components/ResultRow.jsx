const ResultRow = () => {
    
    const highlightRow = ({target}) => {
        document.querySelectorAll("table > tbody > tr").forEach(row => {
            row.className = "";
            console.log(row);
        });
        target.parentElement.className = "selected";
    }
    
    return(
        <tr onClick={(e)=>highlightRow(e)}>
            <td>a</td>
            <td>b</td>
            <td>j</td>
        </tr>
    );
}

export default ResultRow;