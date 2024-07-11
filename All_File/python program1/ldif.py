lst=[]
print(lst)
lst.append(5)
print(lst)
lst.extend([7,8,9,12])
print(lst)
lst.extend([1,2,3,4])
print(lst)

del lst[3:5]
print(lst)
lst.remove(1)
print(lst)
lst.pop(2)
print(lst)
lst.sort()
print(lst)
lst.reverse()
print(lst) 