package ttsttsts;

import java.util.HashMap;
import java.util.Map;

public class FindFrequenyOfCharacterInString {
	public static void main(String[] args) {
		String str = "abcdabc";
		char[] charry =str.toCharArray();
		
		Map<Character,Integer> map = new HashMap<>();
		for(int i=0;i<str.length();i++)
		{
			char ch=charry[i];
			if(!map.containsKey(ch))
			{
				map.put(charry[i], 1);
			}
			else
			{
				map.put(charry[i], map.get(ch)+1);
			}
		}
		System.out.println(map);
		
	}
        
}

