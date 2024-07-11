//def:- one name many from ...we ca say this type of progarmming one function is use to perfrom may task
// this example also function over loading or compile time eror ==> same name and different parameter is call function overloading;
//run time error means :its error define at run time 

import java.util.Scanner;
class polymor{
	Scanner sc=new Scanner(System.in);
	void first(int a){
		//System.out.println("Eneter the value of a");
		//a=sc.nextInt();
		System.out.println("a="+a);
	}
	void first(int c,int b)
{
	// System.out.println("Eneter the value of b:");
	// b=sc.nextInt();
	// System.out.println("enter the value of c:");
	// c=sc.nextInt();
	int z=b+c;
	System.out.println(z);

}
}

class  Poly{
	public static void main(String[] args) {
		polymor p=new polymor();
		p.first(4,5);
		p.first(9);
	}
}