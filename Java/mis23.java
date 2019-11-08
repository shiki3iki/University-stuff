import java.util.*;


public class mis23 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       int a;
       
       System.out.println("Indicar si el numero ingresado es positivo o negativo hasta introducir 0");
       
       a = 100;
       while(a != 0){   
       System.out.println("Ingresa el numero: ");
       
       a = sc.nextInt();
  
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
}
       
   

