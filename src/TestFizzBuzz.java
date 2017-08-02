import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class TestFizzBuzz {

	private FizzBuzz fb;
	
	@Before
	public void setUp() throws Exception {
		fb = new FizzBuzz();
	}

	@Test
	public void testFizzBuzz() {
		
		for(int i = 1; i < 101 ; i++ ){
			
			if(isDivisibleBoth(i))
				assertEquals("FizzBuzz", fb.printFizzBuzz(i));
			
		}
	}
	
	@Test
	public void testFizz() {
		
		for(int i = 1; i < 101 ; i++ ){
			
			if(isDivisibleOnlyBy3(i))
				assertEquals("Fizz", fb.printFizzBuzz(i));
			
		}
	}
	
	@Test
	public void testBuzz() {
		
		for(int i = 1; i < 101 ; i++ ){
			
			if(isDivisibleOnlyBy5(i))
				assertEquals("Buzz", fb.printFizzBuzz(i));
			
		}
	}
	
	@Test
	public void testNumber() {
		
		for(int i = 1; i < 101 ; i++ ){
			
			if(!isDivisibleOnlyBy3(i) && !isDivisibleOnlyBy5(i) && !isDivisibleBoth(i))
				assertEquals(""+i, fb.printFizzBuzz(i));
			
		}
	}
	
	public boolean isDivisibleBoth( int i){
		
		if(i%3 == 0 && i%5 == 0)
			return true;
		
		return false;
	}
	
	public boolean isDivisibleOnlyBy3( int i){
		
		if(!isDivisibleBoth(i) && i%3 == 0)
			return true;
		
		return false;
	}
	
	public boolean isDivisibleOnlyBy5( int i){
		
		if(!isDivisibleBoth(i) && i%5 == 0)
			return true;
		
		return false;
	}

}
