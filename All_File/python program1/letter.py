import turtle
Happy=turtle.Screen()
Happy.bgcolor("black")
turtle=turtle.Turtle()
turtle.shape("arrow")
turtle.color("peru")
turtle.width(7)
colors=["peru","ivory","white","dark","orange","coral","cyan","hot","pink","gold","yellow","red","green","blue","light blue","light green"]
def f1():
	for i in range(7):
		turtle.pensize(5)
		turtle.pencolor("light blue")
		turtle.color(colors[1%19])
		turtle.begin_fill()
		turtle.left(330)
		turtle.forward(55)
		turtle.begin_fill()
		turtle.rt(110)
		turtle.circle(33)
		turtle.end_fill()
		turtle.rt(11)
		turtle.backward(33)
		turtle.end_fill()

def cake(x,y):
	turtle.fd(x)
	turtle.rt(90)
	turtle.fd(y)
	turtle.rt(90)
	turtle.fd(x)
	turtle.rt(90)
	turtle.fd()
      
def move(x,y):
	turtle.up()
	turtle.setposition(0,0)
	turtle.setheading(90)
	turtle.rt(90)
	turtle.fd(x)
	turtle.lt(90)
	turtle.fd(y)
	turtle.pendown()

def mov(x,y):
	turtle.up()
	turtle.setposition(0,0)
	turtle.setheading(90)
	turtle.lt(90)
	turtle.fd(x)
	turtle.rt(90)
	turtle.fd(y)
	turtle.pendown()

def A(size):
	turtle.rt(16)
	turtle.forward(size)
	turtle.rt(150)
	turtle.fd(size)
	turtle.backward(size/2)
	turtle.rt(105)
	turtle.fd(size/3)

def B():
	turtle.forward(60)
	turtle.rt(90)
	for i in range(18):
		turtle.rt(9)
		turtle.fd(3)
	for i in range(18):
		turtle.rt(13)
		turtle.backward(3)

def C():
	turtle.circle(2)
	for i in range(40):
		turtle.lt(5)
		turtle.backward(5)

def H(size):
	turtle.fd(60)
	turtle.backward(30)
	turtle.rt(90)
	turtle.fd(30)
	turtle.lt(90)
	turtle.fd(30)
	turtle.backward(60)

def P():
	turtle.fd(60)
	turtle.rt(90)
	turtle.fd(7)
	for i in range(8):
		turtle.rt(20)
		turtle.fd(5)

def Y():
	turtle.fd(60)
	turtle.backward(30)
	turtle.rt(90)
	turtle.fd(30)
	turtle.lt(90)
	turtle.fd(30)
	turtle.backward(60)
def R():
	turtle.fd(60)
	turtle.backward(30)
	turtle.rt(90)
	turtle.fd(30)
	turtle.lt(90)
	turtle.fd(30)
	turtle.backward(60)
def N():
	turtle.fd(60)
	turtle.backward(30)
	turtle.rt(90)
	turtle.fd(30)
	turtle.lt(90)
	turtle.fd(30)
	turtle.backward(60)

def E():
	turtle.fd(60)
	turtle.backward(30)
	turtle.rt(90)
	turtle.fd(30)
	turtle.lt(90)
	turtle.fd(30)
	turtle.backward(60)
def W():
	turtle.fd(60)
	turtle.backward(30)
	turtle.rt(90)
	turtle.fd(30)
	turtle.lt(90)  
	turtle.fd(30)
	turtle.backward(60)


turtle.width(9)
turtle.pencolor("white")
mov(325,400)
H(104)
mov(220,400)
A(90)
mov(200,400)
P()
mov(180,400)
Y(90)
turtle.pencolor("blue")
mov(220,400)
N(90)
mov(200,400)
E(80)
mov(180,400)
W(85)
move(100,300)
Y(90)
move(28,300)
E()
move(52,300)
A(90)
move(12,300)
R()
mov(120,400)
turtle.color(colors[8%5])
turtle.begin_fill()
cake(40,160)
turtle.end_fill()
mov(100,470)
turtle.color("yellow")
turtle.begin_fill()
cake(40,140)
turtle.end_fill()
mov(30,510)
turtle.width(11)

































