import java.util.Scanner;
class Switch{
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int day;
	//	while(1){
		System.out.println("Enter your number of day(1 to 7):");
		day=obj.nextInt();
		switch(day){
			case 1:
			System.out.println("monday");
			break;
			case 2:
			System.out.println("Tuesday");
			break;
			case 3:
			System.out.println("Wednsday");
			break;
			case 4:
			System.out.println("Thrusday");
			break;
			case 5:
			System.out.println("Friday");
			break;
			case 6:
			System.out.println("Saturday");
			break;
			case 7:
			System.out.println("sunday");
			break ;
		   default:
			System.out.println("worng number");
	///p 	}
	}
}
	
}