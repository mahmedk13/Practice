import java.util.Arrays;


public class InsertionSort {
	
	public static void main(String[] args) {
		int a[] = new int[10];
		populateA(a);
		
		System.out.println("Before sorting: "+Arrays.toString(a));
		
		insertionSort(a);
		
		System.out.println("After sorting: "+Arrays.toString(a));

	}
	
	
	public static void populateA(int[] a){
		for(int i=0; i<a.length; i++){
			a[i]= (int) (Math.random()*100);
		}
	}
	
	public static void insertionSort(int [] a){
		int n = a.length;
		
		for(int i=1; i<n; i++){
			int temp=a[i];
			int j=i;
			while(j>0 && a[j-1]>temp){
				a[j]=a[j-1];
				j=j-1;
			}
			
			a[j]=temp;
		}
	}

}
