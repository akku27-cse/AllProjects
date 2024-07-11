// createing class
class FirstC{
	int x=10;
	int y=8;
	int z;
	z=x+y;
	void display(){
	System.out.print("sum"+z);
}
}
class First{
	public static void main(String[] args) {
		
	
	FirstC fc=new FirstC();//creating constructor and create object
    fc.display();
}
}

