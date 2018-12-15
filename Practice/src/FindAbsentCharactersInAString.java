import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class FindAbsentCharactersInAString {

	public static void main(String[] args) {
		String str = "Maroof Ahmed Khan";
		str = str.replace(" ", "");
		System.out.println(str);
		String[] s = str.split("");
		
		System.out.println(Arrays.toString(s));
		
		String alphabets[]= "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");
		
		Set<String> s1 = new HashSet<String>(Arrays.asList(s));
		Set<String> s2 = new HashSet<String>(Arrays.asList(alphabets));
		s2.removeAll(s1);
		System.out.println(s2);
		
		
	}

}
