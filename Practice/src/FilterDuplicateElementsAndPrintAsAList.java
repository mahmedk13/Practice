import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class FilterDuplicateElementsAndPrintAsAList {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("maruti");
		list.add("Suzuki");
		list.add("Toyota");
		list.add("Ford");
		list.add("Suzuki");
		list.add("maruti");

		System.out.println("Original list is: \n"+list);
		
		Set<String> set = new HashSet<String>();
		
		Set<String> set1 = new HashSet<String>();
		
		
		for(String s:list){
			if(!set.add(s)){
				set1.add(s);
			}
		}
		
		set1.add("a");
		set1.add("A");
		
		System.out.println("Duplicate list is: \n"+set1);
		
		
		
		
		

	}

}
