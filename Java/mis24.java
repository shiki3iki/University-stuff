import java.util.*;


public class mis24 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       int a;
       
       System.out.println("Indicar si el numero ingresado es par o impar hasta introducir 0");
       
       a = 100;
       while(a != 0){   
       System.out.println("Ingresa el numero: ");
       
       a = sc.nextInt();
  
       if((a&1) == 0){
           System.out.println("El numero es par");
       }
       else{
           System.out.println("El numero es impar");
       }
       }
    System.out.println("El numero es cero");
    }
}
       
   

