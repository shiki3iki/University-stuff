import java.util.*;


public class mis6 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       double a, b;
       
       System.out.println("Indicar si el numero es multiplo del otro");
       
       System.out.println("Ingrese el primer numero: ");
       a = sc.nextInt();
         
       System.out.println("Ingrese el segundo numero: ");
       b = sc.nextInt();
       
       if(a%b == 0){
        System.out.println("Son múltiplos");
       }
       else{
        System.out.println("No son múltiplos");
       }
    }
}
       
   

