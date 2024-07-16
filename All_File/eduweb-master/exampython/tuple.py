"""Write a program to create a tuple with 5 different values then convert the tuple into list. Then 
append one number 333 into list and remove one of the existing items from the list except 333 
then display the list."""

int_tuple=(14,147,54,79,58)
#print(int_tuple)
int_list=list(int_tuple)
print(int_list)
int_list.append(333)
print(int_list)
int_list.remove(147)
print(int_list)