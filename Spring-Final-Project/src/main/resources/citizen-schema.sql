
drop table if exists citizen CASCADE;
 
CREATE TABLE citizen (
	citizen_id BIGINT PRIMARY KEY,
	forenames VARCHAR(64),
    surname VARCHAR(64),
    home_address VARCHAR(255),
    dob VARCHAR(64),
    place_of_birth VARCHAR(64),
    sex VARCHAR(16)
    );