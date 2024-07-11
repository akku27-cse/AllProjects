// simple inheritance or single inheritance where one relation is allow means one parent child only cad inherit only one child
// extendes is denoted to in heritances
class first{
	void cal(int h,int w){
		int z=h+w;
            System.out.println(z);
	}


}

class Second extends first{
	void show(int c){
		System.out.println(c);
	}
}

class SingleInherit{
	public static void main(String[] args) {
		Second s= new Second();
		s.cal(4,6);
		s.show(7);
	}
}
