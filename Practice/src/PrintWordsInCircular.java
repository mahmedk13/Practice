import java.util.Scanner;


public class PrintWordsInCircular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Make America Great Again";
		String[] arr = s.split(" ");
		
		System.out.println("Enter the index: ");
		Scanner sc = new Scanner(System.in);
		int index = sc.nextInt();
		
		if(index>=0 && index<arr.length){
			for(int i=index; i<arr.length; i++){
				System.out.println(arr[i]+" ");
			}
			
			for(int k=0; k<index; k++){
				System.out.println(arr[k]+" ");
			}
			
			
		}else{
			System.out.println("Index is wrong");
		}
		
				
		
		
		

	}

}
