import random
x="y"

while x=="y":
	random_number=random.randint(1,2)

	if random_number==1:
		print('[---------]')
		print('[         ]')
		print('[    0    ]')
		print('[         ]')
		print('[---------]')
	elif random_number==2:
		print('[---------]')
		print('[ 0       ]')
		print('[         ]')
		print('[       0 ]')
		print('[---------]')
  #   elif random_number==3:
  #   	print('[---------]')
		# print('[    0    ]')
		# print('[ 0     0 ]')
		# print('[         ]')
		# print('[---------]')
	# elif random_number==4:
 #    	print('[         ]')
	# 	print('[    0    ]')
	# 	print('[ 0     0 ]')
	# 	print('[    0    ]')
	# 	print('[---------]')
	# elif random_number==5:
 #    	print('[---------]')
	# 	print('[    0    ]')
	# 	print('[ 0     0 ]')
	# 	print('[ 0    0  ]')
	# 	print('[---------]')
	# elif random_number==6:
 #    	print('[---------]')
	# 	print('[    0    ]')
	# 	print('[ 0     0 ]')
	# 	print('[0   0 0  ]')
	# 	print('[---------]')
x=input("press y to roll again and press anothe key for exit:")