import axios from 'axios';
import 'bootstrap/dist/css/bootstrap.min.css';

const SearchFormLoc = ({setShowTable, setShowTabs, setSearchResults, url}) => {
    
    const submitForm = (e) => {
        e.preventDefault();        
        const time = e.target.time.value.replace('T', ' ') + ":00";
        const latitude = e.target.latitude.value;
        const longitude = e.target.longitude.value;
        
        console.log(time);

        setShowTabs(false);
        setSearchResults("loading")
        setShowTable(true);
        
        axios.get(`${url}/findPersonByLocation/${time}/${latitude}/${longitude}`) 
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
                        <label htmlFor="time">Time: </label>
                    </div>
                    <div className="column2">
                        <input type="datetime-local" id="time" name="time" className="formInput"/>
                    </div>
                </div>
                <br/>
                <div className="row">
                    <div className="column1">
                        <label htmlFor="latitude">Latitude: </label>
                    </div>
                    <div className="column2">
                        <input type="text" id="latitude" name="latitude" className="formInput"/>
                    </div>
                </div>
                <br/>
                <div className="row">
                    <div className="column1">
                        <label htmlFor="longitude">Longitude: </label>
                    </div>
                    <div className="column2">
                        <input type="text" id="longitude" name="longitude" className="formInput"/>
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


export default SearchFormLoc;