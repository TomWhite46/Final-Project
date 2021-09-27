import Phone from "./elements/Phone";

const Telephone = () => {
    return (
        <>
            <div className="dataDisplay">Telephones associated with individual:
                <Phone/>
                <Phone/>
            </div>
        </>
    )
}

export default Telephone;