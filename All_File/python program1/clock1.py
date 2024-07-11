from tkinter import*
from tkinter.ttk import* 
from time import strftime
root=Tk()
root.title("clock")
def time():
	string=strftime("%H:%M:%s %p")
	label.config(text=string)
	label.after(1000,time)
mainloop()