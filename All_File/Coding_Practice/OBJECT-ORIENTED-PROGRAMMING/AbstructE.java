/*== improtant points :
1. Abstruct class is a colletion of absruct method and non abstruct method.
2. An abstruct class we can not create any instance 
3. abstruct class alwaywes dirived by another class
4. abstruct method cannot be defined in abstruct class
*/
// exapmple: 


abstract class First{
  public abstract void area(int x,int y);
}
class Second extends First{
	public void area(int x,int y){
		int z=x+y;
		System.out.println(z);
	}
}

public class AbstructE{
	public static void main(String[] args) {
		
	
	Second sc=new Second();
	sc.area(3,4);
}
}