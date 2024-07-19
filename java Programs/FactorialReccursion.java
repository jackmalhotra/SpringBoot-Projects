package ttsttsts;

public class FactorialReccursion {
	public static void main(String[] args) {
		int fact,num=5;
		fact=fact(num);
	System.out.println(fact);
}

	private static int fact(int num) {
		if(num==1) {
			return 1;
		}
		return num*fact(num-1);
		
	}
        
}

