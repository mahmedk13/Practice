
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial f = new Factorial();
		System.out.println(f.FactorialMethod(6));
		
		

	}
	
	public int FactorialMethod(int n){
		
		if(n==1)
		return 1;
		else{
			int y=FactorialMethod(n-1);
			int x= n*y;
			return x;
		}
			
		
	}

}
