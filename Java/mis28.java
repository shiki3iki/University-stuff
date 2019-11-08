import java.util.*;


public class mis28 {
    
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       double a,b,c;
       
       System.out.println("Calcular la media todos los numeros ingresados hasta ingresar un negativo");   
       b = 0;
       
       System.out.println("Ingresa un numero a sumar: ");
       a = sc.nextInt();
       b = a+b;
       c = 1;
       while(a >= 0){  
       System.out.println("Ingresa otro numero a sumar: ");
       a = sc.nextInt();

       c++;
       }
        b = b/c;
       System.out.println("El resultado es: " + b);
    }   
}
       
   

