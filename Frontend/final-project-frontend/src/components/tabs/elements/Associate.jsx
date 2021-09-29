import {Link} from 'react-router-dom';
import axios from "axios";

const Associate = ({id, forenames, surname, dob, setSearchResults, setSearchId, url}) => {
    
    const navToPerson = ({target}) => {
        
        const newId=target.parentElement.parentElement.id;

        axios.get(`${url}/getByID/${newId}`) 
        .then(({data}) => {        
            setSearchResults([data]);
            setSearchId(newId);
        })
        .catch (err => console.log(err));

        document.querySelectorAll("nav > a").forEach(e => e.className = "inactive");
        document.querySelector("nav").firstChild.className = "active";
    }
    
    return (
        
        <tr id={id}>
            <td>{forenames}</td>
            <td>{surname}</td>
            <td>{dob.substring(0,10)}</td>
            <td><Link to="/" onClick={(e)=>navToPerson(e)}>Select person</Link></td>
        </tr>
        

    )
}

export default Associate;