package ttsttsts;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordFrequencyInStringArray {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

        // Count frequencies of each word using Java streams
        Map<String, Long> wordFreqMap = words.stream()
                						.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(wordFreqMap);
        
        wordFreqMap.entrySet().stream()
        					  .forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));       
       
        System.out.println("\n********* Another Method ********************\n");
        // ############################# Another Method #########################
        Map<String, List<String>> wordFreqMap1 = words.stream()
                .collect(Collectors.groupingBy(e->e));
        
        for (Map.Entry map : wordFreqMap1.entrySet()) {
        	System.out.println(map.getKey() + " : " + map.getValue());
		}
        
        //Alternate Method of iterating an Map
        System.out.println("\n*************** Alternate Method of iterating an Map ***********************\n");
        wordFreqMap1.forEach((k,v) -> System.out.println(k + " : "+v));
        
        
    }
}
