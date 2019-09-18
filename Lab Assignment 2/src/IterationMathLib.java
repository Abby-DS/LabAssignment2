
public class IterationMathLib extends MathLib{

	@Override
	public int gcd(int x, int y) {
	
		while(y!=0) {
			if (x>=y && x!=0) { 
				int temp = x;
				x = y;
				y = temp % x;
			}
		}
		return x; //base case
	}

	@Override
	public int ack(int x, int y) {
		while(x!=0) // 1 3 0 2 
		{
			if(y==0) {
				x -= 1; 
				y = 1; 
			}				
			if (x!=0 && y!=0) {
				x -=1;
				y -= 1 ;;
			}
		}
		return y+1;
	}

	@Override
	public int fib(int x) {
		// TODO Auto-generated method stub
		while (x!=0) {
			if (x==1)
				return 1;
			if (x>1)
				return x-1  + x-2;
		}
		return 0;
	}

	@Override
	public int hanoi(int n) {
		while (n!=1)
		{
			if (n>1)
				return 2 * (n-1) + 1;
		}
		return 1;
	}
	
}
