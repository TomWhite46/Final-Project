import axios from "axios";
const ResultRow = ({forenames, surname, dob, setpersonId}) => {
    
    const id = 4; //get rid of this and replace with incoming id

    const selectRow = ({target}) => {
        // set clicked row to active and restyle
        document.querySelectorAll("#resultsTable > tbody > tr").forEach(row => {
            row.className = "";
        });
        target.parentElement.className = "selected";

        return;

        //make axios request to update current person data
        axios.get(`http://localhost:8080/getPersonData/${id}`)
            .then(res => {
                setpersonId(res.data);
            })
            .catch (err => console.log(err));
    }
    
    return(
        <tr onClick={(e)=>selectRow(e)}>
            <td>{forenames}</td>
            <td>{surname}</td>
            <td>{dob}</td>
        </tr>
    );
}

export default ResultRow;