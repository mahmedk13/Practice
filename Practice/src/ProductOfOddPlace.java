
public class ProductOfOddPlace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("product is"+sumOfoddPlace(12345678));	
	}
		public static int sumOfoddPlace(long number)
	     {
	        
			
			int maxDigitLength = 8;
	         int sum = 1;
	         for (int i = 0; i < maxDigitLength; i++)
	         {
	             if (i % 2 != 0)
	             {
	            	 int x = (int) (number%10);
	            	 System.out.println(x);
	                 sum =  sum*x;
	                 number =  number/10;

	             }else {
	                 number =  number/10;
	            }

	         }
	         return sum;
	 }

	

}
