import java.util.*;


public class mis2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double r, a;
        
        System.out.println("Calcular el area de un circulo");
        
        System.out.println("Ingres el radio del circulo: ");
        r = sc.nextInt();
        
        a = Math.PI*Math.pow(r,2); 
        
        System.out.println("El area del circulo es: " + a);
    }
}

       
   

