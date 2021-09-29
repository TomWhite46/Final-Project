import axios from 'axios';
import 'bootstrap/dist/css/bootstrap.min.css';

const SearchFormReg = ({setShowTable, setShowTabs, setSearchResults, url}) => {
    
    const submitForm = (e) => {
        e.preventDefault();

        const reg = e.target.reg.value;

        if (reg === "") {
            alert("Please enter data in the car registration field.");
            return;
        }

        setShowTable(true);
        
        axios.get(`${url}/findPersonByReg/${reg}`) 
            .then(({data}) => {        
                setSearchResults(data);
            })
            .catch (err => console.log(err));
    };
    
    return (
        
            <form className="searchForm" onSubmit={(e)=>submitForm(e)}>
                <div className="row">
                    <div className="column1">
                        <label for="reg">Registration Number: </label>
                    </div>
                    <div className="column2">
                        <input type="text" id="reg" name="reg" className="formInput"/>
                    </div>
                </div>
                <br/>
                <div className="row">
                    <input type="submit" id="submitReg" name="submitReg" className="formInput" />
                </div>
                <br/>
            </form>
        
    )
}


export default SearchFormReg;