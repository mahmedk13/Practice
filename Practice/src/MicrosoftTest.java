import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class MicrosoftTest {
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		
		arr.add(5);
		arr.add(6);
		arr.add(8);
		arr.add(4);
		
		Map<String, List<Integer>> map = new HashMap<String, List<Integer>>();
		map.put("one", arr);
		
		Set<String> set = map.keySet();
		
		System.out.println(findNumber(arr, 1));
		
		for(String s: set){
			System.out.println("Key is "+s+" value is "+map.get(s));
			
		}
		
		
	}
	
	
	public static String findNumber(List<Integer> list, int k){
		if(list.contains(k)){
            return "Yes";
        }else{
            return "NO";
        }
		
	}

}
