import turtle as t
playerAscore=0
playerBscore=0

window=t.Screen()
window.title("pong game")
window.bgcolor('green')
window.setup(width=800,height=600)
window.tracer(0)



leftpaddel=t.Turtle()
leftpaddel.speed(0)
leftpaddel.shape("square")
leftpaddel.color("white")
leftpaddel.shapesize(stretch_wid=5,stretch_len=1)
leftpaddel.penup()
leftpaddel.goto(-350,0)

rightpaddel=t.Turtle()
rightpaddel.speed(0)
rightpaddel.shape("square")
rightpaddel.color("white")
rightpaddel.shapesize(stretch_wid=5,stretch_len=1)
rightpaddel.penup()
rightpaddel.goto(350,0)


ball=t.Turtle()
ball.speed(0)
ball.shape("circle")
ball.color("red")
ball.penup()
ball.goto(5,5)
ballxdirection=0.2
ballydirection=0.2


pen=t.Turtle()
pen.speed(0)
pen.color("blue")
pen.penup()
pen.hideturtle()
pen.goto(0,260)
pen.write("score",align="center",font=("arial",24,"normal"))

def leftpaddelup():
	y=leftpaddel.ycor()
	y=y+90
	leftpaddel.sety(y)

def leftpaddeldown():
	y=leftpaddel.ycor()
	y=y+90
	leftpaddel.sety(y)


def rightpaddelup():
	y=rightpaddel.ycor()
	y=y+90
	rightpaddel.sety(y)

def rightpaddeldown():
	y=rightpaddel.ycor()
	y=y+90
	rightpaddel.sety(y)

window.listen()
window.onkeypress(leftpaddelup,'w')
window.onkeypress(leftpaddeldown,'s')
window.onkeypress(rightpaddelup,'r')
window.onkeypress(rightpaddeldown,'t')


while True:
	window.update()

ball.setx(ball.xcor()+ballxdirection)
ball.sety(ball.ycor()+ballydirection)


if ball.ycor()>290:
	ball.sety(290)
	ballydirection=ballydirection*-1

if ball.ycor()<-290:
	ball.sety(-290)
	ballydirection=ballydirection*-1

if ball.xcor()>390:
	ball.goto(0,0)
	ballxdirection=ballxdirection*-1
	playerBscore=playerBscore+1
	pen.clear()
	pen.write("player A{}     player B{}".format(playerAscore,playerBscore),align='center',font=("arial",24,"normal"))

if ball.xcor()<-390:
	ball.goto(0,0)
	ballxdirection=ballxdirection*-1
	playerAscore=playerAscore+1
	pen.clear()
	pen.write("player A{}     player B{}".format(playerAscore,playerBscore),align='center',font=("arial",24,"normal"))

if (ball.xcor()>340)&(ball.xcor()<350)&(ball.ycor()<rightpaddel.ycor()+40 and ball.ycor()>rightpaddel.ycor()-40):
	ball.setx(340)
	ballxdirection=ballxdirection*-1

if (ball.xcor()>-340)&(ball.xcor()<-350)&(ball.ycor()<leftpaddel.ycor()+40 and ball.ycor()>leftpaddel.ycor()-40):
	ball.setx(-340)
	ballxdirection=ballxdirection*-1