import Transaction from "./Transaction";

const Bankcard = () => {
    return (
        <>
        <div className="dataDisplay">
            <table id="dataTable">
                <tbody>
                    <tr>
                        <td>Sort code</td>
                        <td>[data]</td>
                    </tr>
                    <tr>
                        <td>Card number</td>
                        <td>[data]</td>
                    </tr>
                </tbody>
            </table>
            <table>
                <tbody>
                    <tr>
                        <Transaction/>
                    </tr>
                    <tr>
                        <Transaction/>
                    </tr>
                </tbody>
            </table>
        </div>
        </>

    )
}

export default Bankcard;