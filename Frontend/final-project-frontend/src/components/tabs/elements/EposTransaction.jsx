const EposTransaction = ({timestamp, amount, payee}) => {
    return (
        <tr>
            <td>{timestamp}</td>
            <td>£{amount}</td>
            <td>{payee}</td>
        </tr>
    )
}

export default EposTransaction;