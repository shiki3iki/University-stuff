import java.util.*;


public class mis5 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       double a;
       
       System.out.println("Indicar si el numero ingresado es positivo o negativo");
       
       System.out.println("Ingresa el numero: ");
       
       a = sc.nextDouble();
       
       if(a < 0){
           System.out.println("El numero es negativo");
       }
       else if(a > 0){
           System.out.println("El numero es positivo");
       }
       else{
           System.out.println("El numero es cero");
       }
    }
}
       
   

