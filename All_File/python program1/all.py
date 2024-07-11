# # #data type
# # """
# # name="akash"
# # roll=25
# # marks=41.3
# # print("type",type(name))
# # print("type",type(roll))
# # print("type",type(marks))

# # # if 
# # no=int(input("enter the number:"))
# # if no>0:
# # 	print("number is positve")
# # if no<0:
# # 	print("Number is negitive:")
# # if no==0:
# # 	print("number is zero")
# # 	""


# # #if else:
# # n=int(input("enter a number:"))
# # if n>=10:
# # 	print("number is 11 to unlimited")
# # else:
# # 	print("number up to 9")
# # 	""

# # # nested if

# # a=int(input("enter the number:"))
# # b=int(input("enter the second number:"))
# # c=int(input("Enter the third number:"))
# # if a>b:
# # 	if a>c:
# # 		print("largest",a)

# # if b>a:
# # 	if b>c:
# # 		print("largest",b)

# # if c>a:
# # 	if c>b:
# # 		print("largest",c)

# # ""
# # #if else lader
# # a=int(input("Enter a number:"))
# # b=int(input("Enter two number:"))
# # c=int(input("Enter third number:"))
# # if ((a>b) and (a<c)):
# # 	print("largest",a)
# # elif((b>c) and (b>c)):
# # 	print("largest",b)
# # elif((c>a) and (c>b)):
# # 	print("largest",c)
# # 	""

# #   # DATA SCIENCE
# # import numpy as np

# # import matplot.pyplot as plt 
# # x=np.arange(0,3*np.pi,0.1)
# # y=np.sin(x)
# # plt.title("sine wave from")
# # plt.plot(x,y)
# # plt.show()
# # """
# # # n=int//input("enter your name:")
# # # print(n)

# # #FOR
# # # for x in range(1,11):
# # # 	print(x)
# #  #for use string
# # """str="easy"
# # for x in str:
# # 	print(x)
# # 	""
# # #for use list
# # student=["rcky","anil","rudra"]
# # for x in student:
# # 	print(x)
# # 	""
# # #for table to any number
# # no=int(input("enter a number:"))
# # print("table of",no,"is given below")
# # for i in range (1,11):
# # 	print(i*no)
# # 	""


# # #for with else part

# # st=["anil","rudra","sam"]
# # for name in st:
# # 	print(name)
# # else:
# # 	print("this is not found")
# # ""
# # #else part ignore:
# # st=["anil","rudra","rabin"]
# # for name in st:
# # 	if name=="rudra":
# # 		break
# # 	else:
# # 		print(name)
# # else:
# # 	print("this is else block")
# # 	"""
# # 	"""
# # #while loop
# # i=1
# # while i<=15:
# # 	print(i)
# # 	i=i+1
# # 	"""
# # #fact of whiile loop
# # """

# # i=1
# # fact=1
# # no=int(input("Enter any number:"))
# # while i<=no:
# # 	fact=fact*i
# # 	i=i+1
# # print("fact",no,fact)

# # """

# #   # LIST
# # list=["akash","sum","jum"]
# # print(list)

#   # LIST//acess valaue use loop
#   """
# list=['akash','rum','sum']
# for i in list:
# 	print("my name is",i)
# """
# # update 
# list=["a","b","c"]
# print("aftaer update",list)
# list[1]=["d"]
# print(list)

#add item in list
# list=["a","b","c"]
# print("aftaer update",list)
# list.append("d")
# print(list)


#add item of particular item

# list=["a","b","c"]
# print("aftaer update",list)
# list.insert(3,"d")
# print(list)

#delete item in list

# list=["a","b","c"]
# print("aftaer update",list)
# list.remove("b")
# print(list)

#pop 
# list=["akash","rum","sum"]
# list.pop()
# print(list)
# print("delete sucess fully")

#del key word
# list=["akash","ram","sum"]
# del list
# print("delete sucessfully")

#clear
# list=["akash","ram","sum"]
# list.clear()
# print("sucessfully")


#copy
# list1=["akash","ram","sum"]
# print("before the copy:",list)
# list2=list1.copy()
# print("after copy:",list2)

# join two list
# list=["akash","ram","sum"]
# list2=["santu","mantu","roy"]
# print(list)
# print(list2)
# list3=list2+list
# print(list3)

#join two item use extend
# list1=["akash","ram"]
# list2=["ram","sam"]
# list1.extend(list2)
# print(list1)


#join two table use append 
list1=["akash","ram"]
list2=["ram","sam"]
for i in list2:
	list1.append(i)
print(list1)



