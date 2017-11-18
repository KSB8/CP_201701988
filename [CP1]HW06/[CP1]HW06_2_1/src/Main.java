public class Main {
	
	public static void main(String[] args) {
		int n = 1;
		
		while ((1<=n)&&(n<=176)) {
			double x = (double)n*(3.141592/180.0);
			int numberOfAsterisks = (int)((Math.sin(x)*40.0)+0.5);
			System.out.print("sine("+n+"µµ) : " );
			printAsterisks(numberOfAsterisks);
			n+=5;
		}
		
	}
	private static void printAsterisks(int n) {
		int a = 0;
		while (a<n) {
			System.out.print("*");
			a++;
		}
		System.out.println();
	}

}
