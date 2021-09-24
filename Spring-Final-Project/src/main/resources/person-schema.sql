
drop table if exists person CASCADE;
 
create table person (
	person_id bigint PRIMARY KEY,
	is_citizen varchar(5), 
	surname varchar(64), 
	place_of_birth varchar(64), 
	sex varchar(16),
	nationality varchar(64),
	dob date,
	forenames varchar(64)
);