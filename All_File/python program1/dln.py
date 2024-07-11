class node:
	def init(self,data):
		self.data=data
		self.next=none
class linklist:
	def init(self):
		self.head=none
	def push(self,new_data):
		new_node=node(new_data)
		new_node.next=self.head
		self.head=new_node
	def delet(self,key):
		temp=self.head
		if (temp is not none):
			if (tem.data==key):
				self.head=temp.next
				temp=none
				return
		while (temp is not none):
			if temp.data==key:
				break
				prev=temp
				temp=temp.next
		if (temp==none):
			return
			prev.next=temp.next
			temp=none
	def printlist(self):
		temp=self.head
		while (temp):
			print("%d"%(tem.data))
			temp=temp.next
    llist = linklist ( )
	llist.push(7)
	llist.push(1)
	llist.push(3)
	llist.push(2)

			print("created linked list:")
	llist.printlist()
	llist.delet(1)
	        print("\n linked list after delection 1:")
	llist.printlist()
			