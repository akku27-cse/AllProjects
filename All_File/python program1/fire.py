import turtle
from turtle import color
import random
def pen(color):
	turtle.color(color)
def fire(size):
	 for num in range(20):
	 	turtle.forward(size)
	 	turtle.rt(180-(360/20))
def move():
	turtle.penup()
	x=random.randint(-165,165)
	y=random.randint(-165,165)
	turtle.goto(x,y)
	turtle.pendown()
turtle.bgcolor('black')
turtle.speed(0)
colors=["red","yellow","green","blue","cyan","magenta","pink"]
for _ in range (30):
    color=random.choice(colors)
pen(color)


fire(random.randint(50,100))
move()
turtle.done()