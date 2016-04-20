package primer2;

 public class Zadacha2 {
    public static void main(String[] args) {
        int x =5;
        int y =4 ;
       
       int a =(int) (1 + (Math.sin(x+y)*Math.sin(x+y)));
       int b =(int) 1+x^2*y^2;
       int c =(int) (Math.abs(x-2*x/b));
       int d = a/(2+c)+x ;
        
   System.out.println("Ответ="+d);
        
        }
    }

