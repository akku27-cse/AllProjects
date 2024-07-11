--in : it is use for allow to soecify multipule values in where clause 


select address from student where address in ('dakshin narikelda','nimtouri');
select * from student where address in ('tamluk','dimari','nimtouri');
/*out put
ID	NAME	ADDRESS	PH
6	diya jana	tamluk	894500461
7	sucheta hazra	dimari	7845007381
*/

--not in:not preasentr the given value


select * from student where address not in ('Dakshin Narikelda','tamluk');

/*output
ID	NAME	ADDRESS	PH
3	Megha samanta	 nimtouri	8933667301
4	tithi mondol	kulberiya	7895007301
5	sayani samanta	moyna	8921887301
7	sucheta hazra	dimari	7845007381
8	ayshi maity	bagnan	8945782301
9	Swastika Panda	Kolaghat	6945007402
*/




--betwwn:this command is use for select values with in a given range
select * FROM student where id BETWEEN 1 and 4;

/* output
ID	NAME	ADDRESS	PH
1	Santu Jana	Dakshin Narikelda	8945007301
2	Deye mukherjee	Dakshin Narikelda	7319216422
3	Megha samanta	 nimtouri	8933667301
4	tithi mondol	kulberiya	7895007301
*/