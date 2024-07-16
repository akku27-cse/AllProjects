import java.util.Scanner;
class user{
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		String name;
		int id;
		float marks;
		System.out.println("Enter our name");
		name=obj.nextLine();
		System.out.println("Enter your id:");
		id=obj.nextInt();
		System.out.println("enter your Marks:");
		marks=obj.nextFloat();
		System.out.println("name"+name);
		System.out.println("Id"+id);
		System.out.println("marks"+marks);
	}
}