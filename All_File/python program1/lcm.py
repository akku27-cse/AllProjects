# no1=int(input("Enter the first Number:"))
# no2=int(input("Enter the second Number:"))
# i=1
# while i>=1:
#  if i%no1==0 and i%no2==0:
#  	print("LCM of {} and {} is {}:".format(no1,no2,i))
#  	break
# i+=1

 def calculate_lcm(x,y):
 	if x>y:
 		greater=x
	else:
		greater=y
		while (true):
	if greater%x == 0 & greater%y == 0:
 				lcm=greater
 				break
 				greater+=1
 				return lcm
 				num1=int(input("enter first Number:"))
 				num2=int(input("enter second Number:"))
 				print("the lcm of ",num1,"and",num2,"is",calculate_lcm(num1,num2))
 	