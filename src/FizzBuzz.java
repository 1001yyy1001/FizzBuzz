
public class FizzBuzz {
	public static void main(String[] args) {
	        for (int fz = 1; fz <= 100; fz++) {
	            if (fz % 3 == 0 && fz % 5 == 0) {
	                System.out.println("FizzBuzz");
	            }
	            if (fz % 3 == 0 && fz % 5 != 0) {
	                System.out.println("Fizz");
	            }
	            if (fz % 3 != 0 && fz % 5 == 0) {
	                System.out.println("Buzz");
	            }
	            if (fz % 3 != 0 && fz % 5 != 0) {
	                System.out.println(fz);
	            }
	        }
	    }
}