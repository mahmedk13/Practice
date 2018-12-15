
import java.util.Scanner;

public class MultipleOf3and5 {
	static Integer sum=0;
	
	public static int getMultipleOf3and5(int n){
		for(int i=1; i<n;i++){
			if(i%3==0 || i%5==0){
				sum=sum+i;
				//System.out.println(sum);
			}
		}
		
		return sum;
		
	}
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number: ");
		int n = scan.nextInt();
		System.out.println(getMultipleOf3and5(n));
		scan.close();

	}

}
