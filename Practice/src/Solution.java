import java.util.Arrays;


public class Solution {
	
	 static int[] arr= {2, 5, 8, 12, 9, 7, 13, 6, 4};
	 
	
	//code for linear search
	 /*public static int findNum(int[] arr, int k){
		
		for(int i=0; i<arr.length; i++){
			if(arr[i]==k){
				return i;
			}
		}
		return -1;
		
	}*/
	 
	 //code for binary search
	 
	 public static int findNum(int[] arr, int k){
		 Arrays.sort(arr);
			System.out.println(Arrays.toString(arr));

		 
		 int x = arr.length/2;
		 System.out.println("mid index is "+x);
		 
		 if(arr[x]==k){
			 return x;
			 
		 }else if(arr[x]>k){
			 for(int i=0; i<x;i++){
				 if(arr[i]==k){
					 return i;
				 }
			 }
			 
			 
		 }else{
			 for(int i=x+1; i<arr.length;i++){
				 if(arr[i]==k){
					 return i;
				 }
			 }
			 
		 }
		 
		 return x;
		 

		 
	 }
	
	public static void main(String[] args) {

		
		System.out.println(findNum(arr, 5));
	}

}
