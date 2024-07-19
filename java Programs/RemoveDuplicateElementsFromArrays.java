package ttsttsts;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElementsFromArrays {
	public static void main(String[] args) {
	
	int[] array = {1,2,3,4,5,9,555,2,5};

	Set<Integer> set = new HashSet<Integer>();
	for (Integer i : array) {
		set.add(i);     //value adding to set 1 by 1 by it does'nt allow duplicate to add 
	}
	System.out.println(set);
	
	
	}
}
