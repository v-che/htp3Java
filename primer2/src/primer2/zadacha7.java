package primer2;

public class zadacha7 {
	public static void main(String[] args){
		  int x = 4;
		  int y = 4;
		
			
			if(x>=0&&x<=4){
				if(y<=4&&y>=0){
					double a =  Math.sqrt(x^2+y^2);
					if(a<=4&&a>=0){
						System.out.println("true");
					}else System.out.println("false");
				
				}else
					System.out.println("false");
			}
			else
				if(x>=0&&x<=5){
					if(y<=0&&y>=-5){
						double a = Math.sqrt(x^2+y^2);
						if(a<=5&&a>=0){
							System.out.println("true");
						}else System.out.println("false");
						
					}else
						System.out.println("false");
				}
				else
					System.out.println("false");
		
		
		
		
		
		}

}
