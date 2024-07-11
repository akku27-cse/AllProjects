/*===>notes
1.final veriable cannot be change(its constant)
2.final method can not be override.
3.Final class can not be extends by another class
*/
//ex

class Fi{
	final void run(){
		System.out.println("its a simple example:");

	}
}

class si extends Fi{
	final void run(){
		System.out.println("it second ex");
	}
}

class Finalex{
	public static void main(String[] args) {
		si s=new si();
		s.run();
	}
}