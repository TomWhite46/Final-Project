import {Link} from 'react-router-dom';

const Nav = () => {
    
    const changeTab = (e) => {
        document.querySelectorAll("nav > a").forEach(e => e.className = "inactive");
        e.target.className = "active";
        document.querySelector("#currentPerson").scrollIntoView({behavior: "smooth"}); 
    };
    
    return (
        <nav>
            <Link to="/biography" onClick={(e)=>changeTab(e)}>
            Biographical
            </Link>            
            <Link to="/addresses" onClick={(e)=>changeTab(e)}>
            Addresses
            </Link>
            <Link to="/financialTransactions" onClick={(e)=>changeTab(e)}>
            Financial Transactions
            </Link>
            <Link to="/carInfo" onClick={(e)=>changeTab(e)}>
            Vehicles
            </Link>
            <Link to="/telephone" onClick={(e)=>changeTab(e)}>
            Telephones
            </Link>
            <Link to="/associates" onClick={(e)=>changeTab(e)}>
            Associates
            </Link>
            <Link to="/locations" onClick={(e)=>changeTab(e)}>
            Locations
            </Link>
        </nav>
    )
}

export default Nav;