package ttsttsts;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamExample{
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,5,3,76,78,6,9,6,98,67,100,56,48,12,9432);	
		System.out.println("Original List : "+list);
		List<Integer> mapfilterList = list.stream()
				.filter(n->n%2==0)   	 		// It filter an stream performs lambda expression
				.map(x->x/2)		  			// It performs lambda expression
				.distinct()			  			// It gives distinct output
				.sorted((a,b)->(b-a)) 			//Sort in desc order we used comparator lambda expression
				.limit(5) 			  			// It shows only 10 data
				.skip(1)              			// It skip last 1 data
				.collect(Collectors.toList()); 	// It collects stream and convert into List
		System.out.println("MapfilterList : "+mapfilterList);
		
		int min = list.stream().min((a,b)->a-b).get(); // It gives minimum value, we used comparator lambda expression
		int max = list.stream().max((a,b)->a-b).get(); // It gives maximum value, we used comparator lambda expression
		long count = list.stream().count();			   // It gives length/counts of elements
		
		List<Integer> parallelStream = list.parallelStream().collect(Collectors.toList()); //It divide your data into chunks and run parallelly
		System.out.println("Min : "+min+", Max : "+max+" , Count: "+count);
		System.out.println("Parallel Stream : "+parallelStream);
		
		
	}
}
