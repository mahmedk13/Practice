import java.util.Arrays;


public class Rough {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Maroof:Khan, Hasnain:Ahmed, Musayb:Babu";
		String[] str = s.split(":");
		System.out.println(Arrays.toString(str));
		System.out.println(str.length);
		
		for(int i =0; i<str.length; i++){
			System.out.println(str[i]);
		}

	}

}
