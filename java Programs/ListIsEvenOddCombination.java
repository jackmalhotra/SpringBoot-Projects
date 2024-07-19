package ttsttsts;

import java.util.*;

class ListIsEvenOddCombination {
   public static void main(String[] args) {
	   List<Integer> list = Arrays.asList(1,2,5,7,9);
	   System.out.println("Original List : "+list);
	   
	   boolean evenFlag = true;
	   boolean oddFlag = true;
       
       for (int num : list) {
           if (num % 2 == 0) {
               oddFlag = false; // If an even number is found, set the oddFlag to false
           } else {
               evenFlag = false; // If an odd number is found, set the evenFlag to false
           }
       }
       
       if (evenFlag && !oddFlag) {
           System.out.println("List contains only even numbers.");
       } else if (!evenFlag && oddFlag) {
           System.out.println("List contains only odd numbers.");
       } else {
           System.out.println("List contains a combination of even and odd numbers.");
       }
   }
   
}
