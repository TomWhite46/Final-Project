import axios from 'axios';
import 'bootstrap/dist/css/bootstrap.min.css';

const SearchForm = ({setShowTable, setShowTabs, setSearchResults, url}) => {
    
    const submitForm = (e) => {
        e.preventDefault();        
        const forename = e.target.forename.value;
        const surname = e.target.surname.value;
        const dob = e.target.dob.value;

        let request = "findPersonBy";
        (forename === "" ? console.log("no forename") : request += "Forename");
        (surname === "" ? console.log("no surname") : request += "Surname");
        (dob === "" ? console.log("no dob") : request += "Dob");

        if (request === "findPersonBy") {
            alert("Please enter data in at least one field.");
            return;
        }

        setShowTabs(false);
        setSearchResults("loading")
        setShowTable(true);


        
        axios.get(`${url}/${request}/${forename}/${surname}/${dob}`) 
            .then(({data}) => {        
                setSearchResults(data);
                
            })
            .catch (err => {
                console.log(err);
                setSearchResults("error");
            })
    };
    
    return (
        
            <form className="searchForm" onSubmit={(e)=>submitForm(e)}>
                <div className="row">
                    <div className="column1">
                        <label htmlFor="forename">Forenames: </label>
                    </div>
                    <div className="column2">
                        <input type="text" id="forename" name="forename" className="formInput"/>
                    </div>
                </div>
                <br/>
                <div className="row">
                    <div className="column1">
                        <label htmlFor="surname">Surname: </label>
                    </div>
                    <div className="column2">
                        <input type="text" id="surname" name="surname" className="formInput"/>
                    </div>
                </div>
                <br/>
                <div className="row">
                    <div className="column1">
                        <label htmlFor="dob">Date of birth: </label>
                    </div>
                    <div className="column2">
                        <input type="text" id="dob" name="dob" className="formInput"/>
                    </div>
                </div>
                <br/>
                <div className="row">
                    <input type="submit" id="submit" name="submit" className="formInput" />
                </div>
                <br/>
            </form>
        
 


    )
}


export default SearchForm;