
public class Main {
	public static void main(String[] args) {
		int n =1;
		while ((1<=n)&&(n<=176)) {
			double x = (double)n*(3.141592/180.0);
			int numberOfAsterisks = (int)((mySine(x)*40.0)+0.5);
			System.out.print("sine("+n+"µµ) :");
			printAsterisks(numberOfAsterisks);
			n+=5;
		}
	}
	private static void printAsterisks(int n) {
		int a = 0;
		while (a < n) {
			System.out.print("*");
			a++;
		}
		System.out.println();
	}
	private static double mySine(double x) {
		double xSquare = x*x;
		double currentTerm = x;
		int n =2;
		double sineValue = currentTerm;
		while(Math.abs(currentTerm)>=0.0000001) {
			currentTerm = -currentTerm*xSquare/(double)(n*(n+1));
			sineValue = sineValue + currentTerm;
			n +=2;
		}
		return sineValue;
		
	}

}
