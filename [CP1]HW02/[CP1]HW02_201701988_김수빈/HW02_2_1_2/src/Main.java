
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b, c;
		double determinant;
		double x1, x2;
		
		a = 1.;
		b = -4.;
		c = 4.;
		
		System.out.println("a = " + a + " b = " + b + " c = " + c);
		determinant = b*b-4*a*c;
		x1 = (-b + Math.sqrt(determinant))/2*a;
		x2 = (-b - Math.sqrt(determinant))/2*a;
		System.out.println("The solution is either " + x1 + " or " + x2);
				
	}

}
