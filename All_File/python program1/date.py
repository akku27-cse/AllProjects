# import datetime
# date_obj=datetime.time.now()
# print("current date",date_obj)
# import turtle
# turtle.forward(160)
# turtle.done()
import turtle
import time
def function():
	 colors=["red","blue","yellow","green","pink"]
t=turtle
t.pensize(5)
t.bgcolor('black')
t.speed(1000)
for x in range(360):
	 t.pencolors(colors[x%len(colors)])
	 t.pensize(x/50)
	 t.forward(x)
	 t.left(59)
	 function()
	 time.sleep(5)