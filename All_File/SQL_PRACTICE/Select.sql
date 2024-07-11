--select statement is use to select data from data base

select * FROM student;
-- output 
SELECT * FROM student;

/*

Result Set 2

ID	NAME	ADDRESS	PH
1	Santu Jana	Dakshin Narikelda	8945007301
2	Deye mukherjee	Dakshin Narikelda	7319216422
3	Megha samanta	 nimtouri	8933667301
4	tithi mondol	kulberiya	7895007301
5	sayani samanta	moyna	8921887301
6	diya jana	tamluk	894500461
7	sucheta hazra	dimari	7845007381
8	ayshi maity	bagnan	8945782301
9	Swastika Panda	Kolaghat	6945007402
10	MadhuMita jana	Mechada	8945078301
*/

--select distnict and chse row

select DISTINCT Address from student;

/*out put
ADDRESS
 nimtouri
tamluk
bagnan
Dakshin Narikelda
moyna
dimari
kulberiya
Kolaghat
*/