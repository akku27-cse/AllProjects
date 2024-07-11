--and:it is use to filetr record based on more then condition like 
-- duto condition ei true hole execute korbe 

SELECT * FROM student where id=1 and name='megha samnta';
-- here 1=santu so no  match thats why it retuen no found data
 

 SELECT * FROM student where name='santu jana' and id=1;
 /*otput
 ID	NAME	ADDRESS	PH
1	Santu Jana	Dakshin Narikelda	8945007301
*/

--or: it display the records if one condition are true

SELECT * FROM student where id=1 or name='megha samnta';