

INSERT INTO USER(user_id,username, password, name) VALUES (1,'CATFOSTER', '1234', 'Mark Bark');
INSERT INTO USER(user_id, username, password, name) VALUES(2, 'DogHelper', '4455', 'Harry Rover');
INSERT INTO PET(pet_id, pet_name, pet_type, pet_age, rescue_agency, location, profile_picture, user_id)VALUES(1, 'Fuzzy', 'Cat', 'Kitten', 'Faithful Friends', '19711', 'assets/fuzzy.jpg', 1);
INSERT INTO PET(pet_id, pet_name, pet_type, pet_age, rescue_agency, location, profile_picture, user_id)VALUES(2,'Samuel', 'Dog', 'Adult', 'Faithful Friends', '19711', 'assets/samuel.jpg', 2 );