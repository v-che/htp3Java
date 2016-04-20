package primer2;

public class zadacha3 {
	public static void main(String[] args) {
		int x = 5644;
		int y;
		int z;
		int r;
		y = x % 10;
		x = x / 10;		
		System.out.println(y+"-"+x);
		
		z=x % 10;
		x=x/10;
		System.out.println(z+"-"+x);
		
		r=x%10;
		x=x/10;
		System.out.println(r+"-"+x);
		System.out.println("Произведение="+(y*z*r*x));
		
	}

}
