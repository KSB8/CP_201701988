
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1;
		double x, y;
		
		while ((0<n)&&(n<=180)) {
			
			x = (double)n*(3.141592/180.0);
			y = Math.sin(x);
			System.out.println("sin(" +n+ "도) 는" + y+ "입니다.");
			n++;
		}
	}

}
