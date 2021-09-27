import Bankcard from "./elements/Bankcard";

const FinancialTransactions = () => {
    return (
        <div className="dataDisplay">Bank cards associated with individual:
            {/* {bankCards.map(({cardNumber, sortCode, eposTransactions}) => <Bankcard cardNumber={cardNumber} sortCode={sortCode} eposTransactions={eposTransactions}/>)} */}
            <Bankcard/>
        </div>
    )
}

export default FinancialTransactions;