package ttsttsts;

import java.util.Scanner;
public class VovelString {

	public static void main(String[] args) {
		String str = "arjunE";
		str=str.toLowerCase();
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'|| str.charAt(i) == 'e'|| str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
			{
				System.out.print(str.charAt(i));
			}
		}
	}

}