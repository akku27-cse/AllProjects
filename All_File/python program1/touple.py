# fruit_touple=("apple","orange","mango")
# print("i like:",fruit_touple[0])
# print("i like:",fruit_touple[2])

# int_touple=(5,6,8,7,4,8,9,7)
# print(int_touple[1:4])

    fruit_touple=("apple","orange","mango")
    print("touple before updation:",fruit_touple)
    fruit_list=list(fruit_touple)
# for name in fruit_touple:
# 	print(" i like:",name)
	fruit_list[1]="banna"
	fruit_touple=tuple(fruit_list)
	print("tuple after updation:",fruit_touple)