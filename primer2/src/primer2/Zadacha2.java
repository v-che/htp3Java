package primer2;
import java.util.Scanner;
import java.lang.Math;
public class Zadacha2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int y;
        System.out.println("Введите целое число: ");
        x = sc.nextInt();
        y = sc.nextInt();
        
       int a =(int) (1 + (Math.sin(x+y)*Math.sin(x+y)));
       int b =(int) 1+x^2*y^2;
       int c =(int) (Math.abs(x-2*x/b));
       int d = a/(2+c)+x ;
        
   System.out.println("Ответ="+d);
        
        }
    }

