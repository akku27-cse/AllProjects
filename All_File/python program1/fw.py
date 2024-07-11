import turtle
import random


wn=turtle.Screen()
wn.setup(500,500)
wn.bgcolor('black')


myTurtle=turtle.Turtle()
myTurtle.speed(0)
myTurtle.hideturtle()



colors=['red','green','blue','yellow','orange','silver','purple','pink','gold','violet','magenta']



def draw_fv(t):
	x=random.randint(-200,200)
	y=random.randint(-200,200)
	t.penup()
	t.goto(x,y)
	t.pendown()
	t.color(random.choice(colors))
	d=random.randint(20,100)


	for i in range(36):
		t.forward(d)
		t.backward(d)
		t.right(10)


for i in range(10):
	draw_fv(myTurtle)

myTurtle.penup()
myTurtle.goto(0,200)
myTurtle.color('white')
myTurtle.write('DEYA',align='center',font=('verdana',24,'normal'))
