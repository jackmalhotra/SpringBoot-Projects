package ttsttsts;

public class ThirdSecondLargestFromArrayList
{
	public static void main(String[] args) {
	
	 int a[]={8,7,6,4,4,3,4,32,54,255,25};
	 int high=Integer.MIN_VALUE,
		 second=Integer.MIN_VALUE,
		 third=Integer.MIN_VALUE;
	 
	 for(int i : a){
	     if(i>high)
	     {
	         third=second;
	         second=high;
	         high=i;
	     }
	     else if(i>second){
	         third=second;
	         second=i;
	     }
	     else if(i>third){
	         third=i;
	     }
	 }

	System.out.println("\n"+"Largest Value "+high);
	System.out.println("Second Largest Value "+second);
	System.out.println("Third Largest Value "+third);


}

}
