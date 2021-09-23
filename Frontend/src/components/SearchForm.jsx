import 'bootstrap/dist/css/bootstrap.min.css';

const SearchForm = ({setShowTable, setShowTabs}) => {
    
    const showTable = (e) => {
        e.preventDefault();
        setShowTable(true);
        setShowTabs(true);
    };
    
    return (
        
            <form className="searchForm" onSubmit={(e)=>showTable(e)}>
                <div class="row">
                    <div class="column1">
                        <label for="forename">Forenames: </label>
                    </div>
                    <div class="column2">
                        <input type="text" id="forename" name="forename" className="formInput"/>
                    </div>
                </div>
                <br/>
                <div class="row">
                    <div class="column1">
                        <label for="surname">Surname: </label>
                    </div>
                    <div class="column2">
                        <input type="text" id="surname" name="surname" className="formInput"/>
                    </div>
                </div>
                <br/>
                <div class="row">
                    <div class="column1">
                        <label for="dob">Date of birth: </label>
                    </div>
                    <div class="column2">
                        <input type="date" id="dob" name="dob" className="formInput"/>
                    </div>
                </div>
                <br/>
                <div class="row">
                    <input type="submit" id="submit" name="submit" className="formInput" />
                </div>
                <br/>
            </form>
        
 


    )
}


export default SearchForm;