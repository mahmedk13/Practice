import java.util.ArrayList;
import java.util.List;


public class MicrosoftTest1 {
	public static void main(String[] args) {
		
		System.out.println(oddNumber(3, 9));
		
		
		
	}
	
	
	public static List<Integer> oddNumber(int l, int r){
		List<Integer> list = new ArrayList<Integer>();
        
        for(int i=l; i<=r; i++){
            int k = i%2;
            if(k==1){
                list.add(i);
            }
        }
        
        return list;
}
}
