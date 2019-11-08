import java.util.*;


public class mis25 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       int a,b;
       
       System.out.println("Indicar la cantidad de numeros ingresados no negativos ");   
       b = 0;
       
       System.out.println("Ingresa un numero: ");
       a = sc.nextInt();
              
       while(a > 0){  
       System.out.println("Ingresa otro numero: ");
       a = sc.nextInt();
       b++;
       }
       System.out.println("Se ingresaron: " + b + " numeros");
    }   
}
       
   

