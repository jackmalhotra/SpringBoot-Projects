package ttsttsts;

import java.util.Arrays;
public class SortArrayList {

	public static void main(String[] args) {
	int[] array = {8,7,6,-7,4,4,3,4,32,54,255,25};

	//######## We can use this also #############
	//    Arrays.sort(array);    
	//    System.out.println(Arrays.toString(array));
     
	for(int i=0;i<array.length;i++){
	   for(int j=0;j<array.length;j++){
	        if(array[i]<array[j]){
	            int temp=array[i];
	            array[i]=array[j];
	            array[j]=temp;
	        }
	    }
	}
    
    for(Integer i : array) {
    	System.out.print(i+" ");
    }
	
	}   
}