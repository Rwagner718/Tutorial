package week1_assignments;
import java.util.Stack;
public class Week1_assignment_24_4 {
	public static void main(String[] args){
		Stack<Integer> stack = new Stack<>();
		Stack<Integer> reversedtack = new Stack<>();
		final int NUMBER_OF_PRIMES = 50;
		final int NUMBER_OF_PRIMES_PER_LINE = 50;
		int count = 0;
		int number = 2;
		
		
		System.out.println("The first 50 prime numbers are \n");
		
		while (count < NUMBER_OF_PRIMES)
	{
		
			boolean isPrime = true;
			
			for (int divisor = 2; divisor <= (number / 2); divisor++) {
				
				if (number % divisor == 0) {
					
					isPrime = false;
					break;
					}
		}
			
			    		if (isPrime) 
			    				
			    		{
			    		count++;
			    		stack.push(number);		
			    		
				
			    		if (count % NUMBER_OF_PRIMES_PER_LINE == 0)
			    			
			   {
					
			    			
				    		System.out.println(stack.pop());
				    		System.out.println(stack.pop());
				    		System.out.println(stack.pop());
				    		System.out.println(stack.pop());
				    		System.out.println(stack.pop());
				    		System.out.println(stack.pop());
				    		System.out.println(stack.pop());
				    		System.out.println(stack.pop());
				    		System.out.println(stack.pop());
				    		System.out.println(stack.pop());
				    		System.out.println(stack.pop());
				    		System.out.println(stack.pop());
				    		System.out.println(stack.pop());
				    		System.out.println(stack.pop());
				    		System.out.println(stack.pop());
				    		System.out.println(stack.pop());
				    		System.out.println(stack.pop());
				    		System.out.println(stack.pop());
				    		System.out.println(stack.pop());
				    		System.out.println(stack.pop());
				    		System.out.println(stack.pop());
				    		System.out.println(stack.pop());
				    		System.out.println(stack.pop());
				    		System.out.println(stack.pop());
				    		System.out.println(stack.pop());
				    		System.out.println(stack.pop());
				    		System.out.println(stack.pop());
				    		System.out.println(stack.pop());
				    		System.out.println(stack.pop());
				    		System.out.println(stack.pop());
				    		System.out.println(stack.pop());
				    		System.out.println(stack.pop());
				    		System.out.println(stack.pop());
				    		System.out.println(stack.pop());
				    		System.out.println(stack.pop());
				    		System.out.println(stack.pop());
				    		System.out.println(stack.pop());
				    		System.out.println(stack.pop());
				    		System.out.println(stack.pop());
				    		System.out.println(stack.pop());
				    		System.out.println(stack.pop());
				    		System.out.println(stack.pop());
				    		System.out.println(stack.pop());
				    		System.out.println(stack.pop());
				    		System.out.println(stack.pop());
				    		System.out.println(stack.pop());
				    		System.out.println(stack.pop());
				    		System.out.println(stack.pop());
				    		System.out.println(stack.pop());
				    		System.out.println(stack.pop());
				    				    			
			   }
			    			    			
			    			
			  }
			    		
			    		
						
			number++;
				
			}
		}
	 }


		


		
		