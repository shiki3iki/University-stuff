import java.util.*;


public class mis27 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       int a,b;
       
       System.out.println("Calcular la media todos los numeros ingresados hasta ingresar un negativo");   
       b = 0;
       
       System.out.println("Ingresa un numero a sumar: ");
       a = sc.nextInt();
       b = a+b;       
       while(a != 0){  
       System.out.println("Ingresa otro numero a sumar: ");
       a = sc.nextInt();
       b = a+b;
       }
       System.out.println("El resultado es: " + b);
    }   
}
       
   

