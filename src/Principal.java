
public class Principal {
	
	public static void main(String[] args){
		
		FizzBuzz fb = new FizzBuzz();
		
		for(int i = 1; i < 101; i++ )
			System.out.println(fb.printFizzBuzz(i));
		
	}

}
