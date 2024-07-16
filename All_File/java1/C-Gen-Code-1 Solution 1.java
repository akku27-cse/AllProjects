class C-Gen-Code-1 Solution 1 {
	public static void main (String[] args) {
		int N=5;
		System.out.println(countSteps(N));
	}
	private static int countSteps(int N) {
		if(N==1||N==2)
		{
			return N;
		}
		return countSteps(N - 1) + countSteps(N - 2);
	}  
}