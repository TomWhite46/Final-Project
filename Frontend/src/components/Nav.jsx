import {Link} from 'react-router-dom';

const Nav = () => {
    
    const changeTab = (e) => {
        document.querySelectorAll("nav > a").forEach(e => e.className = "inactive");
        e.target.className = "active";
    };
    
    return (
        <nav>
            <Link to="/" onClick={(e)=>changeTab(e)}>
            Biographical
            </Link>            
            <Link to="/bankDetails" onClick={(e)=>changeTab(e)}>
            Bank Details
            </Link>
            <Link to="/carInfo" onClick={(e)=>changeTab(e)}>
            Car Info
            </Link>
            <Link to="/telephone" onClick={(e)=>changeTab(e)}>
            Telephone
            </Link>
            <Link to="/associates" onClick={(e)=>changeTab(e)}>
            Associates
            </Link>
        </nav>
    )
}

export default Nav;