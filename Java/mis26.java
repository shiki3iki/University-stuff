import java.util.*;


public class mis26 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Ingresar el numero que se debe adivinar: ");
        a = sc.nextInt();
        b = -1;
        while(b != a){
            System.out.println("Ingresa el numero que crees es correcto: ");
            b = sc.nextInt();
            
            System.out.println("Incorrecto vuelve a intentarlo");
        }
        
        System.out.println("Correctco adivinaste");
    }   
}
       
   

