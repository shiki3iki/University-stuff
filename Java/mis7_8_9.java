import java.util.*;


public class mis7_8_9 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       int a, b;
       
       System.out.println("Indicar cual es el numero mayor");
       
       System.out.println("Ingrese el primer numero: ");
       a = sc.nextInt();
         
       System.out.println("Ingrese el segundo numero: ");
       b = sc.nextInt();
       
       if(a > b){
        System.out.println(a + " es mayor que " + b);
       }
       else if (a < b){
       System.out.println(b + " es mayor que " + a);
       }
       else {
           System.out.println("Son iguales");
       }
    }
}
       
   

