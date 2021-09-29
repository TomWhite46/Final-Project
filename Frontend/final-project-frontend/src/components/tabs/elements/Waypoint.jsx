const Waypoint = ({timestamp, latitude, longitude}) => {
    return (
                    <tr>    
                        <td>{timestamp}</td>
                        <td>{latitude}</td>
                        <td>{longitude}</td>
                    </tr>
    )
}

export default Waypoint;