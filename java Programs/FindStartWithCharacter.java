package ttsttsts;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindStartWithCharacter {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Anurag","Aman","Ram","Raju");
		
		// We can use any one 
		//1st Way
		System.out.println("1st Way Output");
		list.stream()
		.filter(name->name.startsWith("A"))
		.forEach(System.out::println);
		
		//2nd Way
		System.out.println("2nd Way Output");
		List<String> StartWithA = list.stream()
				.filter(name->name.startsWith("A"))
				.collect(Collectors.toList());
		System.out.println(StartWithA);
	}

}

