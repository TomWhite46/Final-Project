
drop table if exists person CASCADE;
 
CREATE TABLE person (
	is_citizen VARCHAR(5),
    person_id BIGINT PRIMARY KEY,
    surname VARCHAR(64),
    place_of_birth VARCHAR(64),
    sex VARCHAR(16),
    nationality VARCHAR(64),
    dob VARCHAR(64),
    forenames VARCHAR(64)
    );
    
