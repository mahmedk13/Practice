import java.util.Arrays;


public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] A = new int[5];
		populateA(A);
		
		System.out.println("before sorting "+Arrays.toString(A));
		
		bubbleSort(A);
		
		System.out.println("After sorting "+Arrays.toString(A));

	}
	
	public static void bubbleSort(int[] a){
		int n = a.length;
		int temp=0;
		for(int i=0; i<n; i++){
			for(int j=1; j<n-i; j++){
				if(a[j-1]>a[j]){
					 temp = a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
		}
	}
	
	
	public static void populateA(int[] a){
		for(int i=0; i<a.length; i++){
			a[i]= (int) (Math.random()*100);
		}
	}
	
	public static void printA(int[] a){
		for(int i=0; i<a.length; i++){
			System.out.println(a[i]+" ");
		}
	}


}
