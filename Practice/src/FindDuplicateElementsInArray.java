
public class FindDuplicateElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {4, 3, 1, 4, 8, 2, 1};
		System.out.println("duplicate elements are:");
		for(int i =0; i<arr.length; i++){
			for(int j =i+1; j<arr.length; j++){
				if(arr[i]==arr[j]){
					System.out.println(arr[i]);
				}
				
			}
			
		}

	}

}
