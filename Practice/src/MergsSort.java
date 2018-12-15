import java.util.Arrays;


public class MergsSort {
	
	public static void main(String[] args) {
		int a[] = new int[10];
		populateA(a);
		
		System.out.println(Arrays.toString(a));
		
		int[] result = merge_sort(a);
		
		
		
		
		System.out.println(Arrays.toString(result));
	}
	
	public static int[] merge_sort(int[] b){
		
		if(b.length<=1){
			return b;
		}
		
		
		int midPoint = b.length/2;
		int[] left = new int[midPoint];
		int[] right;
		
		if(b.length%2==0){
			right= new int[midPoint];
			
		}else{
			right= new int[midPoint+1];
		}
		
		for(int i=0; i<midPoint; i++){
			left[i]=b[i];
		}
		
		int x=0;
		for(int j=midPoint; j<b.length; j++){
			if(x<right.length){
			right[x]=b[j];
			x++;
			}
			
			
		}
		
		left= merge_sort(left);
		right= merge_sort(right);
		
		int[] result = merge(left, right);

		
		
		return result;
		
	}
	
	public static int[] merge(int[] left, int[] right){
		int resultLength = left.length+right.length;
		int[] result = new int[resultLength];
		
		int indexL=0;
		int indexR=0;
		
		int indexRes=0;
		
		while(indexL<left.length|| indexR<right.length){
			if(indexL<left.length && indexR<right.length){
				if(left[indexL]<=right[indexR]){
					result[indexRes]=left[indexL];
					indexL++;
					indexRes++;
					
				}else{
					result[indexRes]=right[indexR];
					indexR++;
					indexRes++;
				}
			}else if(indexL<left.length){
				result[indexRes]=left[indexL];
				indexL++;
				indexRes++;
				
			}else if(indexR<right.length){
				result[indexRes]=right[indexR];
				indexR++;
				indexRes++;
				
			}
		}
		
		return result;
		
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
