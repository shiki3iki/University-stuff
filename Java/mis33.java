import java.util.*;


public class mis33 {
    
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       int a = 1;  
       int b;
       System.out.println("Calcular el factorial de: ");
       b = sc.nextInt();
       for(int i=1;i <= b;i++){    
       a = a*i;    
       }    
    System.out.println("El factorial de "+b+" es: "+a);   
    }   
}
       
   

