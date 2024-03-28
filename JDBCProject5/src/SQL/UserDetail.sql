CREATE TABLE UserDetailDB
(
    firstName VARCHAR(50),
    lastName VARCHAR(50),
    email VARCHAR(50),
    account VARCHAR(50),

    FOREIGN KEY (account) REFERENCES account (username)

);