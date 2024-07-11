/*
1.add column
2.delete column
3.rename column
4.modify datatype
*/
 

 --add column 
 ALTER table student add phone number(10);

 --out put
 desc student;
 --output 
 /*TABLE STUDENT
Result Set 1

Column	Null?	Type
ID	NOT NULL	NUMBER
NAME	 - 	VARCHAR2(255)
GMAIL	 - 	VARCHAR2(100)
ADDRESS	 - 	VARCHAR2(100)
PHONE	 - 	NUMBER(10,0)
*/



--2.drop column 
alter table student drop column gmail;

--out put
 desc student;
 --output 
 /*TABLE STUDENT
Result Set 1

Column	Null?	Type
ID	NOT NULL	NUMBER
NAME	 - 	VARCHAR2(255)
ADDRESS	 - 	VARCHAR2(100)
PHONE	 - 	NUMBER(10,0)
*/

--3.rename column
alter table student rename column phone to ph;



--out put
 desc student;
 --output 
 /*TABLE STUDENT
Result Set 1

Column	Null?	Type
ID	NOT NULL	NUMBER
NAME	 - 	VARCHAR2(255)
ADDRESS	 - 	VARCHAR2(100)
PH	 - 	NUMBER(10,0)
*/
