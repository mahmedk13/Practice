
public class TwoTopNumbersInArray {

	public static void main(String[] args) {
		
		int num[] = {5,34,78,2,45,1,99,23};
		int maxTwo =0;
		int maxOne=0;
		
		for(int i=0; i<num.length; i++){
			if(maxOne<num[i]){
				maxTwo=maxOne;
				maxOne = num[i];
				
			}else if (maxTwo<num[i]){
				maxTwo=num[i];
			}
		}
		
		System.out.println(maxOne);
		System.out.println(maxTwo);

	}

}
