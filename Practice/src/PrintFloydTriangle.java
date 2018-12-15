import java.util.Scanner;


public class PrintFloydTriangle {
	
	public static void main(String[] args){
		
		System.out.println("How many rows you want: ");
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		int k =1;
		for(int i=1; i<=r; i++){
			for(int j=1; j<=i; j++){
				System.out.print(k+" ");
				k++;
				
			}
			System.out.println();
		}
		
		
		
	}

}
