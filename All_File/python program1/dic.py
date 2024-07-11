# student={
# 	"name":"amisha\n",
# 	"roll":305,
# 	"persent":85.5,
# }
# print("student:\n:",student)
# student1=student.copy()
# print("student1:\n",student1)
from tkinter import*
top=tkinter()
top.geometry("200*150")
top['bg']="#51E1DC"
def myFun():
 sel="selected value="+str(var.get())
 label.config(tex=sel)
var=intvar()
scale(top,variable=var,from_=10,to=20,orient=horizontal).pack(anchor=center,pady=5)
button(top,text="value",command=myFun).pack()
label=label(top)
label.pack()
top.mainloop()
  
  from import tkinker
  top=scale;
  and b=j;
  i++;
    