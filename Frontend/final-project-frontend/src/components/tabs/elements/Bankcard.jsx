const Bankcard = ({cardNumber, sortCode}) => {
    return (
                    <tr>    
                        <td>{cardNumber}</td>
                        <td>{sortCode}</td>
                    </tr>
    )
}

export default Bankcard;