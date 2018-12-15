
public class ReversePositionOfWordsInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="You are awesome";
		String[] s = str.split(" ");
		
		StringBuffer sb = new StringBuffer();
		for(int i=s.length-1; i>=0; i--){
			sb.append(s[i]);
			sb.append(" ");
			
		}
		
		System.out.println(sb.toString());
		
		

	}

}
