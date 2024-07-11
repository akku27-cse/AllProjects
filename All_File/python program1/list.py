list1=[10,21,4,45,66,93,1]
Ecount,sum=0,0;
for num in list1:
	if(num%2)==0:
		print(num," ")
		Ecount +=1
		sum=sum+num
		print("Even number in the list:",Ecount)
		print('sum of all even number ',sum)