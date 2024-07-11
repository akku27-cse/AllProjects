# fruit_list=["apple","orange","mango"]
# print(" length of fruit list",len(fruit_list))
# # for name in fruit_list:

# # 	print("i like",name)


### add item into list
# fruit_list=["apple","orange","banna"]
# print("before add:")
# print(fruit_list)
# fruit_list.append("mango")
# print("after add:")
# print(fruit_list)


# add item particulr index
# fruit_list=["apple","orange","banna"]
# print("before add:")
# print(fruit_list)
# fruit_list.insert(0,"mango")
# print("after add:")
# print(fruit_list)


# delet item into list
# fruit_list=["apple","orange","banna"]
# print("before delet:")
# print(fruit_list)
# fruit_list.remove("apple")
# print("after delet:")
# print(fruit_list)

#elet use index

# fruit_list=["apple","orange","banna"]
# print("before delet:")
# print(fruit_list)
# fruit_list.pop(-2)
# print("after delet:")
# print(fruit_list)

#del key word use

# fruit_list=["apple","orange","banna"]
# print("before add:")
# print(fruit_list)
# del fruit_list[-2]
# print("after add:")
# print(fruit_list)

#clear all data

# fruit_list=["apple","orange","banna"]
# print("before add:")
# print(fruit_list)
# fruit_list.clear()
# print("after add:")
# print(fruit_list)

#copy data one into another
# list1=["apple","orange","banna"]
# print("list 1 item:")
# print(list1)
# list2=list1.copy()
# print("list2 item:")
# print(list2)

#extend join 

# list1=["apple","orange","banna"]
# list2=["chear","mango","melon"]
# list1.extend(list2)
# print("list item")
# print(list1)

# join two item use append function
list1=["apple","orange","banna"]
list2=["chear","mango","melon"]
for name in list2:
   list1.append(name)
print("list item")
print(list1)