import java.util.*;

public class mis37 {
    
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       
       int a;
       
       System.out.println("Muestra la tabla de multiplicar de un numero entre 1 t 10");
       System.out.println("Ingrese el numero: ");
       
       a = sc.nextInt();
       for(int i = 1; i <= 10; i++){
       System.out.println(a +"*"+ i + "=" + a*i);
       }
    }
}
       
   

