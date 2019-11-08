import java.util.*;


public class mis3 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double r, l;
        
        System.out.println("Calcular la longitud de un circulo");
        
        System.out.println("Ingres el radio del circulo: ");
        r = sc.nextInt();
        
        l = 2*Math.PI*r;
        
        System.out.println("La longitud circulo es: " + l);
    }
}

       
   

