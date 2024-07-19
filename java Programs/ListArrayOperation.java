package ttsttsts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ListArrayOperation {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,4);
		System.out.println("Original List : "+list);
		
		//########### Find Even Data in List/Array ##################
		List<Integer> evenList = new ArrayList<>();
		evenList = list.stream().filter(i->(i%2)==0).collect(Collectors.toList());
		System.out.println("Even Data in Lists : "+evenList);
		
		//########### Find Odd Data in List/Array ##################
		List<Integer> oddList = new ArrayList<>();
		oddList = list.stream().filter(i->(i%2)!=0).collect(Collectors.toList());
		System.out.println("Odd Data in Lists : "+oddList);
		
		//########### Find Duplicate Data in List/Array ##################
		Set<Integer> set = new HashSet<>();
		List<Integer> duplicate = new ArrayList<>();
		duplicate = list.stream().filter(i->!set.add(i)).collect(Collectors.toList());
		System.out.println("Duplicate Data in Lists : "+duplicate);
		
		//########### Sort Data of List/Array ##################
		Collections.sort(list);
		System.out.print("Sorted Array/List Data : ");
		for(Integer i : list) {
	    	System.out.print(i+" ");
	    }
		//########### Merge Two List/Array ##################
		List<Integer> mergedList = new ArrayList<>(evenList);
		mergedList.addAll(oddList);
		System.out.println("\nMerged two List Data : "+mergedList);
		mergedList.forEach(System.out::print);

		
		//########### Finding Frequency of Data in List/Array ##################
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<list.size();i++) {
			int data=list.get(i);
			if(!map.containsKey(data)) {
				map.put(data, 1);
			}
			else {
				map.put(data, map.get(data)+1);
			}	
		}
		System.out.println("\nFrequency of Data in Array/List : "+map);
	}
}
