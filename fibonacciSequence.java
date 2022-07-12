
public class fibonacciSequence {
	/**
	 * 
	 * According to the question specification, the index (nth number) starts from 1;
	 * therefore, it is not the index of the sequence from the programming perspective.
	 * Therefore, n below can't be 0, so does the closest index.
	 * 
	 */
	
	
	public static int getFibo(int n) {
		int first = 0;
		int second = 1;
		int next = 0;
		if(n == 1) next = 0;
		else if (n == 2) next = 1;
		else {
			for(int i=1; i<=n-2; i++) {
				next = first + second;
				first = second;
				second = next;
			}
		}
		
		return next;
	}
	
	public static void checkFibo(int num) {
		int i = 1;
		int fibo = 0;
		
		while(fibo < num) {
			i++;
			fibo = getFibo(i);
		}
		
		if(fibo == num) {
			System.out.println("The number is in the Fibonacci sequence, its index is: "+i);
		}
		if(fibo > num) {
			if((fibo-num) < (num-getFibo(i-1))) {
				System.out.println("The number isn't in the Fibonacci sequence, its closest index is: "+i);
			}else {
				System.out.println("The number isn't in the Fibonacci sequence, its closest index is: "+(i-1));
			}
		}
	}
	
	public static void main(String[] args) {
		int target = getFibo(10);
		System.out.println("The 10th number in Fibonacci sequence is: "+target);
		int test = 10;
		checkFibo(test);
	}

}
