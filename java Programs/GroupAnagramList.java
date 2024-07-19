/*
Given an array of strings, group anagrams together.
Anagrams : Two strings are anagrams if both have same characters and count of each character to be same.
In other words, they are shuffled version of one another.
Example – eat, tea, ate are anagrams
Input
Input= ["eat", "tea", "tan", "ate", "nat", "bat"]
Output
Output= [ ["ate", "eat","tea"], ["nat","tan"], ["bat"] ]
*/

import java.util.*;

public class GroupAnagramList {
    
    public List<List<String>> groupAnagrams(String[] strs) {
        // Create a hashmap to store sorted strings as keys and their anagrams as values
        Map<String, List<String>> map = new HashMap<>();
        
        // Iterate through each string in the input array
        for (String str : strs) {
            // Convert the string to a char array, then sort and convert it back to string
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            
            // If the sorted string is already in the hashmap, add the current string to its list
            if (map.containsKey(sortedStr)) {
                map.get(sortedStr).add(str);
            } else {
                // If not present, create a new list and add the current string
                List<String> newList = new ArrayList<>();
                newList.add(str);
                map.put(sortedStr, newList);
            }
        }
        
        // Create a list to hold the result
        List<List<String>> result = new ArrayList<>();
        
        // Add all lists of anagrams from the hashmap to the result list
        for (List<String> list : map.values()) {
            result.add(list);
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        GroupAnagramsSimple solution = new GroupAnagramsSimple();
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> output = solution.groupAnagrams(input);
        System.out.println(output);
    }
}
