
public class MissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[] = {1, 4, 7, 8, 12, 14};
		int n = arr1.length+1;
		int sum = (n*(n+1))/2;
		System.out.println(sum);
		
		int restSum=0;
		for (int i = 0; i < arr1.length; i++) {
			restSum+=arr1[i];
		}
		
		System.out.println(restSum);
		
		System.out.println(restSum-sum);

	}

}
