import java.util.*;


public class mis31 {
    
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       int a, b, c;
       a = 0;
       b = 1;
       c = 0;
       System.out.println("Ingrese 15 numeros que sumar");
       
       while(b != 15){
           System.out.println(b + " numero: ");
           a = sc.nextInt();
           c = a + c;
           b++;
       }
       System.out.println(c);
    }   
}
       
   

