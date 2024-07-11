import java.util.Scanner;
import java.text.*;
public class Assigbment2 {

	public static void main(String[] args) {
		
		int numDays;
		double salary = 0.01;
	    double totalSalary = 0.01;
		Scanner keyboard = new Scanner(System.in);
	    NumberFormat df = DecimalFormat.getInstance();
	    df.setMaximumFractionDigits(2);
		System.out.print("Enter the number of days worked: ");
		numDays = keyboard.nextInt();
	    while (numDays < 1){
	    	System.out.print("Enter the number of days worked: ");
			numDays = keyboard.nextInt();
	    }
		System.out.println("Day  " + "   Salary     " + "Total Salary");
		int day = 1;
		while (numDays > 0){
			System.out.println(day + "       $" + salary + "       $" + df.format(totalSalary));
			salary *= 2;
			totalSalary += salary;
			day++;
			numDays--;
		}
	}
}

