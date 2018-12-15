import java.util.Arrays;


public class QuickSort {
	
	public static void main(String[] args) {
		
		int a[] = new int[6];
		populateA(a);
		
		System.out.println("Before sorting: "+Arrays.toString(a));
		
		
		quickSortRecursion(a, 0, a.length-1);
		System.out.println("After sorting: "+Arrays.toString(a));

	}
	
	
	public static void populateA(int[] a){
		for(int i=0; i<a.length; i++){
			a[i]= (int) (Math.random()*100);
		}
	}
	
	public static int qucikSortPartitioning(int [] a, int low, int high){
		
		int pivot=a[(low+high)/2];
		
		while(low<=high){
			while(a[low]<pivot){
				low++;
			}
			while(a[high]>pivot){
				high--;
			}
			
			if(low<=high){
				int temp=a[low];
				a[low]=a[high];
				a[high]=temp;
				low++;
				high--;
			}
		}
		
		return low;
		
	}
	
	public static void quickSortRecursion(int[] a, int low, int high){
		int pi=qucikSortPartitioning(a, low, high);
		
		if(low<pi-1){
			qucikSortPartitioning(a, low, pi-1);
		}
		
		if(pi<high){
			qucikSortPartitioning(a, pi, high);
		}
		
		
	}

}
