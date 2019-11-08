import java.util.*;


public class mis12 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String a;
        System.out.println("Decir las cifras de un numero entre 0 y 9999 al reves");  
        
        System.out.println("Ingrese el valor del numero: ");
        a = sc.nextLine();
         System.out.println(new StringBuilder(a).reverse().toString());
    }
}
       
   

