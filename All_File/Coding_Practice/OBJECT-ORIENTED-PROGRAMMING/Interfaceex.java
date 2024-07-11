/*
->1. it is a blueprint of class/
it can not create instance
it is a collection of abstruct method 
()=>it defined interface keyword
*/
// here example of inheritance ====>>>>


interface bank{          // define interafce
	public abstract void pnb(int amount,int credit);
}
interface Govbank{
	public abstract void rbi(int amount,int credit);
}
 class Stategov implements bank,Govbank{
 	public void pnb(int amount,int credit){
int w=amount+credit;
 		System.out.println(w);
 	}
 	public void rbi(int amount,int credit){
 		int y=amount-credit;
 		System.out.println(y);
 	}
 }

 class Interfaceex{
 	public static void main(String[] args) {
 		Stategov st=new Stategov();
 		st.pnb(4000,655);
 		st.rbi(8977,787);
 	}
 }