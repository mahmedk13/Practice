import java.util.Scanner;


public class PrintEquilateralTriangle {
	
	public static void main(String[] args){
		
		System.out.println("How many rows you want: ");
		Scanner scan = new Scanner(System.in);
		int row = scan.nextInt();
		
		int noOfSpaces = row-1;
		
		for(int rowCounter=1; rowCounter<=row; rowCounter++){
			for(int spaceCounter=0; spaceCounter<noOfSpaces; spaceCounter++){
				System.out.print(" ");
				
			}
			
			noOfSpaces=noOfSpaces-1;
			
			for(int starCounter=0; starCounter<rowCounter; starCounter++){
				System.out.print("* ");
				
			}
			
			System.out.println();
			
			
		}

	}

}
