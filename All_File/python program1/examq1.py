# # def function(x,y,z):
# # 	sum=x+y
# # 	if x==y==z:
# # 	  sum=sum*3
# #       return sum
# # 		print(function(1,2,3))
# # 		print(function(3,3,3))
#  lst=[" "]
#  num=int(input("how many number:"))
#  for n in range(num):
#  	number=int(input("enter number:"))
#  	lst.append(number)
#  	print("sum of element in given is",sum(lst))



from turtle import*
import turtle
color('red','blue')
turtle.bgcolor('black')
begin_fill()
while True:
	forward(200)
	left(170)
	if abs(pos())<1:
		break
		end_fill()
		done()