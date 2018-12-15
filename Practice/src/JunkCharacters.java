
public class JunkCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "(我)的妈妈 testing selenium (我)的妈妈";
		s = s.replaceAll(" ", "abcd");
		System.out.println(s);
		s= s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		s=s.replace("abcd", " ").trim();
		System.out.println(s);
		

	}

}
