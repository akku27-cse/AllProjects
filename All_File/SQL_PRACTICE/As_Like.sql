--like : like operator is use  in a where clause to search for a specified pattern or a column
--a% stratring %a=end character,-a%=second position,a_% second last,
SELECT * from student WHERE name  like 'S%';

/*output
ID	NAME	ADDRESS	PH
1	Santu Jana	Dakshin Narikelda	8945007301
9	Swastika Panda	Kolaghat	6945007402
*/
