create TABLE student(
Id number primary key,
Name varchar(255),
Gmail varchar(100) unique,
Address varchar(100)
);


--for view table is create or not
desc student;

--out put
/*TABLE STUDENT

Column	Null?	Type
ID	NOT NULL	NUMBER
NAME	 - 	VARCHAR2(255)
GMAIL	 - 	VARCHAR2(100)
ADDRESS	 - 	VARCHAR2(100)*/