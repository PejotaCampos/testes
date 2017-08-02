
public class FizzBuzz {
	
	private int number1, number2;
	
	public FizzBuzz(){
		this.number1 = 3;
		this.number2 = 5;
	}
	
	public String printFizzBuzz(int i){
		
		if(i%this.number1 == 0 && i%this.number2 == 0)
			return "FizzBuzz";
		
		if(i%this.number1 == 0 )
			return "Fizz";
		
		if(i%this.number2 == 0 )
			return "Buzz";
		
		return ""+i;
	}

}
