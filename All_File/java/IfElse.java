import java.util.Scanner;
class IfElse{

	public static void main(String[] args) {

		Scanner obj=new Scanner(System.in);
		
		int x;
		System.out.println("Enter any number:");
		x=obj.nextInt();
		/*if(x>5){
			System.out.println("the number is grater then 5");
		}
		else{
			System.out.println("The number is less then 5");
		}
		*/
		if(x<10){
			System.out.println("the number is lessthen 10");

		}
     if(x>10){
     	System.out.println("The nmber is gratter hen 10");
     }
if(x==10){
	System.out.println("number is equal");
}
if(x==  0){
	System.out.println("number is 0");
}

	}
}