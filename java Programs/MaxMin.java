package ttsttsts;

import java.util.Arrays;
import java.util.List;

public class MaxMin {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,56,7,8,9,7,8,4,5,58755);
		
		System.out.print("Max : "+list.stream().max((a,b)->(a-b)).get());
		System.out.println(" Min : "+list.stream().min((a,b)->(a-b)).get());
	
		Integer max=list.get(0);
		Integer min=list.get(0);
		
		for (Integer i : list) {
			if(max<i) {
				max=i;
			}
			else if(min>i) {
				min=i;
			}
		}
		System.out.println("Max : "+max + " " +"Min : "+min);
	}
}
