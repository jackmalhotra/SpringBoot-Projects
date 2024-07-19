package ttsttsts;
public class DuplicateChar
{
	public static void main(String[] args) {
	String str = new String("creamecec");
	str=str.toLowerCase();
	char[] chars = str.toCharArray();
	System.out.print("Duplicate characters are : ");
	
	for(int i = 0;i<str.length();i++){
		for(int j=i+1; j<str.length();j++) {
			if (chars[i] == chars[j]) {
				System.out.print(chars[j]+" ");
			}
		}
	}
	
	//##################### Best Another method ######################
	Set<Character> set = new HashSet<>();
	Set<Character> duplicates = new HashSet<>();
	System.out.print("\nDuplicate characters are : ");
	for (int i = 0; i < str.length(); i++) {
		char ch = str.charAt(i);
		if (!set.add(ch)) {
			duplicates.add(ch);
		}
	}
	System.out.println(duplicates);

	
  }
}
