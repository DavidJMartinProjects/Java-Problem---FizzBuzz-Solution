
/* 
 ******************************************************************************
 *			FizzBuzz : Java Solution 
 ******************************************************************************
 *
 * Write a program that prints the numbers from 1 to 100. But for multiples of three print “Fizz” 
 * instead of the number and for the multiples of five print “Buzz”.
 * For numbers which are multiples of both three and five print “FizzBuzz”. 
 * 
*/

public class FizzBuzz {
	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			if(i%3 == 0 && i%5 == 0) { // prints "FizzBuzz" for multiples of both three and five
				System.out.println("FizzBuzz");
			} else if(i%3 == 0) { // prints "Fizz" for multiples of three
				System.out.println("Fizz"); 
			} else if(i%5 == 0) { // prints "Buzz" for the multiples of five
				System.out.println("Buzz"); 
			} else {
				System.out.println(i); // print the value of variable i
			}
		}
	}
}
