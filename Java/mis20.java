import java.util.Scanner;

public class mis20 {

    public static void main(String[] args) {
         Scanner reloj=new Scanner (System.in);
        
        int h,m,s; 
 System.out.print("Introduzca hora: ");
 h=reloj.nextInt();
 System.out.print("Introduzca minutos: ");
 m=reloj.nextInt();
 System.out.print("Introduzca segundos: ");
 s=reloj.nextInt();
 
 s ++;

 if (s >= 60)
 {
 s = 0;
 m ++;

 if (m >= 60)
 {
 m = 0;
 h ++;

 if (h>=24)
 h=0;
 }
 }
 System.out.println ("Fecha: "+ h + ":"+ m + ":" + s);
    }   
}
