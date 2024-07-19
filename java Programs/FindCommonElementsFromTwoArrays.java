package ttsttsts;

public class FindCommonElementsFromTwoArrays {
	public static void main(String[] args) {
	
	int[] array1 = {1,2,3,4,5,9,555};
	int[] array2 = {1,555,39,8,9,7,8,4,5};	
	
	for (int i=0;i<array1.length;i++) {
		for (int j=0;j<array2.length;j++) {
			if(array1[i]==array2[j]) {
				System.out.print(array1[i]+" ");
			}
		}
	}
	
	}
}
