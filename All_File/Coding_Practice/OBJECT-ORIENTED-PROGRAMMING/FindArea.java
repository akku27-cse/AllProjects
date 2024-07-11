// today (this)//(class)//(object)(constructor)=====> completed
//=================================find all area use class,obj,and constructor
class Find{
	int  height;
	int weight;
	int total;
	Find(){ // create constuctor  //imp note:
		//1.it name same as class name 2.it has no return type//  3.i atomatically invoked wheen obj is created.....

       
	}
	void Circle(int x,int y){   //pass parameter in function
     this.height=x;
     this.weight=y;
     this.total=height+weight;
     System.out.println("area of Circle is="+total);
	}

	void Rect(int x,int y){
		this.height=x;
		this.weight=y;
		this.total=2*height*weight;
		System.out.println("area of rect is="+total);
			}
}
class FindArea{
	public static void main(String[] args) {
		Find obj=new Find();
		obj.Circle(7,8);
		obj.Rect(8,7);
	}
}