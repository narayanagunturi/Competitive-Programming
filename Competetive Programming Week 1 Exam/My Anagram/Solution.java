import java.util.*;
public class Solution{
	public static boolean anagram(String s, String t){
		HashSet<Character>hs = new HashSet<>();
		for (int i = 0 ; i < s.length() ; i++){
			if(s.charAt(i) == ' ')
				continue;
			char lowchar = convertToLowerCase(s.charAt(i));
			// System.out.println(lowchar);
			hs.add(lowchar);
		}

		for (int i = 0 ; i < t.length() ; i++){
			if (t.charAt(i) == ' ')
				continue;
			char lowchar = convertToLowerCase(t.charAt(i));
			if (!hs.contains(lowchar))
				return false;
		}
		return true;
	}
	public static char convertToLowerCase(char c){
		if (c >= 'A' && c <= 'Z'){
			return (char)(((int)c)+32);
		}
		return c;
	}
	public static void main(String[] args) {
		// System.out.println("anagram, nagaram");
		System.out.println(anagram("anagram","nagaram"));
		System.out.println(anagram("Keep","Peek"));
		System.out.println(anagram("Mother In Law","Hitler Woman"));
		System.out.println(anagram("ASTRONOMERS","NO MORE STARS"));
		System.out.println(anagram("Toss","Shot"));
		System.out.println(anagram("joy","enjoy"));
		System.out.println(anagram("Debit Card","Bad Credit"));
		System.out.println(anagram("SiLeNt CAT","LisTen AcT"));
		System.out.println(anagram("Dormitory","Dirty Room"));

	}
}