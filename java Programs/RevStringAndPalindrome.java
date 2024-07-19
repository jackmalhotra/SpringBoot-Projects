package ttsttsts;

import java.util.*;
public class RevStringAndPalindrome {

	public static void main(String[] args) {
		String rev,str1 = "dad";
		
		StringBuilder str2 = new StringBuilder();
		char[] chars = str1.toCharArray();

		for (int i = chars.length-1; i >= 0; i--)
			str2.append(chars[i]);
        
        rev=str2.toString();
		System.out.println("Reverse str1ing is : "+rev);
		
		/* ### Another Method ################
		
		int start = 0;
        int end = chars.length - 1;
		while (start < end) {
           
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;
                // Move the pointers towards each other
                start++;
                end--;
            }
		System.out.println(new String(chars));
		*/
			
		
		/* ### Another Method ################ 
		
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		StringBuilder str2 = new StringBuilder();
		str2=str2.append(str1);
		str2=str2.reverse();
		rev=str2.toString();
		System.out.println("Reverse str1ing is : "+rev);
		*/
		
		
		/* ### Another Method WithOut Effecting Special Symbol ################
        
		while (start < end) {
        		if(!Character.isAlphabetic(charArray[start])) start++;
        		else if(!Character.isAlphabetic(charArray[end])) end--;
        		else {
        			char temp = charArray[start];
                    charArray[start] = charArray[end];
                    charArray[end] = temp;
                    // Move the pointers towards each other
                    start++;
                    end--;
        		}
                
            }
		System.out.println(new String(chars));

		*/
		
	}   
}