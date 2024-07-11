import turtle
mypen=turtle.Turtle()
mypen.shape('turtle')
mypen.speed(10)
window=turtle.Screen()
window.bgcolor('black')
rainbow=['red','orange','yellow','green','blue','indigo','violet','pink','gray']
size=180
mypen.penup()
mypen.goto(0,-180)
for color in rainbow:
	mypen.color(color)
	mypen.fillcolor(color)
	mypen.begin_fill()
	mypen.circle(size)
	mypen.end_fill()
	size-=20
turtle.done()
mypen.hideshape()
