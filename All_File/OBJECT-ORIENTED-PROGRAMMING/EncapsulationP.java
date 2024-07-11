import java.util.Scanner;


class Encap{      ////the process of combine many element into Single entity is called Encapsulation
Scanner sc=new Scanner(System.in);
float a;
float b;
void display1(){
	System.out.println("Enter a:");
	a=sc.nextFloat();
	System.out.println("a="+a);
}
void display2(){
	System.out.println("enter the number of b:");
	b=sc.nextFloat();
	System.out.println("b="+b);
}
void show(){
	float c=a+b;
	System.out.println("the total number of c="+c);

}
}

class  EncapsulationP{
	public static void main(String[] args) {
		Encap e=new Encap();
		e.display2();
		e.display1();
		e.show();
	}
}