
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IterationMathLib iterationLibrary = new IterationMathLib();
		RecursiveMathLib recursiveLibrary = new RecursiveMathLib();
		
		System.out.println("---- ITERATION ----");
		runTestCode(iterationLibrary);
		System.out.println("---- RECURSION ----");
		runTestCode(recursiveLibrary);
	}

	private static void runTestCode(MathLib library) {
		System.out.println("GCD(4,2) = " + library.gcd(4, 2) + "\n");
		System.out.println("ACK(1,3) = " + library.ack(1, 3) + "\n");
		System.out.println("FIB(10) = " + library.fib(10) + "\n");
		System.out.println("HANOI(2) = " + library.hanoi(2) + "\n");
	}

}
