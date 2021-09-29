import { useEffect, useState } from "react";
import axios from "axios";

const Biographical = ({searchId, url}) => {

    const [person, setPerson] = useState([]);
    
    useEffect(() => {
        axios.get(`${url}/getByID/${searchId}`) 
        .then(({data}) => {        
            setPerson(data);
        })
        .catch (err => console.log(err));
    }, [searchId]);

    const {personForenames, personSurname, personDOB, personPOB, personNationality, personSex} = person;

    return (
        <>
        <div className="dataDisplay"><strong>Biographical details:</strong>
            <table className="dataTable">
                <tbody>
                    <tr>
                        <td>Forenames</td>
                        <td>{personForenames}</td>
                    </tr>
                    <tr>
                        <td>Surname</td>
                        <td>{personSurname}</td>
                    </tr>
                    <tr>
                        <td>Date of Birth</td>
                        <td>{personDOB}</td>
                    </tr>
                    <tr>
                        <td>Place of Birth</td>
                        <td>{personPOB}</td>
                    </tr>
                    <tr>
                        <td>Sex</td>
                        <td>{personSex}</td>
                    </tr>
                    <tr>
                        <td>Nationality</td>
                        <td>{personNationality}</td>
                    </tr>
                </tbody>
            </table>
        </div>
        </>
    )
}
export default Biographical;