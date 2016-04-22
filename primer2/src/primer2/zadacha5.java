package primer2;

public class zadacha5 {
	public static void main(String[] args) {
		
		
		int  a,b,c;
		
		
		a=55;
		b=50;
		c=6;
		
		
		double  x1= (double) (-b+(Math.sqrt(b^2-4*a*c)))/(2*a);
		double  x2= (double)(-b-(Math.sqrt(b^2-4*a*c)))/(2*a);
		System.out.println(x1);
		System.out.println(x2);
	}
}
