import Transaction from "./Transaction";

const Bankcard = () => {

    const showHideTable = ({target}) => {
        const subData = target.parentElement.children[2];
        if (subData.className==="hide") {
            console.log("yes");
            subData.className = "show";
            target.innerText = "Hide associated transactions \u25B2"
        } else {
            console.log("no");
            subData.className = "hide";
            target.innerText = "Show associated transactions \u25BC"
        }
    }

    return (
        <>
        <div>
            <table class="dataTable">
                <tbody>
                    <tr>    
                        <td>Bank card number</td>
                        <td>[data]</td>
                    </tr>
                    <tr>
                        <td>Sort code</td>
                        <td>[data]</td>
                    </tr>
                </tbody>
            </table>
            <div class="dropDownButton" onClick={(e)=>showHideTable(e)}>Show associated transactions &#x25BC;</div>
            <div className="hide">
                <Transaction/>
                <Transaction/>
            </div>
        </div>
        </>

    )
}

export default Bankcard;