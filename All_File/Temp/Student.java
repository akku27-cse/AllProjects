import java.util.*;

class Student{
	public static void main(String[] args) {
		Scanner stud=new Scanner(System.in);
		System.out.println("Enter the number of boys in a class :");
		int boys=stud.nextInt();
		System.out.println("Enter the number of girls in a class :");
		int girls=stud.nextInt();
		System.out.println("total boys Student="+boys);
		System.out.println("total girls Student="+girls);
		int total=boys+girls;
		System.out.println("TOtal girls and boys in a class ="+total);
		float boys1=boys;
		float girls1=girls;
		float total1=total;
		float boys_per=100*boys1/total1;
		float girls_per=100*girls1/total1;
        System.out.println(" Percentage of boys Students:");
        System.out.println(boys_per+"%");
        System.out.println(" Percentage of girls Students:");
        System.out.println(girls_per+"%");


	}
}