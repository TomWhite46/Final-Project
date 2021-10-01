const AtmTransaction = ({timestamp, type, amount, atmId}) => {
    return (
        <tr>
            <td>{timestamp}</td>
            <td>{type}</td>
            <td>£{amount}</td>
            <td>{atmId}</td>
        </tr>
    )
}

export default AtmTransaction;