drop table if exists person_partner, person CASCADE;


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
    
CREATE TABLE person_partner (
	person_id BIGINT,
    partner_id BIGINT,
    FOREIGN KEY (person_id) REFERENCES person(person_id),
    FOREIGN KEY (partner_id) REFERENCES person(person_id)    
    );
    
    
