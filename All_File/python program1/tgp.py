import random
import turtle
def inscreen(win,turt):
	leftBound=-win.window_width()/2
	rightBound=-win.window_width()/2
	topBound=-win.window_height()/2
	bottomBound=-win.window_height()/2
	turtleX=turt.xcor()
	turtleY=turt.ycor()
	stillIn=True
	if turtleX>rightBound or turtleX<leftBound:
		stillIn=False
	if turtleY>topBound or turtleY<bottomBound:
		stillIn=False
	return stillIn

def sameposotion(Red,Blue):
	if Red.pos()==Blue.pos():
		return False
	else:
		return True

def main():
	wn=turtle.Screen()
	Red=turtle.Turtle()
	Red.pencolor("red")
	Red.pensize(5)
	Red.shape('turtle')
	pos=Red.pos()
	Blue=turtle.Turtle()
	Blue.pensize("blue")
	Blue.pensize(5)
	Blue.shape("turtle")
	Blue.hideturtle()
	Blue.penup()
	Blue.goto(pos[0]+50,pos[1])
	Blue.showturtle()
	Blue.pendown()
	mT=True
	jT=True
	while mT and jT and sameposotion(Red,Blue):
		coinRed=random.randrange(0,2)
		angleRed=90
		if coinRed==0:
			Red.left(angleRed)
		else:
			Red.right(angleRed)

		coinBlue=random.randrange(0,2)
		angleBlue=90
		if coinBlue==0:
			Blue.left(angleBlue)
		else:
			Blue.right(angleBlue)
		Red.forward(50)
		Blue.forward(50)
		mT=inscreen(wn,Blue)
		jT=inscreen(wn,Red)

	Red.pencolor("black")
	Blue.pencolor("black")
	if jT==True and mT==False:
		Red.write("Red Won",True,align="center",font=("arial",15,"bold"))

	elif mT==True and jT==False:
		Blue.write("Blue Won",True,align="center",font=("arial",15,"bold"))
	else:
		Red.write("Draw",True,align="center",font=("arial",15,"bold"))
		Blue.write("Draw",True,align="center",font=("arial",15,"bold"))
	wn.exitonclick()
main()
